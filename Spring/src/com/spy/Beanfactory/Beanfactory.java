package com.spy.Beanfactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class Beanfactory implements BeanFactoryPostProcessor
{
	

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) 
			throws BeansException 
	{		
		System.out.println("post process executed ");
	
	}
	
}
