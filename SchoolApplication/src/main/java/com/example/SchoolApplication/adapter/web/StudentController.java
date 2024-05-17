package com.example.SchoolApplication.adapter.web;

import com.example.SchoolApplication.application.StudentFacade;
import com.example.SchoolApplication.domain.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentFacade studentFacade;

    public StudentController(StudentFacade studentFacade) {
        this.studentFacade = studentFacade;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentFacade.registerStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentFacade.listAllStudents();
    }
}
