import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { TransactionsHttpService } from './transactions/transactions.http.service';
import { AccountsHttpService } from './accounts/accounts.http.service';

@NgModule({
    imports: [
        HttpClientModule,
    ],
    providers: [
        TransactionsHttpService,
        AccountsHttpService
    ]
})
export class HttpModule {
}
