import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CoreModule } from './core/core.modules';
import { AccountsPageModule } from './pages/accounts-page/accounts-page.module';
import { DashboardPageModule } from './pages/dashboard-page/dashboard-page.module';
import { TransactionsPageModule } from './pages/transactions-page/transactions-page.module';
import { HttpModule } from './api/http.module';
import { TransactionsImportPageModule } from './pages/transactions-import-page/transactions-import-page.module';
import { CategoriesPageModule } from './pages/categories-page/categories-page.module';


@NgModule({
    declarations: [
        AppComponent,
    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        BrowserAnimationsModule,
        CoreModule,
        HttpModule,
        AccountsPageModule,
        DashboardPageModule,
        TransactionsPageModule,
        TransactionsImportPageModule,
        CategoriesPageModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
