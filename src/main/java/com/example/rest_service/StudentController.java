package com.example.rest_service;

import org.springframework.web.bind.annotation.*;

//@RestController
//public class StudentController {
//
//    @PostMapping("/students")
//    public Student student(@RequestBody Student student){
//        return student;
//    }
//
//    @PutMapping("/students/{id}")
//    public Student updateStudent(@PathVariable long id, @RequestBody Student student){
//        return new Student (
//                id,
//                student.getName(),
//                student.getBranch()
//        );
//    }
//
//    @DeleteMapping("/students/{id}")
//    public String deleteStudent(@PathVariable long id){
//        return "Student" + id + "Deleted";
//    }
//
//}

@RestController
public class StudentController{
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public Student student(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
