package com.example.LibraryManagementSystem.Service;


import com.example.LibraryManagementSystem.Model.Student;
import com.example.LibraryManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;


    public Student addStudent(Student student) {
        Student saveStudent = studentRepository.save(student);
        return saveStudent;

    }

    public Student getStudent(int regNo) {
       Optional<Student> studentOptional =  studentRepository.findById(regNo);
       if(studentOptional.isPresent()){
           return studentOptional.get();

       }
       return  null;

    }
}
