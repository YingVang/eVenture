package com.example.eventure;
public class StoryInfo {
	private String author;
	private String title;
	private String dateWritten;		//month and year format 112013 for nov 2013
	
	public StoryInfo(String auth, String titl, String dateWrit){	//Constructor
		author=auth;
		title=titl;
		dateWritten=dateWrit;
	}
	
	//setters and getters 
	public String getAuthor(){return author;}
	
	public String getTitle(){return title;}
	
	public String getDateWritten(){return dateWritten;}
	
	public void setAuthor(String a){author=a;}
	
	public void setTitle(String t){title=t;}
	
	public void setDateWritten(String d){dateWritten=d;}
	
	
	
	
}
