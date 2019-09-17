import { NgModule } from '@angular/core';

import { MatButtonModule, MatCardModule, MatGridListModule, MatIconModule, MatMenuModule, } from '@angular/material';
import { BrowserModule } from '@angular/platform-browser';
import { DashboardPageComponent } from './dashboard-page.component';

@NgModule({
    declarations: [
        DashboardPageComponent,
    ],
    imports: [
        BrowserModule,
        MatIconModule,
        MatButtonModule,
        MatIconModule,
        MatGridListModule,
        MatCardModule,
        MatMenuModule
    ],
    providers: [],
    bootstrap: []
})
export class DashboardPageModule {
}
