package com.jobsity.lms.controller;

import com.jobsity.lms.dto.StudyLogDto;
import com.jobsity.lms.model.StudyLog;
import com.jobsity.lms.service.StudyLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("/study-logs")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class StudyLogController {

  private final StudyLogService studyLogService;

  @Autowired
  public StudyLogController(StudyLogService studyLogService) {
    this.studyLogService = studyLogService;
  }

  @PostMapping
  public ResponseEntity<StudyLog> createStudyLog(@RequestBody StudyLogDto studyLogDto) throws ParseException {
    StudyLog studyLog = studyLogService.logStudyHours(studyLogDto);
    return ResponseEntity.ok(studyLog);
  }

  @GetMapping("/{id}")
  public ResponseEntity<StudyLogDto> getStudyLog(@PathVariable Long id) {
    StudyLogDto studyLog = studyLogService.getStudyLog(id);
    return ResponseEntity.ok(studyLog);
  }

  @PutMapping
  public ResponseEntity<StudyLog> updateStudyLog(@RequestBody StudyLogDto studyLogDto) {
    StudyLog updatedStudyLog = studyLogService.updateStudyLog(studyLogDto);
    return ResponseEntity.ok(updatedStudyLog);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteStudyLog(@PathVariable Long id) {
    studyLogService.deleteStudyLog(id);
    return ResponseEntity.ok().build();
  }
}

