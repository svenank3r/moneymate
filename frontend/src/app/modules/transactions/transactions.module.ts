import {NgModule} from '@angular/core';

import {MatButtonModule, MatCardModule, MatIconModule, MatMenuModule,} from '@angular/material';
import {TransactionsComponent} from './transactions.component';

@NgModule({
    declarations: [
        TransactionsComponent,
    ],
    imports: [
        MatIconModule,
        MatButtonModule,
        MatIconModule,
        MatCardModule,
        MatMenuModule
    ],
    providers: [],
    bootstrap: []
})
export class TransactionsModule {
}
