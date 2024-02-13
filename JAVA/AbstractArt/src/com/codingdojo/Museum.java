package com.codingdojo;

import java.util.ArrayList;
import java.util.Collections;

public class Museum {

	public static void main(String[] args) 
	{
		System.out.println("Paintings are: ");
		Painting painting1 = new Painting("MonaLisa" , "Leonardo" ,"archetypal masterpiece of the Italian Renaissance", "Acrylic");
		Painting painting2 = new Painting("Creation of Adam" , "Michelangelo" ,"Biblical creation narrative from the Book of Genesis " , "Watercolor");
		Painting painting3 = new Painting(" The starry night" , " Vincent Van" ,"it depicts the view from the east-facing window of his asylum room at Saint-Rémy-de-Provence " ,"oil painting");
		
		System.out.println("Sculptures are: " );
		Sculpture sculpture1 = new Sculpture("Statue of Liberty","Gustave Eiffel " ,"is a colossal neoclassical sculpture on Liberty Island in New York Harbor in New York City, United States" ,"metal");
		Sculpture sculpture2 = new Sculpture("The thinker" , "Auguste Rodin " ,"is a naked man sitting on a pedestal with his chin resting on his hand in deep thought","bronze ");
		
		
		// Store the paintings and sculptures inside of an ArrayList called museum.
		ArrayList<Art> museum = new ArrayList<Art>();
		museum.add(0,painting1);
		museum.add(1,painting2);
		museum.add(2,painting3);
		museum.add(3,sculpture1);
		museum.add(4,sculpture2);
		
		//Shuffle and print the information for each artwork in the museum.
		
		System.out.println("Shuffled arts : ");
		Collections.shuffle(museum);
		
		for(Art artWork : museum)
		{
			artWork.viewArt();
			System.out.println("-----------------------------");
		}
	}

}
