package com.codingdojo;

public class Item 
{
	private String name;
	private double price;
	private int index;
	
	// CONSTRUCTOR
    // Takes a name and price as arguments and sets them accordingly
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getIndex() 
	{
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	
	
}
