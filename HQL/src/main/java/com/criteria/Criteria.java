package com.criteria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class Criteria {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Criteria c = s.createCriteria(Student.class);
		List<Student> students = c.list();
		for(Student st : students) {
			System.out.println(st);
		}
		s.close();
		factory.close();	
	}
}
