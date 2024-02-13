//Sum of Even Numbers:
//Write a Java program that calculates the sum of all even numbers from 1 to N using a for loop, 
//where N is provided by the user.package com.codingdojo;


package com.codingdojo;

import java.util.Scanner;

public class SumOfEvenNumbers 
{
	public void calculate()
	{
		System.out.println("Please enter the N :");
		
		Scanner scan = new Scanner(System.in);
		
		int N= scan.nextInt();
		int sum=0;
		
		for(int i=1;i<= N; i++)
		{
			if(i%2 == 0)
			{
				sum= sum +i;
			}
			
		}
		System.out.println(sum);
	}
}


