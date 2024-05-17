package com.example.SchoolApplication.domain.repository;

import com.example.SchoolApplication.domain.model.Student;

import java.util.List;

public interface StudentRepository {
    //repository - 도메인 모델을 저장하고 불러오는 인터페이스를 정의.
    Student save(Student student);
    List<Student> findAll();

}
