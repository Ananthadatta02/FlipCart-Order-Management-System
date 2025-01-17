package collection_project_filpcart_order.management.system;

public class FlipCart_MainClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		FlipCart_Factory factory = new FlipCart_Factory();
		factory.animateString("____Welcome To FlipCart Factory____");
		factory.animateString("---Login to the Application---");
		boolean status = factory.login();
		if(status)
		{
			while(true)
			{
				int choice = factory.menu();
				switch(choice)
				{
				case 1 : { factory.addOrder(); }break;
				case 2 : { factory.removeOrder(); }break;
				case 3 : { factory.updateOrder(); }break;
				case 4 : { factory.displayOrders(); }break;
				case 5 : { factory.SearchOrder(); } break;
				case 6 : {System.err.println("---Exiting---");} System.exit(0);
				}
			}
		}
	}
}
