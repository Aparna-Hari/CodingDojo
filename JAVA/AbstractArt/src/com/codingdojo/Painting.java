package com.codingdojo;

public class Painting extends Art
{
	private String paintType;
	
	
	
	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	public Painting(String title,String author,String desription,String paintType)
	{
		super(title, author, desription);
		this.paintType = paintType;
		viewArt();
		System.out.println("----------------------");
	}
	
	void viewArt()
	{
		System.out.println(" Title: " + this.getTitle() + "\n" +
							" Author : " + this.getAuthor() + "\n" + 
							" Desription : " + this.getDescription() + "\n" +
							" PaintType : "  + this.paintType );
	}

	
}
