package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp1 =(Emp) con.getBean("emp1");
		System.out.println(emp1);
		System.out.println(emp1.getPhones().getClass().getName());
	}
}
