package com.spy.cons;

import java.util.Iterator;
import java.util.List;

public class Triangle 

{
	
	String type;
    private List ans;
	
	
	public Triangle(String type,List ans) 
	{
		this.type=type;
		this.ans=ans;
	}

	public String getType() 
	{
		return type;
	}
	
	
	
	
/*
 * public void setType(String type)
	{
		this.type = type;
	}
*/
	
	
	
	public void draw()
	{
		
		System.out.println(getType()+"  triangle drawn " );
        
		Iterator it=ans.iterator();
		
		while(it.hasNext())
		{
          System.out.println(it.next());			
		}
		
		
	}
	
}
