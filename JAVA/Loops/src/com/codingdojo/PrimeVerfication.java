//Develop a Java program to determine whether a given number is prime or not ,using a for loop.

package com.codingdojo;

import java.util.Scanner;



public class PrimeVerfication 
{
	public void verify()
	{
		System.out.println("Please enter the Number to be verified : ");
		Scanner scanner = new Scanner(System.in);
		
		int number  = scanner.nextInt();
		
		boolean isPrime = true;
		
		if(number <= 1)
			isPrime = false;
		for(int i=2;i<= Math.sqrt(number);i++)
		{
			if(number%i == 0)
			{
				isPrime = false;
				break;
			}
				
		}
	
	
		if(isPrime)
		{
			System.out.println("Given number is prime");
		}
		else 
		{
			System.out.println("Given number is not a prime");
		}
	}
}
	
