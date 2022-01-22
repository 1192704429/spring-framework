package com.azhou.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: 自定义扩展实现
 * @author: azhou
 * @create: 2022-01-20 14:33
 **/
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... args) {
		super(args);
	}

	@Override
	protected void initPropertySources() {
		System.out.println(111);
		System.out.println(getApplicationName());
		System.out.println(getEnvironment().getProperty("username"));
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		beanFactory.setAllowBeanDefinitionOverriding(false);
		beanFactory.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}



}
