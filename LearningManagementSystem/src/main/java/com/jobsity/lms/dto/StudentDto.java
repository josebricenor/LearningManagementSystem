package com.jobsity.lms.dto;

import java.time.LocalDate;
import java.util.List;

public class StudentDto {

  private String firstName;
  private String lastName;
  private LocalDate dob;
  private String address;
  private String email;
  private String phoneNumber;
  private List<Long> courseIds;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public List<Long> getCourseIds() {
    return courseIds;
  }

  public void setCourseIds(List<Long> courseIds) {
    this.courseIds = courseIds;
  }

}

