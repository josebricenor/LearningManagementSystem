export class Course {
  id?: number;
  name: string;
  startDate: Date;
  endDate: Date;
  students?: any[];

  constructor(
    name: string,
    startDate: Date,
    endDate: Date,
    students?: any[]
  ) {
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;
    this.students = students;
  }
}
