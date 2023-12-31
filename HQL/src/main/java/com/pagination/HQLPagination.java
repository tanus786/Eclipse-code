package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class HQLPagination {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		@SuppressWarnings("rawtypes")
		Query query  = s.createQuery("from Student");
		
		//Implementation of pagination using hibernate
		
		query.setFirstResult(0);
		query.setMaxResults(3);
		@SuppressWarnings("unchecked")
		List<Student> list = query.list();
		for(Student st : list) {
			System.out.println(st.getName());
			System.out.println(st.getCity());
			System.out.println(st.getId());
		}
		tx.commit();
		s.close();
		factory.close();
	}
}
