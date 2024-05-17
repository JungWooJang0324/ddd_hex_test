package com.example.SchoolApplication.infrastructure.configuration;

import com.example.SchoolApplication.application.StudentFacade;
import com.example.SchoolApplication.domain.repository.StudentRepository;
import com.example.SchoolApplication.domain.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    //AppConfig: 빈 설정 파일.
    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentService(studentRepository);
    }

    @Bean
    public StudentFacade studentFacade(StudentService studentService) {
        return new StudentFacade(studentService);
    }
}
