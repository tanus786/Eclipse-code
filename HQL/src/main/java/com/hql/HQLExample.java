package com.hql;

import java.util.List;

import org.apache.catalina.tribes.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class HQLExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// HQL
		// Syntax

//		String query = "from Student where city ='Aligarh'";
		Session s = factory.openSession();
//		String query = "from Student as s where s.city =:x and s.name =:n ";
//
//		Query<Student> q = s.createQuery(query);
//		q.setParameter("x", "Aligarh");
//		q.setParameter("n", "Updesh Pratap");
//		// single result(unique) or multiple result(list)
//
//		List<Student> list = q.list();
//		for (Student student : list) {
//			System.out.println(student.getName());
//			System.out.println(student.getCerti().getCourse());
//		}
//		System.out.println("_______________________________________________");

		Transaction tx = s.beginTransaction();
//		Delete Query
//		Query<Student> q2 = s.createQuery("delete from Student where city =:c");
//		q2.setParameter("c", "Lucknow");
//		int r = q2.executeUpdate();
//		System.out.println(r);

//		Update query
//		Query<Student> q3 = s.createQuery("update Student set city = 'Delhi' where name = 'Updesh Pratap'");
//		int r2 = q3.executeUpdate();
//		System.out.println(r2);

//		join Query
		Query q4 = s.createQuery("select q.question , q.questionId , a.answer from Question1 as q INNER JOIN q.answers as a");
		List<Object []> list4 = q4.getResultList();
		for(Object[] arr : list4) {
			System.out.println(Arrays.toString(arr));
		}
		
		tx.commit();
		s.close();
		factory.close();
	}
}
