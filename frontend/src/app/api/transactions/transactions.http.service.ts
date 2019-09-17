import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TransactionJson } from './TransactionJson';

@Injectable({providedIn: 'root'})
export class TransactionsHttpService {
    private baseUrl = 'api/transactions';

    constructor(private httpClient: HttpClient) {
    }

    public getAllTransactions(): Observable<TransactionJson[]> {
        return this.httpClient.get<TransactionJson[]>(this.baseUrl);
    }
}
