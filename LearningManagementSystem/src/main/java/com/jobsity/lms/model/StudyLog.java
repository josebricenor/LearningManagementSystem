package com.jobsity.lms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
public class StudyLog {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long studentId;

  private Long courseId;

  private String date;

  @Enumerated(EnumType.STRING)
  private TaskCategory taskCategory;

  private String taskDescription;

  @Temporal(TemporalType.TIMESTAMP)
  private LocalDateTime timeSpent;

  public StudyLog() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getStudentId() {
    return studentId;
  }

  public void setStudentId(Long studentId) {
    this.studentId = studentId;
  }

  public Long getCourseId() {
    return courseId;
  }

  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public TaskCategory getTaskCategory() {
    return taskCategory;
  }

  public void setTaskCategory(TaskCategory taskCategory) {
    this.taskCategory = taskCategory;
  }

  public String getTaskDescription() {
    return taskDescription;
  }

  public void setTaskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
  }

  public LocalDateTime getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(LocalDateTime timeSpent) {
    this.timeSpent = timeSpent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StudyLog studyLog = (StudyLog) o;
    return Objects.equals(id, studyLog.id) && Objects.equals(studentId, studyLog.studentId) && Objects.equals(courseId, studyLog.courseId) && Objects.equals(date, studyLog.date) && taskCategory == studyLog.taskCategory && Objects.equals(taskDescription, studyLog.taskDescription) && Objects.equals(timeSpent, studyLog.timeSpent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, studentId, courseId, date, taskCategory, taskDescription, timeSpent);
  }

  @Override
  public String toString() {
    return "StudyLog{" +
            "id=" + id +
            ", studentId=" + studentId +
            ", courseId=" + courseId +
            ", date=" + date +
            ", taskCategory=" + taskCategory +
            ", taskDescription='" + taskDescription + '\'' +
            ", timeSpent=" + timeSpent +
            '}';
  }
}
