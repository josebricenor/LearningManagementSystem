import { TestBed } from '@angular/core/testing';

import { StudyLogService } from './study-log.service';

describe('StudyLogService', () => {
  let service: StudyLogService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(StudyLogService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
