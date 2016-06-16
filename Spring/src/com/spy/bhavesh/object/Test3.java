package com.spy.bhavesh.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 
{

	
	public static void main(String[] args) 
	{
		
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring3.xml");
		context.registerShutdownHook();
	    Triangle1 t=(Triangle1)	context.getBean("triangle1");
		t.draw();	
			
	}
}
