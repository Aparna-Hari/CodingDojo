package com.codingdojo;


public class Phone extends Device 
{
	

	public void makeCall() 
	{
		
		this.battery = battery -5;
		System.out.println("Remaining battery after call is :" + this.battery);
		critical();
	}
	public void playGame() 
	{
		if(battery <= 25)
		{
			
			System.out.println("LOW BATTERY, CANT PLAY UNTIL YOU  CHARGE YOUR PHONE");
			
		}
		else 
		{
			this.battery = battery -20;
			System.out.println("Remaining battery after playing a game  is :" + this.battery);
			critical();
		}
	}
	public void charge() 
	{
		this.battery = battery +50;
		System.out.println("Remaining battery after charge is :" + this.battery);
		critical();
	}
	public void critical()
	{
		if(battery <= 10)
		{
			System.out.println("LOW BATTERY, PLEASE CHARGE YOUR PHONE");
		}
	}
	
}
