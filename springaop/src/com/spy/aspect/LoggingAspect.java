package com.spy.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect 
{
	
	
	@Before("execution(public String getName())")
	public void loggingadvice()
	{
		System.out.println("advice run,before method is called");
	}
	
	
	/*@Before("allgetter() && allcirclemethod()")
	public void loggingadvice()
	{
		System.out.println("advice run,before method is called");
	}
	*/

	
	/* * 
	 * @Before("allgetter()")
	public void loggingadvice(JoinPoint joinpoint)
	{
		//System.out.println("logging advice run,get method called");
		
		System.out.println(joinpoint.toString());
	}*/
	
	
	
  /* @Before("allgetter()")
	public void secondadvice()
	{
		System.out.println("second advice run");
	}
	*/
	
   
    @Pointcut("execution(* get*())")
	public void allgetter(){}
	
	
   /* @Pointcut("within(com.spy.service.Circle)") 
    public void allcirclemethod(){}
    *
    **/
    
    
    
    
    

    
   /*@Before("(args(String))")
    public void Stringargmethod()
    {
    	System.out.println("String arg method run");
   
    }*/
   
  /* @Before("(args(name))")
   public void Stringargmethod(String name)
   {
   	System.out.println("String arg method run and value is "+name);
  
   }*/
	
	
	
    
   /* @AfterReturning("(args(name))")
    public void Stringargmethod(String name)
    {
    	System.out.println("String arg method run and value is "+name);
   
    }*/
   
  /*  
    @AfterThrowing("args(name)")
       public void afterException(String name)
    	{
    	  System.out.println("after Exception method is run");
    	}*/
    
   
	/*@AfterReturning(pointcut="args(name)", returning="returnvalue")
    public void Stringargmethod(String name,String returnvalue)
    {
    	System.out.println("String arg method run and value is "+name+"value is "+returnvalue);
   
    }
    
*/
	/*@Around("allgetter()")
	public Object loggingadvice(ProceedingJoinPoint p)
	{
		Object returnvalue=null;

		try 
		{
			
			System.out.println("before");
			
			returnvalue=p.proceed();
			
			System.out.println("after");
			
			
		}
		catch (Throwable e)
		{
			
			System.out.println("after throwing Exception");
			e.printStackTrace();
		}
		return returnvalue;
		
		
	}
	
	*/
    
    
  /*  @Before("@annotation(com.spy.aspect.Loggable)")
	public void loggingadvice()
	{
		System.out.println("advice run,before method is called");
	}
    
    */
    
}
