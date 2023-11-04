import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudyLogComponent } from './study-log.component';

describe('StudyLogComponent', () => {
  let component: StudyLogComponent;
  let fixture: ComponentFixture<StudyLogComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [StudyLogComponent]
    });
    fixture = TestBed.createComponent(StudyLogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
