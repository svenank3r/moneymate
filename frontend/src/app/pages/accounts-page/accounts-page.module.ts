import { NgModule } from '@angular/core';

import { MatButtonModule, MatCardModule, MatIconModule, MatMenuModule, } from '@angular/material';
import { AccountsPageComponent } from './accounts-page.component';
import { MatListModule } from '@angular/material/list';
import { MatFormFieldModule } from '@angular/material/form-field';
import { CommonModule } from '@angular/common';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';

@NgModule({
    declarations: [
        AccountsPageComponent,
    ],
    imports: [
        MatIconModule,
        MatButtonModule,
        MatIconModule,
        MatCardModule,
        MatMenuModule,
        MatListModule,
        MatFormFieldModule,
        CommonModule,
        MatProgressSpinnerModule
    ],
    providers: [],
    bootstrap: []
})
export class AccountsPageModule {
}
