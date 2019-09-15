import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CoreModule} from './core/core.modules';
import {AccountsModule} from './modules/accounts/accounts.module';
import {DashboardModule} from './modules/dashboard/dashboard.module';
import {TransactionsModule} from './modules/transactions/transactions.module';

@NgModule({
    declarations: [
        AppComponent
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        BrowserAnimationsModule,
        CoreModule,
        AccountsModule,
        DashboardModule,
        TransactionsModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
