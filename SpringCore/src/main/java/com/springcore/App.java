package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		Student student1 =(Student)con.getBean("student1");
		System.out.println(student1);
		Student student2 =(Student)con.getBean("student2");
		System.out.println(student2);
			
	}
}
 