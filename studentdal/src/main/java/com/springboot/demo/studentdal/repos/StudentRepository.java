package com.springboot.demo.studentdal.repos;

import org.springframework.data.repository.CrudRepository;

import com.springboot.demo.studentdal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
