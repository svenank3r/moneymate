import {NgModule} from '@angular/core';

import {MatButtonModule, MatCardModule, MatIconModule, MatMenuModule,} from '@angular/material';
import {AccountsComponent} from './accounts.component';

@NgModule({
    declarations: [
        AccountsComponent,
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
export class AccountsModule {
}
