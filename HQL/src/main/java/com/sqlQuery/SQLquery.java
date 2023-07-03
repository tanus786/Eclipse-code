package com.sqlQuery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class SQLquery {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		//SQl Query
		Query q = s.createNativeQuery("select * from student",Student.class);
		List<Student> list = q.list();
		for(Student st:list) {
			System.out.println(st.getName());
		}
		
		s.close();
		factory.close();
	}
}
