package com.museum;

public class Painting extends Art {

	private String paintType;

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}

	public Painting(String title, String author, String description, String paintType) {
		this.title= title;
		this.author = author;
		this.description = description;
		this.paintType = paintType;
	}

	public void viewArt() {
		System.out.format("I am spectating a lovely painting that is called %s \n", this.title);
	}
	
}
