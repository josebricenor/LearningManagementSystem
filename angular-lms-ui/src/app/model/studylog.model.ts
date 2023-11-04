export class StudyLog {
  id?: number;
  studentId: number;
  courseId: number;
  date: string;
  taskCategory: string;
  taskDescription: string;
  timeSpent: number;
  constructor() {
    this.studentId = 0;
    this.courseId = 0;
    this.date = new Date().toDateString();
    this.taskCategory = '';
    this.taskDescription = '';
    this.timeSpent = 0;
  }
}
