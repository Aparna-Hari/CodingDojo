package com.codingdojo;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.HiddenAction;

public class CoffeeKiosk {

	
		private ArrayList<Item> menu ;
		private ArrayList<Order> orders ;

		public CoffeeKiosk() 
		{
			this.menu = new ArrayList<Item>();
			this.orders = new ArrayList<Order>();
		
		}
		
		public void addMenuItem(String name,double price)
		{
			Item newItem = new Item(name,price);
			menu.add(newItem);
			newItem.setIndex(menu.indexOf(newItem));
			
		}
		
		public void display()
		{
			for(Item item: menu)
			{
				System.out.println(item.getIndex() +" "+ item.getName() + " $-"+ item.getPrice());
			}
		}
		
		public void newOrder()
		{
			// Shows the user a message prompt and then sets their input to a variable, name
	        System.out.println("Please enter customer name for new order:");
	        
	        Scanner scanner = new Scanner(System.in);
	        String name = scanner.next();
	        
	        
	        
	     // Your code:
	        // Create a new order with the given input string
	        // Show the user the menu, so they can choose items to add.
	        Order order = new Order(name);
	        
	        System.out.println("Hi " + name +", Please choose from below menu:" );
	        display();
	        
	     // Prompts the user to enter an item number
	        System.out.println("Please enter a menu item index or q to quit:");
	        
	        Scanner scan = new Scanner(System.in);
	        String itemNumber = scan.next();
	        
	     // Write a while loop to collect all user's order items
	        while(!itemNumber.equals("q")) 
	        {
	            
	            // Get the item object from the menu, and add the item to the order
	        	
	        	try
	        	{
	        		order.addItem(menu.get(Integer.parseInt(itemNumber)));
	        	}
	        	catch(IndexOutOfBoundsException i){
	                System.out.println("Invalid selection");
	            }catch(NumberFormatException n)
	        	{
	                System.out.println("Invalid selection");
	            }
	        	
	        	// Ask them to enter a new item index or q again, and take their input
	        	System.out.println("Please enter a menu item index or q to quit:");
		        
		        Scanner scanner1 = new Scanner(System.in);
		        itemNumber = scanner1.next();
	            
	        }
	     
	        // After you have collected their order, print the order details 
	        order.display();
	        
		}
}
