package com.azhou.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @description: 测试BeanFactoryPostprocess
 * @author: azhou
 * @create: 2022-01-14 14:23
 **/
public class MyBeanFactoryPostProcess implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		Object student = beanFactory.getBean("student");
//		System.out.println(student);
		System.out.println("1111");

	}
}
