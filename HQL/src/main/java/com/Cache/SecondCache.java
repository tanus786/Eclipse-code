package com.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class SecondCache {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	//First Session
	Session s1 = factory.openSession();
	Student student1 = s1.get(Student.class, 101);
	System.out.println(student1);
	s1.close();
	//Second Session
	Session s2 = factory.openSession();
	Student student2 = s1.get(Student.class, 101);
	System.out.println(student2);
	s2.close();
	
	factory.close();
}
}
