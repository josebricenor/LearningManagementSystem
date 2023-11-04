package com.jobsity.lms.service;

import com.jobsity.lms.dto.CourseDto;
import com.jobsity.lms.model.Course;
import com.jobsity.lms.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
  private final CourseRepository courseRepository;

  @Autowired
  public CourseService(CourseRepository courseRepository) {
    this.courseRepository = courseRepository;
  }

  public Course createCourse(CourseDto courseDto) {

    if (courseDto.getEndDate().getTime() > (courseDto.getStartDate().getTime() + 15552000000L)) {
      throw new IllegalStateException("Course must be completed within 6 months of start date.");
    }

    courseRepository.findByName(courseDto.getName()).ifPresent(s -> {
      throw new IllegalStateException("Course name already exists.");
    });


    Course course = new Course();
    course.setName(courseDto.getName());
    course.setStartDate(courseDto.getStartDate());
    course.setEndDate(courseDto.getEndDate());
    return courseRepository.save(course);
  }
}

