package com.codingdojo;


public class TestOrders {

	public static void main(String[] args) 
	{
		
		//Menu items
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		Item item4 = new Item();
		
		item1.name = "mocha";
		item1.price = 3.4;
		
		item2.name = "latte";
		item2.price = 2.8;
		
		item3.name = "drip coffee";
		item3.price = 1.9;
		
		item4.name = "capucciono";
		item4.price = 3.2;
		
		
		//Order variables
		Order order1 = new Order();
		Order order2 = new Order();
		Order order3 = new Order();
		Order order4 = new Order();
		
		order1.name = "Cindhuri";
		order2.name = "Jimmy";
		order3.name = "Noah";
		order4.name = "Sam";
		
		//System.out.println(order1.total);
		
		//Add item1 to order2's item list and increment the order's total.
		
		order2.items.add(item1);
		order2.total += item1.price;
		
		//Noah ordered a cappuccino. Add the cappuccino to their order list and to their tab.
		order3.items.add(item4);
		order3.total += item4.price;
		
		//Sam added a latte. Update the order accordingly.
		order4.items.add(item2);
		order4.total += item2.price;
		
		//Sam ordered more drinks - 2 lattes. Update their order as well.
		order4.items.add(item2);
		order4.items.add(item2);
		order4.total += 2*item2.price;
		
		order2.ready = true;
		
		// Use this example code to test various orders' updates
        System.out.println("Name:"+ order1.name);
        System.out.println("Total:"+order1.total);
        System.out.println("Ready: "+ order1.ready);
        
        System.out.println("Name:"+ order2.name);
        System.out.println("Total:"+order2.total);
        System.out.println("Ready: "+ order2.ready);
        
        System.out.println("Name:"+ order3.name);
        System.out.println("Total:"+order3.total);
        System.out.println("Ready: "+ order3.ready);
        
        System.out.println("Name:"+ order4.name);
        System.out.println("Total:"+order4.total);
        System.out.println("Ready: "+ order4.ready);

        
		
	}

}
