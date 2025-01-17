package collection_project_filpcart_order.management.system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FlipCart_Factory
{
    Scanner s = new Scanner(System.in);
    List<FlipCart> list = new ArrayList<FlipCart>();
    
    public boolean login()
    {
        System.out.println("\033[38;5;45m" + "Enter the 10 digit Mobile Number.." + "\u001B[0m");
        System.out.print("\033[38;5;120m");
        long mobileNumber = s.nextLong();
        System.out.print("\u001B[0m");
        boolean status = false;
        if(mobileNumber > 6000000001l && mobileNumber < 9999999991l)
        {
            int generatedOTP = generateOTP();
            System.out.println("\033[38;5;214m" + "Your OTP : " + generatedOTP);
            
            System.out.println("\033[38;5;120m" + "Enter the OTP" + "\u001B[0m");
            System.out.print("\033[93m");
            int enteredOTP = s.nextInt();
            System.out.print("\u001B[0m");
            if(enteredOTP == generatedOTP)
            {
                System.out.println("\033[38;5;45m" + "Login Successfull..👍👍" + "\u001B[0m");
                status = true;
            }
            else        
                System.err.println("Invalid OTP..👎👎");
        }
        else
        {
            System.err.println("\u001B[1m" +"Invalid Mobile Number..❌❌");
            System.err.println("The Number Must Contain 10 digits..OR..Mobile Number Should Start With (6, 7, 8, 9)" + "\u001B[0m");
        }
        return status;
    }
    
    public int generateOTP()
    {
        Random random = new Random();
        int otp = random.nextInt(1000, 9999); // random.nextInt(9999);
        return otp;
    }
    
    public int menu()
    {
        System.out.print("\033[38;5;103m");
        System.out.println("1. Add Order");
        System.out.println("2. Remove Order");
        System.out.println("3. Update the Order Details");
        System.out.println("4. Display all the Orders");
        System.out.println("5. Search a Order");
        System.out.println("6. Exit");
        System.out.print("\u001B[0m");
        int choice = s.nextInt();
        s.nextLine();
        return choice;
    }
    
    public void addOrder()
    {
        System.out.println("\033[38;5;103m" + "Enter the OrderId" + "\u001B[0m");
        String orderId = s.next();
        System.out.println("\033[38;5;103m" + "Enter the Product Name" + "\u001B[0m");
        String productName = s.next();
        System.out.println("\033[38;5;103m" + "Enter the Customer Name" + "\u001B[0m");
        String customerName = s.next();
        System.out.println("\033[38;5;103m" + "Enter the Product Quantity" + "\u001B[0m");
        int productQuantity = s.nextInt();
        System.out.println("\033[38;5;103m" + "Enter the Product Price" + "\u001B[0m");
        double productPrice = s.nextDouble();
        list.add(new FlipCart(orderId, productName, customerName, productQuantity, productPrice));
        System.out.println("\033[38;5;120m" + "Order Added Successfully...👍👍" + "\u001B[0m");
    }
    
    public void displayOrders()
    {
        Iterator<FlipCart> flipcartIterator = list.iterator();
        if(!(flipcartIterator.hasNext()))
            System.err.println("No Orders Present To Display In Your Cart..🤷‍♂️🤷‍♂️");
        else
        {
        	System.err.println("....................Displaying All the Orders Present....................");
	        System.out.println("\033[38;5;214m" + "\u001B[1m");
			System.out.printf("%50s","==||  FlipCart Factory  ||==");
			System.out.println("\u001B[0m");
			System.out.println("\033[38;5;120m" + "|---------|---------------|--------------|---------|-----------|" + "\u001B[0m" + "\033[38;5;45m");
			System.out.printf("%-10s %-15s %-14s %-9s %-15s", "OrderId", "Product-Name", "Customer-Name", "Quantity", "Price");
			System.out.println("\u001B[0m");
			System.out.println("\033[38;5;120m" + "|---------|---------------|--------------|---------|-----------|" + "\u001B[0m");
			for(FlipCart flipcart : list)
	        {
				System.out.print("\033[93m");
	            System.out.printf("%-10s %-15s %-14s %-9s %-15s",flipcart.getOrderId(),flipcart.getProductName(),flipcart.getCustomerName(),flipcart.getProductQuantity(),flipcart.getProductPrice());
	            System.out.println("\u001B[0m");
	            System.out.println("\033[38;5;120m" + "|---------|---------------|--------------|---------|-----------|" + "\u001B[0m");
	        }
			System.out.println();
        }
    }
    
    public void removeOrder()
    {
        Iterator<FlipCart> flipcartIterator = list.iterator();
        if(flipcartIterator.hasNext())
        {
            System.out.println("\033[38;5;103m" + "Enter the OrderId" + "\u001B[0m");
            String orderId = s.next();
            System.out.println("\033[38;5;103m" + "Enter the Product Name" + "\u001B[0m");
            String productName = s.next();
            System.out.println("\033[38;5;103m" + "Enter the Customer Name" + "\u001B[0m");
            String customerName = s.next();
        
            boolean status = false;
            while(flipcartIterator.hasNext())
            {
                FlipCart flipcart = flipcartIterator.next();
                if(flipcart.getOrderId().equalsIgnoreCase(orderId) 
                        && flipcart.getProductName().equalsIgnoreCase(productName)
                        && flipcart.getCustomerName().equalsIgnoreCase(customerName))
                {
                    flipcartIterator.remove();
                    status = true;
                    break;
                }
            }
            if(status)
                System.out.println("\033[105m" + "FlipCart Order Removed Successfully..✔✔" + "\u001B[0m");
            else
                System.err.println("FlipCart Order Not Found For the Entered Details..❌❌");
        }
        else
            System.err.println("No Orders Present In Your Cart..🤷‍♂️🤷‍♂️");
    }
    
    public void updateOrder()
    {
    	Iterator<FlipCart> flipcartIterator = list.iterator();
        if(!(flipcartIterator.hasNext()))
            System.err.println("No Orders Present To Update Your Cart..🤷‍♂️🤷‍♂️");
        else
        {
        	System.out.println("\033[38;5;103m" + "Enter the OrderId" + "\u001B[0m");
            String orderId = s.next();
            System.out.println("\033[38;5;103m" + "Enter the Product Name" + "\u001B[0m");
            String productName = s.next();
            System.out.println("\033[38;5;103m" + "Enter the Customer Name" + "\u001B[0m");
            String customerName = s.next();
            boolean status = false;
            for(FlipCart flipcart : list)
            {
                if(flipcart.getOrderId().equalsIgnoreCase(orderId) 
                        && flipcart.getProductName().equalsIgnoreCase(productName)
                        && flipcart.getCustomerName().equalsIgnoreCase(customerName))
                {
                    System.out.println("\033[38;5;214m" + "Order Found.." + "\u001B[0m");
                    
                    System.out.println("\033[38;5;45m" + "Update the New Product Quantity" + "\u001B[0m");
                    int newProductQuantity = s.nextInt();
                    flipcart.setProductQuantity(newProductQuantity);
                    System.out.println("\033[38;5;45m" + "Update the Product Price" + "\u001B[0m");
                    double newProductPrice = s.nextDouble();
                    flipcart.setProductPrice(newProductPrice);
                    status = true;
                    System.out.println("\033[38;5;45m" + "\033[38;5;102m" + "Order is Updated Successfully..✌✌" + "\u001B[0m");
                    System.out.println(flipcart);
                    break;
                }
            }
            if(!status)
                System.err.println("Order Not Found For the Entered Details..❌❌");
        }
    }
    
    public void SearchOrder()
    {
    	Iterator<FlipCart> flipcartIterator = list.iterator();
        if(!(flipcartIterator.hasNext()))
            System.err.println("No Orders Present To Search In Your Cart..🤷‍♂️🤷‍♂️");
        else
        {
        	System.out.println("\033[38;5;103m" + "Enter Order ID" + "\u001B[0m");
            String orderId = s.next();
            System.out.println("\033[38;5;103m" + "Enter the Product Name" + "\u001B[0m");
            String productName = s.next();
            boolean status = false;
            for(FlipCart flipcart : list)
            {
                if(flipcart.getOrderId().equalsIgnoreCase(orderId) 
                        && flipcart.getProductName().equalsIgnoreCase(productName))
                {
                    System.out.println("\033[38;5;214m" + "Order Present For the Id--> '" + orderId + "' & Product Name--> '" + productName + "'\u001B[0m");
                    status = true;
                    System.out.println(flipcart);
                    break;
                }
            }
            if(!status)
                System.err.println("Order Not Found For the Entered Details..❌❌");
        }
    }
    
    public void animateString(String string) throws InterruptedException
    {
        for (int i = 0; i < string.length(); i++) 
        {
            System.out.print("\u001B[1m" + "\033[38;5;13m" + string.charAt(i) + "\u001B[0m");
            Thread.sleep(100);
        }
        System.out.println();
    }
}
