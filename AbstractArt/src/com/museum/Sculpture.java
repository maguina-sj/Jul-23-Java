package com.museum;

public class Sculpture extends Art {
	
	private String material;


	public Sculpture(String title, String author, String description, String material) {
		this.title= title;
		this.author = author;
		this.description = description;
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void viewArt() {
		System.out.format("I am spectating a beautiful Sculpture that is called %s \n", this.title);
		
	}

	
}
