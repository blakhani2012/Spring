package com.spy;

import java.awt.font.ShapeGraphicAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spy.service.ShapeService;

public class Aopmain 
{
	public static void main(String[] args) 
	{
	
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		ShapeService shapeservice=(ShapeService)context.getBean("shapeservice");
		
	    //shapeservice.getCircle().setName("circleNAme");
	  	//shapeservice.getCircle().setStringname("circle..");
		
	    System.out.println(shapeservice.getCircle().getName());
		
	}

}
