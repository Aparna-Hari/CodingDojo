package com.codingdojo;

import java.util.ArrayList;

public class Order 
{
	private String name;
	private boolean ready;
	private ArrayList<Item> items = new ArrayList<Item>(); ;
	
	// CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
	public Order()
	{
		this.name ="Guest";
		ArrayList<Item> items = null;
	}
	
	// OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
	public Order(String name)
	{
		this.name =name;
		this.items = new ArrayList<Item>();
	}

	//Setters and Getters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isReady() {
		return ready;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	//Implement addItem method
	public void addItem(Item item)
	{

		items.add(item);
	}
	
	////Implement getStatus method
	public String getStatusMessage()
	{
		if(this.ready)
		{
			return  "Your order is ready";
		}
		else 
		{
			return "Thank you for waiting! your order will be ready soon..";
		}
			
	}
	
	////Implement getOrderTotal method
	public double getOrderTotal()
	{
		double total = 0;
        for(Item item : items)
        {
            total += item.getPrice();
        }
        return total;
	}
	
	public void display() 
	{
		System.out.println("Name: " +this.name);
		for(Item item : items)
		{
            System.out.println(item.getName()+" - $"+item.getPrice()+ " ");
        }
        System.out.println("Total: $"+getOrderTotal());
		
	}

}
