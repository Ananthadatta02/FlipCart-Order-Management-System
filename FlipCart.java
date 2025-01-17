package collection_project_filpcart_order.management.system;

public class FlipCart 
{
	private String orderId;
	private String productName;
	private String customerName;
	private int productQuantity;
	private double productPrice;
	public FlipCart(String orderId, String productName, String customerName, int productQuantity, double productPrice) 
	{
		this.orderId = orderId;
		this.productName = productName;
		this.customerName = customerName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() 
	{
		return "\033[38;5;13m" + "FilpCart [orderId=" + orderId + ", productName=" + productName + ", customerName=" + customerName
				+ ", productQuantity=" + productQuantity + ", productPrice=" + productPrice + "]\n" + "\u001B[0m";
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getOrderId() {
		return orderId;
	}
	
}