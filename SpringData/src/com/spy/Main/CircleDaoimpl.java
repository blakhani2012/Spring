package com.spy.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.spy.dao.JdbcDao;
import com.spy.model.Circle;

public class CircleDaoimpl 
{

	
	public static void main(String[] args) 
	{
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		//JdbcDao dao=(JdbcDao)context.getBean("JdbcDao");
		
	    JdbcDao dao=context.getBean("jdbcDao",JdbcDao.class);
	
	
	
		Circle c=dao.getcircle(1);
		
	    System.out.println(c.getName());
		
		
		
	}
	
	
	
}
