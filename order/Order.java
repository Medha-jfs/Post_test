
package order;

public class Order extends specialOrder {
	
	public int orderId;
	public String orderItem;
	//public int orderQuantity;
	
	public Order (int orderId, String orderItem)
	{
		super();
		this.orderId = orderId;
		this.orderItem = orderItem;
		//this.orderQuantity = orderQuantity;
		
	}
	

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderItem=" + orderItem  + super.toString() + "]";
	}


	@Override
	public void confirm()
	{
		System.out.println("Your order is confirmed and will be delivered");
	}
	
	@Override
	public void close()
	{
		System.out.println("Your order is successfully placed. Go back to shopping");
	}
	
	@Override
	public void dispatch()
	{
		System.out.println("Your order is shipped and will be received by 15,jan");
	}
	
	@Override
	public void confirm1() 
	{
		System.out.println("Your order is confirmed");
	}
	
	
	public void close1() {
		System.out.println("Go back to shopping");
	}
	
	public void dispatch1() {
		System.out.println("Your order is dispatched");
	}
	
	public void receive1() {
		System.out.println("Your order is delivered");
	}
	
	
	
	

}
