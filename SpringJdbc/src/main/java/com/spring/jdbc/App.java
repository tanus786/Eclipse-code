 package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// Spring JDBC --> JdbcTemplate
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfigJava.class);

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		List<Student> allStudents = studentDao.getAllStudents();
		for (Student s : allStudents) {
			System.out.println(s);
		}

//		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//		Student student = studentDao.getStudent(1);
//		System.out.println(student);

//		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//		int result = studentDao.delete(2);
//		System.out.println(result);

//		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//		Student student = new Student();
//		student.setId(3);
//		student.setName("Raj Kumar");
//		student.setCity("Jaitpura");
//		int result = studentDao.update(student);
//		System.out.println(result);

//		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//		Student student = new Student();
//		student.setId(3);
//		student.setName("Manisha");
//		student.setCity("Delhi");
//		
//		int result = studentDao.insert(student);
//		System.out.println(result);

//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//
//		// Inserting element query
//		String q = "insert into student(id,name,city) values(?,?,?)";
//
//		// Fire Query
//		int result = template.update(q,2,"Riya Soni","Varanasi");
//		System.out.println(result);
	}
}
