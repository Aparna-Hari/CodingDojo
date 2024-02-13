package com.codingdojo;

import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava 
{
	
	//Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.
	public ArrayList<Integer> getTenRolls()
	{
		
		
		ArrayList<Integer> random10 = new ArrayList<Integer>();
		
		Random random = new Random();
		
		for (int i=1; i<= 10;i++)
		{
			random10.add(random.nextInt(21));
		}
		System.out.println(random10);
		return random10;
		
	}
	
	
	// Write a method that will:

	//Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values).
	//Generate a random index between 0-25 and use it to pull a random letter out of the array.
	//Return the random letter.
	
	 public String getRandomLetter() 
	 {

	        Random rand = new Random();
	        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
	        char randomChar = alphabetString.charAt(rand.nextInt(26));
	        System.out.println(randomChar);
	        return String.valueOf(randomChar);
	    }

}
