import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {TransactionsImportPageComponent} from './transactions-import-page.component';
import {MatCardModule} from '@angular/material/card';
import {MatSelectModule} from '@angular/material/select';
import {MatButtonModule} from '@angular/material/button';
import {FlexModule} from '@angular/flex-layout';
import {FormsModule} from '@angular/forms';

@NgModule({
    declarations: [
        TransactionsImportPageComponent
    ],
    imports: [
        CommonModule,
        MatCardModule,
        MatSelectModule,
        MatButtonModule,
        FlexModule,
        FormsModule
    ]
})
export class TransactionsImportPageModule {
}
