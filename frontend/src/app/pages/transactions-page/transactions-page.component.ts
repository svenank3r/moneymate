import { Component, OnInit } from '@angular/core';
import { TransactionsHttpService } from '../../api/transactions/transactions.http.service';
import { Observable } from 'rxjs';
import { TransactionJson } from '../../api/transactions/TransactionJson';
import { GridOptions } from 'ag-grid-community';

@Component({
    selector: 'app-transactions-page',
    templateUrl: './transactions-page.component.html',
    styleUrls: ['./transactions-page.component.scss']
})
export class TransactionsPageComponent implements OnInit {

    transactions$: Observable<TransactionJson[]> = this.transactionsHttpService.getAllTransactions();

    searchTerm: string;

    columnDefs = [
        {headerName: 'Transaction ID', field: 'transactionId', sortable: true},
        {headerName: 'Account number', field: 'accountNumber', sortable: true, filter: true},
        {headerName: 'Currency', field: 'currency', sortable: true},
        {headerName: 'Amount', field: 'amount', sortable: true, filter: true},
        {headerName: 'Credit/Debit', field: 'credit', sortable: true},
        {headerName: 'Date', field: 'transactionDate', sortable: true},
        {headerName: 'Description', field: 'description', sortable: true, filter: true},
        {headerName: 'Counter account name', field: 'counterAccountName', sortable: true, filter: true},
        {headerName: 'Counter account number', field: 'counterAccountNumber', sortable: true, filter: true},
    ];

    gridOptions: GridOptions = {
        sortingOrder: ['asc', 'desc', 'null'],
        animateRows: true,
        rowSelection: 'single',
        suppressCellSelection: true,
        domLayout: 'autoHeight',
        onGridReady: (params) => {
            // TODO: determine if we never want a scroll bar
            // params.columnApi.autoSizeColumns(this.columnDefs);
            // params.api.sizeColumnsToFit();
        }
    } as GridOptions;

    rowData: any = [];

    constructor(private transactionsHttpService: TransactionsHttpService) {
    }

    ngOnInit() {
        this.transactions$.subscribe((value: TransactionJson[]) => this.loadTableData(value));
    }

    loadTableData(transactions: TransactionJson[]): void {
        this.rowData = transactions.map((transaction: TransactionJson) => {
            return {
                transactionId: transaction.transactionId,
                accountNumber: transaction.accountNumber,
                currency: transaction.currency.code,
                amount: transaction.amount,
                credit: transaction.credit ? 'C' : 'D',
                transactionDate: transaction.transactionDate,
                description: transaction.description,
                counterAccountName: transaction.counterAccountName,
                counterAccountNumber: transaction.counterAccountNumber
            };
        });
    }
}
