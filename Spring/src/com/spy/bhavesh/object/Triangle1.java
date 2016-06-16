package com.spy.bhavesh.object;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle1 implements InitializingBean,DisposableBean
{

	
	Point pointa;
	Point pointb;
	Point pointc;
	
	
	public Point getPointa() 
	{
		return pointa;
	}
	
	public void setPointa(Point pointa)
	{
		this.pointa = pointa;
	}
	public Point getPointb() 
	{
		return pointb;
	}
	public void setPointb(Point pointb) 
	{
		this.pointb = pointb;
	}
	public Point getPointc() {
		return pointc;
	}
	public void setPointc(Point pointc) 
	{
		this.pointc = pointc;
	}
	
	
	public void draw()
	{
				
		System.out.println("point1 "+"("+getPointa().getX()+","+getPointa().getY()+")");
		System.out.println("point2 "+"("+getPointb().getX()+","+getPointb().getY()+")");
		System.out.println("point3 "+"("+getPointc().getX()+","+getPointc().getY()+")");

	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");		
	}
	
	
	@Override
	public void destroy() throws Exception {
      System.out.println("destroy method");		
	}
	
	
}
