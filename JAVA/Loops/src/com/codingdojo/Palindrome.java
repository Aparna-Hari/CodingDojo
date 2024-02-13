//Write a Java program to check if a given number is a palindrome or not using a for loop.
package com.codingdojo;

import java.util.Scanner;

public class Palindrome 
{
	public void calculatePalindrome()
	{
		
		boolean isPalindrome = true;
		System.out.println("Please enter the number str : ");
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		
		for(int i=0;i< str.length()/2;i++)
		{
			if(str.charAt(i)!= str.charAt(str.length()-1-i))
			{

				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome)
		{
			System.out.println(str + "is a palindrome");
		}
		else 
		{
			System.out.println(str + "is not a palindrome");
		}
		
		
		
		scanner.close();
	}
}
