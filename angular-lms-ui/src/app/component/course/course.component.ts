
import { Component } from '@angular/core';
import { CourseService } from '../../services/course.service';
import { Course } from '../../model/course.model';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.scss']
})
export class CourseComponent {
  newCourse: Course = {
    name: '',
    startDate: new Date(),
    endDate: new Date()
  };
  studentIdToEnroll!: number;
  courseIdToEnroll!: number;

  constructor(private courseService: CourseService) {}

  createCourse(): void {
    this.courseService.createCourse(this.newCourse).subscribe(course => {
      console.log('Course created:', course);
    }, error => {
      console.error('Error creating course:', error);
    });
  }

  enrollStudent(): void {
    this.courseService.enrollStudent(this.studentIdToEnroll, this.courseIdToEnroll).subscribe(response => {
      console.log('Student enrolled:', response);
    }, error => {
      console.error('Error enrolling student:', error);
    });
  }
}

