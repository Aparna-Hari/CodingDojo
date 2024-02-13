//Create a Java program that calculates the factorial of a given number using a while loop.

package com.codingdojo;

import java.util.Scanner;

public class FactorialCalculation 
{
	
	
	public void calculate1()
	{
		
		System.out.println("Please enter N :");
		
		Scanner scan = new Scanner(System.in);
		
		int N= scan.nextInt();
		
		int i=1;
		int fact =N;
		
		while(i < N)
		{
			fact = fact * (N-i);
			
			i++;
		}
		System.out.println(fact);
		
	}
}
