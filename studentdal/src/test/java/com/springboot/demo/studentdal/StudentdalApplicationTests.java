package com.springboot.demo.studentdal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.demo.studentdal.entities.Student;
import com.springboot.demo.studentdal.repos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository repo;
	
	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setSname("Prakalp");
		student.setScourse("AWS Lambda");
		student.setSfee(200.0);
		repo.save(student);
		
	}
	
	@Test
	void testFindStudentbyId() {
		Student student = repo.findById(1l).get();
		System.out.println(student);
	}
	
	@Test
	void testUpdateStudent() {
		Student student = repo.findById(1l).get();
		student.setSfee(400d);
		repo.save(student);
	}
	
	@Test
	void testDeleteStudent() {
		Student student = repo.findById(2l).get();
		repo.delete(student);
	}

}
