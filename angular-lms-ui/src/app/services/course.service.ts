import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
  private baseUrl = 'http://localhost:8080/admin';

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) {}

  createCourse(course: any): Observable<any> {
    return this.http.post(`${this.baseUrl}/courses`, course, this.httpOptions);
  }

  enrollStudent(studentId: number, courseId: number): Observable<any> {
    return this.http.post(`${this.baseUrl}/${studentId}/enroll`, courseId, this.httpOptions);
  }
}
