package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/standaloneconfig.xml");
		Person per = (Person) con.getBean("person1");
		System.out.println(per);
//		System.out.println(per.getFriends().getClass().getName());
//		System.out.println(per.getFees().getClass().getName());
//		System.out.println(per.getProps().getClass().getName());
	}
}
