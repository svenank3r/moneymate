import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { AccountJson } from '../../api/accounts/AccountJson';
import { AccountsHttpService } from '../../api/accounts/accounts.http.service';

@Component({
    selector: 'app-accounts-page',
    templateUrl: './accounts-page.component.html',
    styleUrls: ['./accounts-page.component.scss']
})
export class AccountsPageComponent implements OnInit {

    accounts$: Observable<AccountJson[]> = this.accountsHttpService.getAllAccounts();

    constructor(private accountsHttpService: AccountsHttpService) {
    }

    ngOnInit() {
    }

}
