import {NgModule} from '@angular/core';

import {MatButtonModule, MatCardModule, MatGridListModule, MatIconModule, MatMenuModule,} from '@angular/material';
import {DashboardComponent} from './dashboard.component';
import {BrowserModule} from '@angular/platform-browser';

@NgModule({
    declarations: [
        DashboardComponent,
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
export class DashboardModule {
}
