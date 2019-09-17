export interface TransactionJson {
    transactionId: string;
    transactionDate: string;
    accountNumber: string;
    currency: { code: string, description: string};
    credit: boolean;
    amount: number;
    counterAccountName: string;
    counterAccountNumber: string;
    description: string;
}
