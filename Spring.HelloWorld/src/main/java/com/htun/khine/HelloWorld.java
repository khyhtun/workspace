package com.htun.khine;

public class HelloWorld 
{
	String message;
	
	public HelloWorld(){};
	
	public HelloWorld(String message)
	{
		this.message = message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return this.message;
	}
}
