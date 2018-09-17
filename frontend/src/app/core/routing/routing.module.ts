import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AccountsComponent} from '../../modules/accounts/accounts.component';
import {TransactionsComponent} from '../../modules/transactions/transactions.component';
import {NotFoundComponent} from '../navigation/components/not-found/not-found.component';
import {DashboardComponent} from '../../modules/dashboard/dashboard.component';

const appRoutes: Routes = [
    {path: '', redirectTo: 'dashboard', pathMatch: 'full'},
    {path: 'dashboard', component: DashboardComponent},
    {path: 'accounts', component: AccountsComponent},
    {path: 'transactions', component: TransactionsComponent},
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
export class RoutingModule {
}
