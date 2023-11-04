import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateStudyLogComponent } from './update-study-log.component';

describe('UpdateStudyLogComponent', () => {
  let component: UpdateStudyLogComponent;
  let fixture: ComponentFixture<UpdateStudyLogComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdateStudyLogComponent]
    });
    fixture = TestBed.createComponent(UpdateStudyLogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
