package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map2.Answer1;
import com.map2.Question1;

public class Cascading {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		Question1 q1 = new Question1();
		q1.setQuestionId(1235);
		q1.setQuestion("What is java?");
		
		Answer1 ans1 = new Answer1(1231,"It is important concept of programming", q1);
		Answer1 ans2 = new Answer1(1241,"2nd Answer", q1);
		Answer1 ans3 = new Answer1(1251,"3rd Answer", q1);
		
		List<Answer1> list = new ArrayList<Answer1>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		q1.setAnswers(list);
		s.save(q1);
		
		tx.commit();
		s.close();
		factory.close();
	}
}
