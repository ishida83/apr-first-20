import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DefaultAppComponent } from './default-app.component';

describe('DefaultAppComponent', () => {
  let component: DefaultAppComponent;
  let fixture: ComponentFixture<DefaultAppComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DefaultAppComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DefaultAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
