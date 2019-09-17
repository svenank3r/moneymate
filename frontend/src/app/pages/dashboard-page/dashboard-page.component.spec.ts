import {fakeAsync, ComponentFixture, TestBed} from '@angular/core/testing';

import {DashboardPageComponent} from './dashboard.component';

describe('DashboardComponent', () => {
    let component: DashboardPageComponent;
    let fixture: ComponentFixture<DashboardPageComponent>;

    beforeEach(fakeAsync(() => {
        TestBed.configureTestingModule({
            declarations: [DashboardPageComponent]
        })
            .compileComponents();

        fixture = TestBed.createComponent(DashboardPageComponent);
        component = fixture.componentInstance;
        fixture.detectChanges();
    }));

    it('should compile', () => {
        expect(component).toBeTruthy();
    });
});
