package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {
public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session s = factory.openSession();
	Transaction tx = s.beginTransaction();
	
	Person person = new Person(101, "Tanu","Ghaziabad");
	s.save(person);
	
	tx.commit();
	s.close();
	factory.close();
}
}
