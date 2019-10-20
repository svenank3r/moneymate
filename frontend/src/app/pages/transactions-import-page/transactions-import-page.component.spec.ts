import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {TransactionsImportPageComponent} from './transactions-import-page.component';

describe('ImportTransactionsPageComponent', () => {
  let component: TransactionsImportPageComponent;
  let fixture: ComponentFixture<TransactionsImportPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TransactionsImportPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TransactionsImportPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
