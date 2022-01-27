package com.azhou.test;

import com.azhou.entity.Student;
import com.azhou.selfediter.Customer;
import com.azhou.selftag.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: XmlTest
 * @author: azhou
 * @create: 2022-01-14 10:41
 **/
public class XmlTest {

	public static void main(String[] args) {
//		ApplicationContext ap = new MyClassPathXmlApplicationContext("selfEditor.xml");
//		Customer customer = ap.getBean(Customer.class);
//		System.out.println(customer);
				ApplicationContext ap = new MyClassPathXmlApplicationContext("test.xml");

	}

}
