package com.jobsity.lms.dto;

import com.jobsity.lms.model.TaskCategory;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class StudyLogDto {

  private Long id;
  private Long courseId;

  private Long studentId;

  private String date;

  private TaskCategory taskCategory;

  private String taskDescription;

  private Long timeSpent;

  public StudyLogDto() {
  }

  public Long getCourseId() {
    return courseId;
  }

  public void setCourseId(Long courseId) {
    this.courseId = courseId;
  }

  public Long getStudentId() {
    return studentId;
  }

  public void setStudentId(Long student) {
    this.studentId = student;
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

  public Long getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(Long timeSpent) {
    this.timeSpent = timeSpent;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "StudyLogDto{" +
            "id=" + id +
            ", courseId=" + courseId +
            ", studentId=" + studentId +
            ", date='" + date + '\'' +
            ", taskCategory=" + taskCategory +
            ", taskDescription='" + taskDescription + '\'' +
            ", timeSpent=" + timeSpent +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudyLogDto studyLog = (StudyLogDto) o;
    return Objects.equals(courseId, studyLog.courseId) && Objects.equals(studentId,
        studyLog.studentId) && Objects.equals(date, studyLog.date)
        && taskCategory == studyLog.taskCategory && Objects.equals(taskDescription,
        studyLog.taskDescription) && Objects.equals(timeSpent, studyLog.timeSpent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courseId, studentId, date, taskCategory, taskDescription, timeSpent);
  }
}
