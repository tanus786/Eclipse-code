package com.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/annotation/autowireconfig.xml");
		Emp emp = (Emp) con.getBean("emp1");
		System.out.println(emp);
	}
}
