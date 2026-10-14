package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;
import it.unibo.inheritance.api.BankAccount;

public abstract class AbstractBankAccount implements BankAccount{
    
    protected static final double ATM_TRANSACTION_FEE = 1;
    protected static final double MANAGEMENT_FEE = 5;
    protected static final double TRANSACTION_FEE = 0.1;

    private final AccountHolder holder;
    private double balance;
    private int transactions;

    public AbstractBankAccount(AccountHolder accountHolder, double balance) {
        this.holder = accountHolder;
        this.balance = balance;
    }

    public void deposit(final int id, final double amount) {
        this.transactionOp(id, amount);
    }

    public void depositFromATM(final int id, final double amount) {
        this.deposit(id, amount - AbstractBankAccount.ATM_TRANSACTION_FEE);
    }

    public AccountHolder getAccountHolder() {
        return holder;
    }

    public double getBalance() {
        return this.balance;
    }

    protected void setBalance(final double balance) {
        this.balance = balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount + AbstractBankAccount.ATM_TRANSACTION_FEE);
    }

    protected boolean checkUser(final int id) {
        return this.getAccountHolder().getUserID() == id;
    }

    protected void incrementTransactions() {
        this.transactions++;
    }

    protected void resetTransactions() {
        this.transactions = 0;
    }

    protected void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

    public abstract void chargeManagementFees(final int id);

    public abstract void withdraw(final int id, final double amount);
    
    protected abstract boolean isWithdrawAllowed(double amount);

    protected abstract double computerFee();
}
