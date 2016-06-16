package com.spy.Beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class DrawTriangle 
{

	
	public static void main(String[] args) 
	{
	
		
		@SuppressWarnings("deprecation")
		//BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring6.xml");
		
	   //Triangle triangle=(Triangle)factory.getBean("triangle");
		
		Triangle triangle=(Triangle)context.getBean("triangle1");
		
		triangle.draw();
		
	}
	
	
}
