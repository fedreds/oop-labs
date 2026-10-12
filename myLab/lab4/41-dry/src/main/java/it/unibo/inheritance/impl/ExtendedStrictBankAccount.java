package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount {
    
    protected static final double TRANSACTION_FEE = 0.1;
    

    public ExtendedStrictBankAccount (final int id, final double balance) {
        super(id,balance);
    }

    public void withdraw(final int id, final double amount) {
        if (isWithdrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    public void chargeManagementFees(final int id) {
        final double feeAmount = MANAGEMENT_FEE + getTransactionsCount() * ExtendedStrictBankAccount.TRANSACTION_FEE;
        if (checkUser(id) && isWithdrawAllowed(feeAmount)) {
            setBalance(this.getBalance()-feeAmount);
            resetTransactions();
        }
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            setBalance(this.getBalance() + amount);
            this.incrementTransactions();
        }
    }

    private boolean isWithdrawAllowed(final double amount) {
        return this.getBalance() >= amount;
    }
    
}
