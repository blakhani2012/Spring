package com.spy.Beanpost;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanpostprocessName implements BeanPostProcessor
{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("after initializing name "+beanname);
		return bean;
	}

	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("before initializing name "+beanname);
		return bean;
	}

}
