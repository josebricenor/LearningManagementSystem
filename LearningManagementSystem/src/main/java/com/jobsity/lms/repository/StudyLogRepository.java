package com.jobsity.lms.repository;

import com.jobsity.lms.model.StudyLog;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyLogRepository extends JpaRepository<StudyLog, Long> {
}
