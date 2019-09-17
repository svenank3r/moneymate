import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { TransactionsHttpService } from './transactions/transactions.http.service';

@NgModule({
    imports: [
        HttpClientModule,
    ],
    providers: [
        TransactionsHttpService
    ]
})
export class HttpModule {
}
