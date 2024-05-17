package com.example.SchoolApplication.application;

import com.example.SchoolApplication.domain.model.Student;
import com.example.SchoolApplication.domain.service.StudentService;

import java.util.List;

//Application" 애플리케이션 계층은 도메인 서비스를 호출하여 애플리케이션의 유스케이스를 처리.
public class StudentFacade {
    //StudentFacade: 서비스 클래스를 호출하는 애플리케이션 서비스
    private final StudentService studentService;

    public StudentFacade(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student registerStudent(Student student) {
        return studentService.addStudent(student);
    }

    public List<Student> listAllStudents() {
        return studentService.getAllStudents();
    }
}
