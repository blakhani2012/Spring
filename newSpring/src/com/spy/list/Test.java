package com.spy.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
 
	public static void main(String[] args) 
	{
	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
	    Triangle1 t=(Triangle1)	context.getBean("triangle");
		
		
		t.draw();
		
		
	}
	
	
	
	
	
}
