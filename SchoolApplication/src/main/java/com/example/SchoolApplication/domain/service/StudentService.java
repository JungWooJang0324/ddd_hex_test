package com.example.SchoolApplication.domain.service;

import com.example.SchoolApplication.domain.model.Student;
import com.example.SchoolApplication.domain.repository.StudentRepository;

import java.util.List;

public class StudentService {
    //비즈니스 로직을 처리하는 서비스 클래스.
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
