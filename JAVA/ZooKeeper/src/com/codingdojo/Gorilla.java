package com.codingdojo;

public class Gorilla extends Mammal 
{
	public Gorilla()
	{
		super();
	}
	public void throwSomething()
	{
		setEnergy(getEnergy()-5);
		System.out.println("Gorilla's energy has decreased to : " + getEnergy() + " after throwing ." );
	}
	
	public void eatBananas()
	{
		setEnergy(getEnergy() + 10); 
		System.out.println(" Gorilla's energy has increased to : " + getEnergy() + " after eating bananas .");
		
	}
	
	public void climb()
	{
		setEnergy(getEnergy()-10);
		System.out.println(" Gorilla's energy has decreased to : " + getEnergy() + " after climbing the tree .");
		
	}
	
	
}
