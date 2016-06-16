package com.spy.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Circle implements Shape
{

	private Point center;

	

	public Point getCenter() {
		return center;
	}

	
	@Autowired
	@Qualifier("circle-o")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	//@Qualifier("circle-o")
	public void draw() 
	{
	
		System.out.println("circle drawn");
		System.out.println("("+center.getX()+","+center.getY()+")");
		
	}
	
}
