
import { Component } from '@angular/core';
import { StudentService } from '../../services/student.service';
import { Student } from '../../model/student.model';

@Component({
  selector: 'app-student-register',
  templateUrl: './student.component.html',
})
export class StudentComponent {
  student: Student = new Student();

  constructor(private studentService: StudentService) {}

  registerStudent() {
    this.studentService.registerStudent(this.student).subscribe({
      next: (student) => {
        console.log('Registered student:', student);
      },
      error: (error) => {
        console.error('Error registering student:', error);
      }
    });
  }
}
