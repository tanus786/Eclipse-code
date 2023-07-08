package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person person = (Person)con.getBean("person");
		System.out.println(person);
		
		Addition add = (Addition) con.getBean("add");
		System.out.println(add);
	}
}
