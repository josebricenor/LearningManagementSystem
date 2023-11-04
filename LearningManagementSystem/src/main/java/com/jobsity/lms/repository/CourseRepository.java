package com.jobsity.lms.repository;

import com.jobsity.lms.model.Course;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
  Optional<Course> findByName(String name);
}

