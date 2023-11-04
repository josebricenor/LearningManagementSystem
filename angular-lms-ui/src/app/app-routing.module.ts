import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CourseComponent} from "./component/course/course.component";
import {StudentComponent} from "./component/student/student.component";
import {StudyLogComponent} from "./component/study-log/study-log.component";
import {AddStudyLogComponent} from "./component/add-study-log/add-study-log.component";
import {DeleteStudyLogComponent} from "./component/delete-study-log/delete-study-log.component";
import {UpdateStudyLogComponent} from "./component/update-study-log/update-study-log.component";

const routes: Routes = [
  { path: 'courses', component: CourseComponent },
  { path: 'students', component: StudentComponent },
  { path: 'study-logs', component: StudyLogComponent },
  { path: 'add-study-log', component: AddStudyLogComponent },
  { path: 'delete-study-log', component: DeleteStudyLogComponent },
  { path: 'update-study-log', component: UpdateStudyLogComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
