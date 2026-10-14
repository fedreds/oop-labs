package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {

    public ClassicBankAccount(AccountHolder accountHolder, double balance) {
        super(accountHolder, balance);
    }

    protected boolean isWithdrawAllowed(final double amount) {
        return getBalance() > amount;
    }

    protected double computerFee() {
        return AbstractBankAccount.MANAGEMENT_FEE + getTransactionsCount() * AbstractBankAccount.TRANSACTION_FEE;
    }

    public void chargeManagementFees(final int id) {
        if (checkUser(id)) {
            setBalance (
                getBalance() - AbstractBankAccount.MANAGEMENT_FEE
            );
            resetTransactions();
        }
    }

    public void withdraw(int id, double amount) {
        this.transactionOp(id, -amount);
    }

}
