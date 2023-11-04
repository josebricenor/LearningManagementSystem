package com.jobsity.lms.controller;

import com.jobsity.lms.dto.CourseDto;
import com.jobsity.lms.model.Course;
import com.jobsity.lms.model.Student;
import com.jobsity.lms.service.CourseService;
import com.jobsity.lms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CourseController {

  private final CourseService courseService;
  private final StudentService studentService;

  // Assuming you have some sort of security service to get details about the logged-in user
  //private final SecurityService securityService;

  @Autowired
  public CourseController(CourseService courseService, StudentService studentService/*, SecurityService securityService*/) {
    this.courseService = courseService;
    this.studentService = studentService;
    //this.securityService = securityService;
  }

  @PostMapping("/courses")
  //@PreAuthorize("hasRole('ADMIN')") // This annotation ensures that only users with the ADMIN role can access this method
  public ResponseEntity<Course> createCourse(@RequestBody CourseDto course) {
    /*if (!securityService.isAdmin()) {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }*/

    Course createdCourse = courseService.createCourse(course);
    return new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
  }

  @PostMapping("/{studentId}/enroll")
  public ResponseEntity<?> enrollStudentInCourse(@PathVariable Long studentId, @RequestBody Long courseId) {
    try {
      Student student = studentService.enrollCourse(studentId, courseId);
      return ResponseEntity.ok(student);
    } catch (IllegalStateException e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }
}
