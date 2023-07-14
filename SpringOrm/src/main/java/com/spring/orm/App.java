package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("Press 1 for Adding new Student");
			System.out.println("Press 2 for Display All Student");
			System.out.println("Press 3 to get single detail of Student");
			System.out.println("Press 4 for delete Student");
			System.out.println("Press 5 for update Student");
			System.out.println("Press 6 to exit");
			try {
				int i = Integer.parseInt(br.readLine());
				switch (i) {
				case 1:
					System.out.println("Enter User Id");
					int uid = Integer.parseInt(br.readLine());
					System.out.println("Enter Name");
					String uName = br.readLine();
					System.out.println("Enter City");
					String uCity = br.readLine();
					Student student = new Student(uid,uName,uCity);
					studentDao.insert(student);
					System.out.println("Student Added");
					break;
				case 2:
					List<Student> allStudents = studentDao.getAllStudents();
					for(Student s : allStudents) {
						System.out.println(s);
					}
					break;
				case 3:
					System.out.println("Enter User Id");
					int userId = Integer.parseInt(br.readLine());
					Student student2 = studentDao.getStudent(userId);
					System.out.println(student2);
					break;
				case 4:
					System.out.println("Enter User Id");
					int uId = Integer.parseInt(br.readLine());
					studentDao.delete(uId);
					System.out.println("Deleted");
					break;
				case 5:

					break;
				case 6:
					go = false;
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Input try again");
			}
		}

//        Student student = new Student(3,"Manisha","Delhi");
//        int i = studentDao.insert(student);
//        System.out.println(i);
	}
}
