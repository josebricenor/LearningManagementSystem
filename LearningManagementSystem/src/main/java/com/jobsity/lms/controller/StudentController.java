package com.jobsity.lms.controller;

import com.jobsity.lms.dto.StudentDto;
import com.jobsity.lms.model.Student;
import com.jobsity.lms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class StudentController {

  private final StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @PostMapping("/register")
  public ResponseEntity<Student> registerStudent(@RequestBody StudentDto student) {
    Student registeredStudent = studentService.registerStudent(student);
    return ResponseEntity.ok(registeredStudent);
  }
}

