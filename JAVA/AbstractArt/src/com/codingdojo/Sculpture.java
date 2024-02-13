package com.codingdojo;

public class Sculpture extends Art {

	private String material;
	
	
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Sculpture(String title,String author,String desription,String material)
	{
		super(title, author, desription);
		this.material = material;
		viewArt();
		System.out.println("-----------------------------");
	}
	
	void viewArt()
	{
		System.out.println(" Title: " + this.getTitle() + "\n" +
							" Author : " + this.getAuthor() + "\n" + 
							" Desription : " + this.getDescription() + "\n" +
							" Material : "  + this.material );
	}


}
