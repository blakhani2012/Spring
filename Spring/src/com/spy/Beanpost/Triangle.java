package com.spy.Beanpost;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.jdbc.support.GeneratedKeyHolder;

public class Triangle

{
	
	String type;
	
	public Point getPointa() {
		return pointa;
	}

	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}

	public Point getPointb() {
		return pointb;
	}

	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}

	public Point getPointc() {
		return pointc;
	}

	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	Point pointa;
	Point pointb;
	Point pointc;
	
	
	ApplicationContext context=null;
   
	public String getType() 
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public void draw()
	{
		
		System.out.println("  triangle drawn " );
		
		System.out.println("point1 "+"("+getPointa().getX()+","+getPointa().getY()+")");
		System.out.println("point2 "+"("+getPointb().getX()+","+getPointb().getY()+")");
		System.out.println("point2 "+"("+getPointc().getX()+","+getPointc().getY()+")");
		
	}
}
