package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// Inserting element query
		String q = "insert into student(id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(q, student.getId(), student.getName(), student.getCity());
		return result;
	}

	public int update(Student student) {
		// Update data
		String q = "update student set name = ? , city = ? where id = ?";
		int result = this.jdbcTemplate.update(q, student.getName(), student.getCity(), student.getId());
		return result;
	}

	public int delete(int studentId) {
		// Delete data
		String q = "delete from student where id = ?";
		int result = this.jdbcTemplate.update(q, studentId);
		return result;
	}

	public Student getStudent(int studentId) {
		// Selecting single row data
		String q = "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(q, rowMapper, studentId);
		return student;
	}

	public List<Student> getAllStudents() {
		// Selecting Multiple row Data
		String q = "select * from student";
		List<Student> result = this.jdbcTemplate.query(q, new RowMapperImpl());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
