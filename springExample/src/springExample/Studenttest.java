package springExample;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Studenttest 
{

	
	public static void main(String[] args) 
	{
		
		/*
		 * 
		 * Getting Student object using Application context
		 * 
		 */
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
	
		Student st=(Student)context.getBean("fnm");
		
		st.display();
		
		/*
		 
		 -->getting Student object using Beanfactory 
		  
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring.xml"));
		
		Student st1=(Student)factory.getBean("fnm");
		
		st1.display();
		
		
		
		
		*/
		
		
	  }
	

	}
