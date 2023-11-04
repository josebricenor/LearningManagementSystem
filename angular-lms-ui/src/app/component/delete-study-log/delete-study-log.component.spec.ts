import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteStudyLogComponent } from './delete-study-log.component';

describe('DeleteStudyLogComponent', () => {
  let component: DeleteStudyLogComponent;
  let fixture: ComponentFixture<DeleteStudyLogComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeleteStudyLogComponent]
    });
    fixture = TestBed.createComponent(DeleteStudyLogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
