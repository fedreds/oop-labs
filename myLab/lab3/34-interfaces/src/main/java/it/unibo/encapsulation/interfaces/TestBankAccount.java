package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main() {
        /*
         * 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
         */
        AccountHolder ar = new AccountHolder("Andrea", "Rossi", 1);
        /*
         * 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
         */
        AccountHolder ab = new AccountHolder("Alex", "Bianchi", 2);
        /*
         * 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
         * rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di
         * Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
         * Bianchi (ammontare iniziale = 0)
         */
        BankAccount aRossi = new SimpleBankAccount(1, 0);
        BankAccount aBianchi = new StrictBankAccount(2, 0);
        /*
         * 4) Prima riflessione: perché è stato possibile fare la new di due classi
         * diverse in variabili dello stesso tipo?
         */
        /*
         * Perché sono implementazioni di BankAccount
         */
        /*
         * 5) Depositare €10000 in entrambi i conti
         */
        aRossi.deposit(1, 10000);
        aBianchi.deposit(2, 10000);
        /*
         * 6) Prelevare €15000$ da entrambi i conti
         */
        aRossi.withdraw(1, 15000);
        aBianchi.withdraw(2, 15000);
        /*
         * 7) Stampare in stdout l'ammontare corrente
         */
        IO.println("Balance: " +aRossi.getBalance());
        IO.println("Balance: " +aBianchi.getBalance());
        /*
         * 8) Qual è il risultato e perché?
         */
        /*
         * Il risultato sarà 10000 perchè 15000 supera il bilancio corrente, l'operazione sarà quindi annullata
         */
        /*
         * 9) Depositare nuovamente €10000 in entrambi i conti
         */
        aRossi.deposit(1, 10000);
        aBianchi.deposit(2, 10000);
        /*
         * 10) Invocare il metodo computeManagementFees su entrambi i conti
         */
        aRossi.chargeManagementFees(1);
        aBianchi.chargeManagementFees(2);
        /*
         * 11) Stampare a video l'ammontare corrente
         */
        IO.println("Balance: " +aRossi.getBalance());
        IO.println("Balance: " +aBianchi.getBalance());
        /*
         * 12) Qual è il risultato e perché?
         */
        /*
         * il risultato sarà 20000 - 5 - 0.2 = 19994.8
        */
    }
}
