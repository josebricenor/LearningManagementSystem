import {Component} from '@angular/core';
import {StudyLogService} from '../../services/study-log.service';
import {StudyLog} from '../../model/studylog.model';

@Component({
  selector: 'app-add-study-log',
  templateUrl: './add-study-log.component.html',
})
export class AddStudyLogComponent {
  studyLog: StudyLog = new StudyLog();

  constructor(private studyLogService: StudyLogService) {}

  createStudyLog() {
    this.studyLogService.createStudyLog(this.studyLog).subscribe({
      next: (log) => {
        console.log('Study log created:', log);
      },
      error: (error) => {
        console.error('Error creating study log:', error);
      }
    });
  }
}

