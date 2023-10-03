package com.example.LibraryManagementSystem.Controller;

import com.example.LibraryManagementSystem.Model.Student;
import com.example.LibraryManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody Student student){
        Student response = studentService.addStudent(student);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }
    //////////////////Get the student with the help of "id".....
    @GetMapping("/get")
    public ResponseEntity getStudent(@RequestParam("id") int regNo){
        Student student = studentService.getStudent(regNo);
        if(student!=null){
            return new ResponseEntity(student,HttpStatus.FOUND);
        }
        return new ResponseEntity("Invalid id...!!",HttpStatus.BAD_REQUEST);
    }
}
