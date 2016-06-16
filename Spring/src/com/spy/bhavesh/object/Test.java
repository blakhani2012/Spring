package com.spy.bhavesh.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
 
	public static void main(String[] args) 
	{
	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring3.xml");
		
	    Triangle1 t=(Triangle1)	context.getBean("triangle1");
		
		
		t.draw();
		
		
	}
	
	
	
	
	
}
