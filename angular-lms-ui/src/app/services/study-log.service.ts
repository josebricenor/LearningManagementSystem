import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { StudyLog } from '../model/studylog.model';

@Injectable({
  providedIn: 'root'
})
export class StudyLogService {
  private apiUrl = 'http://localhost:8080/study-logs'; // Adjust as necessary

  constructor(private http: HttpClient) {}

  createStudyLog(log: StudyLog): Observable<StudyLog> {
    return this.http.post<StudyLog>(this.apiUrl, log);
  }

  updateStudyLog(log: StudyLog): Observable<StudyLog> {
    return this.http.put<StudyLog>(`${this.apiUrl}`, log);
  }

  getStudyLog(id: number): Observable<StudyLog> {
    return this.http.get<StudyLog>(`${this.apiUrl}/${id}`);
  }

  deleteStudyLog(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
