package com.spy.Main;

import com.spy.dao.JdbcDao;
import com.spy.model.Circle;

public class Daoimpl 
{

	public static void main(String[] args) 
	{
	
		Circle circle=new JdbcDao().getcircle(1);
		
		System.out.println(circle.getName());
		
		
	}

}
