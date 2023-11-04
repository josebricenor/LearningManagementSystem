import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddStudyLogComponent } from './add-study-log.component';

describe('AddStudyLogComponent', () => {
  let component: AddStudyLogComponent;
  let fixture: ComponentFixture<AddStudyLogComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddStudyLogComponent]
    });
    fixture = TestBed.createComponent(AddStudyLogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
