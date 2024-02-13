package com.codingdojo;

public class TestOrder {

	public static void main(String[] args) 
	{
		
		// Menu items
        Item item1 = new Item("drip coffee", 1.60);
        Item item2 = new Item("capuccino", 2.45);
        Item item3 = new Item("iced coffee", 2.15);
        Item item4 = new Item("mocha", 3.10);

        
        // 2 unspecified orders
		Order order1 = new Order();
		Order order2 = new Order();
		
		 // 3 named orders
		Order order3 = new Order("Cindhuri");
		Order order4 = new Order("Noah");
		Order order5 = new Order("John");
		
		
		//Add at least 2 items to each of the orders using the addItem method.
		order1.addItem(item4);
		order1.addItem(item3);
		
		order2.addItem(item2);
		order2.addItem(item3);
		
		order3.addItem(item1);
		order3.addItem(item2);
		
		order4.addItem(item4);
		order4.addItem(item3);
		
		order5.addItem(item1);
		order5.addItem(item3);

		
		//Test your getStatusMessage method by setting some orders to ready and printing the messages for each order.
		order3.setReady(true);
		System.out.println(order3.getStatusMessage());
		
		System.out.println(order1.getOrderTotal());
	}

}
