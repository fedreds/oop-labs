package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount{
    
    private static int ATM_TRANSACTION_FEE = 1;
    private static int MANAGEMENT_FEE = 5;
    private final int id;
    private double balance;
    private int transactions;

    public StrictBankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    public void withdraw(int id, double amount) {
        if (this.id == id && this.balance >= amount) {
            this.balance = this.balance - amount;
            this.transactions = this.transactions + 1;
            IO.println("Transaction successful");            
        }
    }

    public void deposit(int id, double amount) {
        if (this.id == id) {
            this.balance = this.balance + amount;
            this.transactions = this.transactions + 1;
            IO.println("Transaction successful");            
        } else {
            IO.println("Incorrect ID ");
        }
    }

    public void depositFromATM(int id, double amount) {
        if (this.id == id) {
            this.balance = this.balance + amount - ATM_TRANSACTION_FEE;
            this.transactions = this.transactions + 1;
            IO.println("Transaction successful");            
        } else {
            IO.println("Incorrect ID ");
        }
    }

    public void withdrawFromATM(int id, double amount) {
        if (this.id == id) {
            this.balance = this.balance - amount - ATM_TRANSACTION_FEE;
            this.transactions = this.transactions + 1;
            IO.println("Transaction successful");            
        } else {
            IO.println("Incorrect ID ");
        }
    }

    public void chargeManagementFees(int id) {
        this.balance = (this.balance - MANAGEMENT_FEE) - (0.1 * transactions);
    }

    public int getid() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }




}
