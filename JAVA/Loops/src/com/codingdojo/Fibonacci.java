//Implement a Java program to display the Fibonacci series up to N terms using a for loop, where N is provided by the user.

//The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
package com.codingdojo;

import java.util.Scanner;

public class Fibonacci 
{
	public void generateFibonacci()
	{
		System.out.println("Please enter the N : ");
		Scanner scanner = new Scanner(System.in);
		
		int N  = scanner.nextInt();
		
		int firstNumber = 0;
		int secondNumber =1;
		
		System.out.print(firstNumber +","+ secondNumber +",");
		
		for(int i=2; i< N ;i++)
		{
			int nextNumber = firstNumber + secondNumber;
			System.out.print(nextNumber + ",");
			
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
	}
}
