import { NgModule } from '@angular/core';

import { MatButtonModule, MatCardModule, MatIconModule, MatMenuModule, } from '@angular/material';
import { AccountsPageComponent } from './accounts-page.component';

@NgModule({
    declarations: [
        AccountsPageComponent,
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
export class AccountsPageModule {
}
