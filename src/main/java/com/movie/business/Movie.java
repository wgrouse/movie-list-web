package com.movie.business;

public class Movie {
	private String title;
	private int year;
	
	public Movie(String title, int year) {
		super();
		this.title = title;
		this.year = year;
	}

	public Movie() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
