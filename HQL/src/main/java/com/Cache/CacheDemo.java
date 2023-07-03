package com.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;


public class CacheDemo {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session s = factory.openSession();
	//By default Enabled
	Student student = s.get(Student.class, 101);
	System.out.println(student);
	System.out.println("Working more...");
	
	//Saved in cache memory
	Student student1 = s.get(Student.class, 101);
	System.out.println(student);
	
	System.out.println(s.contains(student1));
	
	s.close();
	factory.close();
}
}
