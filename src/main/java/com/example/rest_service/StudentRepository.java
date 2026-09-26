package com.example.rest_service;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public Student save(Student student){
        return student;
    }
}
