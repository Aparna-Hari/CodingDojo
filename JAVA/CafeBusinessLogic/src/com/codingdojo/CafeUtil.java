package com.codingdojo;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil 
{
	//Implement the getStreakGoal method and test.
	public int getStreakGoal( )
	{
		int numWeeks = 10;
		int drinks,sum = 0;
		for (drinks = 0;drinks <= numWeeks; drinks++)
		{
			sum= sum + drinks;
			
		}
		
		System.out.println("Minimum purchases needed by week 10 : " +  sum);
		return drinks;
	}
	
	//Implement the getOrderTotal method and test.
	public double getOrderTotal(double[] prices)
	{
		double[] priceList = {3.5,1.5,4.0,4.5};
		
		double total = 0;
		
		for(int price=0;price<priceList.length; price++)
		{
			total = total + priceList[price];
		}
		System.out.println("Order total is : " +  total);
		return total;
	}
	
	//Implement the displayMenu method and test.
	void displayMenu(ArrayList<String> menuItems)
	{
		ArrayList<String> menu = new ArrayList<String>();
		menu.add( "DripCoffee");
		menu.add( "Cappucino");
		menu.add( "Latte");
		menu.add( "Mocha");
		
		for(String m :menu)
		{
			System.out.println(m);
		}
		
	}
	
	//Implement the addCustomer method and test.
	void addCustomer(ArrayList<String> customers)
	{
		
		ArrayList<String> customerList =  new ArrayList<String>();
		
		for (int i= 0;i<4;i++)
		{
		System.out.println("Please enter your name :");
		
		Scanner scan = new Scanner(System.in);
		String username = scan.nextLine();
		
		System.out.println("Hello " + username);
		
		System.out.println("There are " +customerList.size() + " people in front of you");
		
		customerList.add(username);
		System.out.println(customerList);
		}
		
	}
	
	
	
}
