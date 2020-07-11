import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LParticipantComponent } from './lparticipant.component';

describe('LParticipantComponent', () => {
  let component: LParticipantComponent;
  let fixture: ComponentFixture<LParticipantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LParticipantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LParticipantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
