import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {LayoutModule} from '@angular/cdk/layout';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CoreModule} from './core/core.modules';
import {RoutingModule} from './core/routing/routing.module';
import {AccountsModule} from './modules/accounts/accounts.module';
import {DashboardModule} from './modules/dashboard/dashboard.module';
import {TransactionsModule} from './modules/transactions/transactions.module';

@NgModule({
    declarations: [
        AppComponent,
    ],
    imports: [
        BrowserModule,
        LayoutModule,
        BrowserAnimationsModule,
        CoreModule,
        AccountsModule,
        DashboardModule,
        TransactionsModule,
        RoutingModule,
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
