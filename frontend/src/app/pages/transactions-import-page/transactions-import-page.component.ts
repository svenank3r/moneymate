import {Component, OnInit, ViewChild} from '@angular/core';
import {TransactionsImportService} from '../../api/transactions/TransactionsImportService';

@Component({
    selector: 'app-transactions-import-page',
    templateUrl: './transactions-import-page.component.html',
    styleUrls: ['./transactions-import-page.component.scss']
})
export class TransactionsImportPageComponent implements OnInit {
    @ViewChild('file', null) file;

    // Local
    selectedBank: string;
    importFile: File;

    constructor(private transactionsImportService: TransactionsImportService) {
        this.selectedBank = null;
        this.importFile = null;
    }

    ngOnInit() {
    }

    addFile(): void {
        this.file.nativeElement.click();
    }

    onFilesAdded(): void {
        this.importFile = this.file.nativeElement.files[0];
    }

    getFileName(): string {
        return this.importFile !== null
            ? this.importFile.name
            : 'No file selected';
    }

    importTransactions(): void {
        this.transactionsImportService.importTransactions(this.importFile)
    }
}
