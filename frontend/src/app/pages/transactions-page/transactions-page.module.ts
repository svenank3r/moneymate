import { NgModule } from '@angular/core';

import { MatButtonModule, MatCardModule, MatIconModule, MatMenuModule, } from '@angular/material';
import { TransactionsPageComponent } from './transactions-page.component';
import { MatListModule } from '@angular/material/list';
import { CommonModule } from '@angular/common';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { FlexLayoutModule } from '@angular/flex-layout';

@NgModule({
    declarations: [
        TransactionsPageComponent,
    ],
    imports: [
        MatIconModule,
        MatButtonModule,
        MatIconModule,
        MatCardModule,
        MatMenuModule,
        MatListModule,
        CommonModule,
        MatProgressSpinnerModule,
        FlexLayoutModule
    ],
    providers: [],
    bootstrap: []
})
export class TransactionsPageModule {
}
