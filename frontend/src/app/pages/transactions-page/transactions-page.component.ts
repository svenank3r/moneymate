import { Component, OnInit } from '@angular/core';
import { TransactionsHttpService } from '../../api/transactions/transactions.http.service';
import { Observable } from 'rxjs';
import { TransactionJson } from '../../api/transactions/TransactionJson';

@Component({
    selector: 'app-transactions-page',
    templateUrl: './transactions-page.component.html',
    styleUrls: ['./transactions-page.component.scss']
})
export class TransactionsPageComponent implements OnInit {

    transactions$: Observable<TransactionJson[]> = this.transactionsHttpService.getAllTransactions();

    constructor(private transactionsHttpService: TransactionsHttpService) {
    }

    ngOnInit() {
    }

}
