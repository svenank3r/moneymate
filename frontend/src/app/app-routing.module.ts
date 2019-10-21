import {NotFoundComponent} from './core/navigation/components/not-found/not-found.component';
import {RouterModule, Routes} from '@angular/router';
import {NgModule} from '@angular/core';
import {DashboardPageComponent} from './pages/dashboard-page/dashboard-page.component';
import {AccountsPageComponent} from './pages/accounts-page/accounts-page.component';
import {TransactionsPageComponent} from './pages/transactions-page/transactions-page.component';
import {TransactionsImportPageComponent} from './pages/transactions-import-page/transactions-import-page.component';

const appRoutes: Routes = [
    {path: '', redirectTo: 'dashboard', pathMatch: 'full'},
    {path: 'dashboard', component: DashboardPageComponent},
    {path: 'accounts', component: AccountsPageComponent},
    {path: 'transactions', component: TransactionsPageComponent},
    {path: 'transactions/import', component: TransactionsImportPageComponent},
    {path: '**', component: NotFoundComponent}
];

@NgModule({
    imports: [
        RouterModule.forRoot(
            appRoutes,
            {
                enableTracing: true,
            }
        )
    ],
    providers: [],
    exports: []
})
export class AppRoutingModule {
}
