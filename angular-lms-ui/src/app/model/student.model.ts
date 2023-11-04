export class Student {
  id?: number;
  firstName: string;
  lastName: string;
  dob: string;
  address: string;
  email: string;
  phoneNumber: string;
  courseIds: number[];

  constructor(
    firstName: string = '',
    lastName: string = '',
    dob: string = '',
    address: string = '',
    email: string = '',
    phoneNumber: string = '',
    courseIds: number[] = []
  ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dob = dob;
    this.address = address;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.courseIds = courseIds;
  }
}
