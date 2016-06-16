package com.spy.service;

import com.spy.aspect.Loggable;

public class Circle 
{
	private String name;

	@Loggable
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
		
		//System.out.println("setter method is called");
		// int a=5/0;
	   
	}
	
	
	/*public String setStringname(String name)
	{
		
		System.out.println("String arg run");
		
		return name;
		
	}*/
}
