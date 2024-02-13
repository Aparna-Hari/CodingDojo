package com.codingdojo;

public class Bat extends Mammal 
{
	public Bat()
	{
		setEnergy(300);
	}
	
	public void fly()
	{
		setEnergy(getEnergy()-50);
		System.out.println("Bat's energy has decreased to : " + getEnergy() + " after flying.." );
	}
	
	public void eatHumans()
	{
		setEnergy(getEnergy() +25);
		System.out.println("Bat's energy has increased to : " + getEnergy() + " after eating Humans.." );
	}
	
	public void attackTown()
	{
		setEnergy(getEnergy() -100);
		System.out.println("Bat's energy has decreased to : " + getEnergy() + " after attacking the town.." );
	}
	
	

}
