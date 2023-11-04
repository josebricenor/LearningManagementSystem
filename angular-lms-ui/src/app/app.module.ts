import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { CourseComponent } from './component/course/course.component';
import {FormsModule} from "@angular/forms";
import { StudentComponent } from './component/student/student.component';
import { StudyLogComponent } from './component/study-log/study-log.component';
import { AddStudyLogComponent } from './component/add-study-log/add-study-log.component';
import { DeleteStudyLogComponent } from './component/delete-study-log/delete-study-log.component';
import { UpdateStudyLogComponent } from './component/update-study-log/update-study-log.component';

@NgModule({
  declarations: [
    AppComponent,
    CourseComponent,
    StudentComponent,
    StudyLogComponent,
    AddStudyLogComponent,
    DeleteStudyLogComponent,
    UpdateStudyLogComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
