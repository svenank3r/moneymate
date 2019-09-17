import { NgModule } from '@angular/core';

import { MatButtonModule, MatCardModule, MatIconModule, MatMenuModule, } from '@angular/material';
import { TransactionsPageComponent } from './transactions-page.component';
import { MatListModule } from '@angular/material/list';
import { CommonModule } from '@angular/common';

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
        CommonModule
    ],
    providers: [],
    bootstrap: []
})
export class TransactionsPageModule {
}
