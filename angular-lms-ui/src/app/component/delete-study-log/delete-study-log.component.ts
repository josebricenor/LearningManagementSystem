import { Component } from '@angular/core';
import {StudyLogService} from "../../services/study-log.service";

@Component({
  selector: 'app-delete-study-log',
  templateUrl: './delete-study-log.component.html',
  styleUrls: ['./delete-study-log.component.scss']
})
export class DeleteStudyLogComponent {

  id! : number

  constructor(private studyLogService: StudyLogService) {}
  deleteStudyLog() {
    this.studyLogService.deleteStudyLog(this.id).subscribe({
      next: (log) => {
        console.log('Study log created:', log);
      },
      error: (error) => {
        console.error('Error creating study log:', error);
      }
    });
  }

}
