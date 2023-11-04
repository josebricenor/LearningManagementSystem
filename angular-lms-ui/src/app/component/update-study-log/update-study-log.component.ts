import { Component } from '@angular/core';
import {StudyLogService} from "../../services/study-log.service";
import {StudyLog} from "../../model/studylog.model";

@Component({
  selector: 'app-update-study-log',
  templateUrl: './update-study-log.component.html',
  styleUrls: ['./update-study-log.component.scss']
})
export class UpdateStudyLogComponent {
  id! : number
  studyLog!: StudyLog

  constructor(private studyLogService: StudyLogService) {
    this.studyLogService.getStudyLog(1).subscribe({
      next: (log) => {
        console.log('Study log created:', log);
        this.id = log.id!
        this.studyLog = {...log}
      },
      error: (error) => {
        console.error('Error creating study log:', error);
      }
    });
  }

  updateStudyLog() {
    this.studyLog.id = this.id
    this.studyLogService.updateStudyLog(this.studyLog).subscribe({
      next: (log) => {
        console.log('Study log created:', log);
      },
      error: (error) => {
        console.error('Error creating study log:', error);
      }
    });
  }
}
