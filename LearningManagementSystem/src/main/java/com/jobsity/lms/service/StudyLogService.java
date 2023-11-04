package com.jobsity.lms.service;

import com.jobsity.lms.dto.StudyLogDto;
import com.jobsity.lms.model.StudyLog;
import com.jobsity.lms.repository.StudyLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Service
public class StudyLogService {

    private final StudyLogRepository studyLogRepository;

    @Autowired
    public StudyLogService(StudyLogRepository studyLogRepository) {
        this.studyLogRepository = studyLogRepository;
    }

    public StudyLog logStudyHours(StudyLogDto entryDto) throws ParseException {

        Long timeSpent = entryDto.getTimeSpent();

        if (timeSpent != 30) {
            throw new IllegalArgumentException("Time spent should be in 30-minute increments");
        }

        StudyLog studyLog = new StudyLog();
        studyLog.setStudentId(entryDto.getStudentId());
        studyLog.setCourseId(entryDto.getCourseId());
        studyLog.setDate(entryDto.getDate());
        studyLog.setTaskCategory(entryDto.getTaskCategory());
        studyLog.setTaskDescription(entryDto.getTaskDescription());
        studyLog.setTimeSpent(LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC)
                .plusMinutes(timeSpent));
        return studyLogRepository.save(studyLog);
    }

    public StudyLogDto getStudyLog(Long id) {
        StudyLog studyLog = studyLogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("StudyLog with id " + id + " not found"));

        StudyLogDto entryDto = new StudyLogDto();

        entryDto.setId(studyLog.getId());
        entryDto.setStudentId(studyLog.getStudentId());
        entryDto.setCourseId(studyLog.getCourseId());
        entryDto.setDate(studyLog.getDate());
        entryDto.setTaskCategory(studyLog.getTaskCategory());
        entryDto.setTaskDescription(studyLog.getTaskDescription());
        entryDto.setTimeSpent(studyLog.getTimeSpent().toInstant(ZoneOffset.UTC).toEpochMilli() / 1000 / 60);

        return entryDto;
    }

    public void deleteStudyLog(Long id) {
        StudyLog existingStudyLog = studyLogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("StudyLog with id " + id + " not found"));

        studyLogRepository.delete(existingStudyLog);
    }

    public StudyLog updateStudyLog(StudyLogDto updateDto) {
        Long id = updateDto.getId();
        StudyLog existingStudyLog = studyLogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("StudyLog with id " + id + " not found"));

        Long timeSpent = updateDto.getTimeSpent();

        if (timeSpent != 30) {
            throw new IllegalArgumentException("Time spent should be in 30-minute increments");
        }

        existingStudyLog.setId(id);
        existingStudyLog.setStudentId(updateDto.getStudentId());
        existingStudyLog.setDate(updateDto.getDate());
        existingStudyLog.setTaskCategory(updateDto.getTaskCategory());
        existingStudyLog.setTaskDescription(updateDto.getTaskDescription());
        existingStudyLog.setTimeSpent(LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC)
                .plusMinutes(timeSpent));

        return studyLogRepository.save(existingStudyLog);
    }
}

