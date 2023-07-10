package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeconfig.xml");
		Students s1 =(Students) con.getBean("ob");
		System.out.println(s1);
	}
}
