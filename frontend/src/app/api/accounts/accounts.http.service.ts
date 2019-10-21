import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { delay } from 'rxjs/operators';
import { AccountJson } from './AccountJson';

@Injectable({providedIn: 'root'})
export class AccountsHttpService {
    private baseUrl = 'api/accounts';

    constructor(private httpClient: HttpClient) {
    }

    public getAllAccounts(): Observable<AccountJson[]> {
        return this.httpClient.get<AccountJson[]>(this.baseUrl).pipe(delay(1000));
    }
}
