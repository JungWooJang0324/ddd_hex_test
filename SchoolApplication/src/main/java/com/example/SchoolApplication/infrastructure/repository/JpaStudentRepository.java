package com.example.SchoolApplication.infrastructure.repository;

import com.example.SchoolApplication.domain.model.Student;
import com.example.SchoolApplication.domain.repository.StudentRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaStudentRepository extends StudentRepository, JpaRepository<Student, Long> {

}
