import {Injectable} from '@angular/core';
import {HttpClient, HttpResponseBase} from '@angular/common/http';
import {Observable} from 'rxjs';
import {TransactionJson} from './TransactionJson';
import {tap} from 'rxjs/operators';

@Injectable({providedIn: 'root'})
export class TransactionsHttpService {
    private baseUrl = 'api/transactions';

    constructor(private httpClient: HttpClient) {
    }

    public getAllTransactions(): Observable<TransactionJson[]> {
        return this.httpClient.get<TransactionJson[]>(this.baseUrl);
    }

    public importTransactions(importFile: File): Observable<HttpResponseBase> {
        const formData: FormData = new FormData();
        formData.append('file', importFile, importFile.name);
        return this.httpClient
            .post<HttpResponseBase>(this.baseUrl + '/upload', formData, { reportProgress: true})
            .pipe(
                tap(progress => console.log('progress: ' + progress))
            );
    }
}
