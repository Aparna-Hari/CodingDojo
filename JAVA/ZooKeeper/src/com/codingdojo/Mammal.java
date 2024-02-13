package com.codingdojo;

public class Mammal 
{
	private int energy;
	
	
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public Mammal()
	{
		this.energy = 100;
	}
	
	public void displayEnergy()
	{
		System.out.println("Energy level is : " +energy);
	}

}
