import {Injectable} from '@angular/core';
import {TransactionsHttpService} from './transactions.http.service';

@Injectable({providedIn: 'root'})
export class TransactionsImportService {

    constructor(private transactionsHttpService: TransactionsHttpService) {
    }

    importTransactions(importFile: File) {
        this.transactionsHttpService.importTransactions(importFile);
    }
}
