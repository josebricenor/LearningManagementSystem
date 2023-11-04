package com.jobsity.lms.service;

import com.jobsity.lms.dto.StudentDto;
import com.jobsity.lms.model.Course;
import com.jobsity.lms.model.Student;
import com.jobsity.lms.repository.CourseRepository;
import com.jobsity.lms.repository.StudentRepository;
import com.jobsity.lms.repository.StudyLogRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Period;
import java.time.LocalDate;

@Service
public class StudentService {

  private final StudentRepository studentRepository;
  private final CourseRepository courseRepository;
  private final StudyLogRepository studyLogRepository;


  @Autowired
  public StudentService(StudentRepository studentRepository, CourseRepository courseRepository, StudyLogRepository studyLogRepository) {
    this.studentRepository = studentRepository;
    this.courseRepository = courseRepository;
    this.studyLogRepository = studyLogRepository;
  }

  public Student registerStudent(StudentDto studentDto) {
    if (studentRepository.findByEmail(studentDto.getEmail()).isPresent()) {
      throw new IllegalStateException("Email already in use");
    }

    if (Period.between(studentDto.getDob(), LocalDate.now()).getYears() < 16) {
      throw new IllegalStateException("Student must be at least 16 years old");
    }

    Student student = new Student();
    student.setFirstName(studentDto.getFirstName());
    student.setLastName(studentDto.getLastName());
    student.setDob(studentDto.getDob());
    student.setAddress(studentDto.getAddress());
    student.setEmail(studentDto.getEmail());
    student.setPhoneNumber(studentDto.getPhoneNumber());

    List<Course> courses = courseRepository.findAllById(studentDto.getCourseIds());
    student.setCourses(courses);

    return studentRepository.save(student);
  }

  //todo this have to be done by the admin
  public Student enrollCourse(Long studentId, Long courseId) {
    Student student = studentRepository.findById(studentId)
        .orElseThrow(() -> new IllegalStateException("Student not found"));

    if (student.getCourses().size() >= 3) {
      throw new IllegalStateException("Cannot enroll in more than three courses at a time");
    }

    Course course = courseRepository.findById(courseId)
        .orElseThrow(() -> new IllegalStateException("Course not found"));

    // todo verificar si ya esta en ese curso

    student.getCourses().add(course);
    return studentRepository.save(student);
  }
}

