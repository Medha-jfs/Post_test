package order;

import java.util.Map;
import java.util.TreeMap;

public class Customer {
	static Map<Integer, Order> customerMap = new TreeMap<Integer, Order>();
	public static void main(String[] args) 
	{
		try {
			Order order = new Order(100, "Sachin");
			addCustomer(order);
			findCustomer(100);
			
			Order updatedCustomer = new Order(100,"Mona");
			updateCustomer(updatedCustomer);
			
			deleteCustomer(200);
		
		} catch (Exception e) {
			System.out.println("Exception handled!");
		}
		
		
	}
	
	private static void deleteCustomer(int orderId) {
		Order order = (Order)customerMap.get(orderId);
		if(order != null) {
			customerMap.remove(orderId);
			System.out.println("Customer details Deleted");
			System.out.println(customerMap);
		}
		else {
			System.out.println("Customer details not found!");
		}
		
		
	}

	private static void updateCustomer(Order order)
	{
		Order order1 = (Order)customerMap.get(order.orderId);
		if(order1 != null) {
			customerMap.put(order.orderId, order);
			System.out.println("Updated customer's name : " + order);
		}
		else {
			System.out.println("customer name not found!");
		}
		
	}

	private static void addCustomer(Order order) {
		try {
			customerMap.put(order.orderId, order);
			
		} catch (Exception e) {
			System.out.println("Exception Handled");

		
		}
		
	}
	
	
	private static void findCustomer(int orderId) 
	{
		Order order = (Order)customerMap.get(orderId);
		if(order !=  null)
		{
			System.out.println("Customer exists");
		}
		else
		{
			System.out.println("Customer doesn't exist");
		}
		
	}

	
	

}


