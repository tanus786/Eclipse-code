package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// Spring JDBC --> JdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		Student student = new Student();
		student.setId(3);
		student.setName("Manisha");
		student.setCity("Delhi");
		
		int result = studentDao.insert(student);
		System.out.println(result);
		
		
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
