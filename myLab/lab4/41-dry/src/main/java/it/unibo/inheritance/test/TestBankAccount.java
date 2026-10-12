package it.unibo.inheritance.test;
//[![](https://mermaid.ink/img/pako:eNqdVWtv2jAU_SuR2QeqJhHPjkSoUtbSrR-g0mCaNCEh174NURMbOc5oy9hvnx0SyAPoNiREfO6519fH55INIpwCchEJcRzfBtgXOJqLOfuE2bNHCE-YNIa_bNuYBtEqhAKsWTVQcS3LGL1IYBToVIqAyHdzbPvayJ6_8JCC0DT9TZsyitSNhg31GQ4DJkE8YQLX1zn4ex3IJRV43VRB06A8eQzhwvjJA7qnUFjxOJB1hlGl3AkeebPxOWa-319QyRILH8aYYR8iYPIOINb8Ks8HJViIGYHmRVaqFJwJzGJMZMBZfKM1UTRVJuVsy8LVld7L18gqq6YXs6_eZOrdzO4fJou70eiDUSWNvYn3eTQeTWZpPA9betuDslbGPhygRJSFvvM2dfDyqDAVVS7zWzuB5_pXw-fEbMTFYC3vnM45J6BV8LQB65z3TdMgSyDP32IQO6c8ch4CZod4wIhIRSt2Wz1NQ0AMZxlW8XIeVic6qrjr5JDXXVZx2EIApg8sfN1b6Z_0Oz5J9L_OtLNn_D3b1gtDvgbazHlFwSvHL_1hHY5saTmYbzAcQRWLE1GCd_NjlKZBuWqiOOqGsqRiZLorcDyobXJ_WzWk5DtqOWeLTOSLgCJXigRMFIGIsF6ijc6bI7lU0s6Rqx4F0OTFolg8W4SHXMzRLn-F2Q_Oo7yE4Im_RO4TDmO1SlYUS8jeJ3sUJ6qdV0b2OdpAIp0u5PadQS-titwNekFue9Czr7o9p9Vx-r12q92_MtErcrt9W62vuu1BS8GO09ma6C3to2UPnF6v4zhdhX9sdQZ9EwENJBfj7B2nf7Z_ADzCVLw?type=png)](https://mermaid.live/edit#pako:eNqdlW9v2jAQxr9KZPaCqiQitOFPhJCyFra-gEqDadKEhFz7GiISGznOaMfYZ58dEkhCoduQEMnd787nJ4_JFhFOAbmIhDiO7wPsCxzNxZx9xGzlEcITJo3-L8sypkG0DqEQ1tRJULGmaQxfJDAKdCpFQOS7NZY1MLLrzzykIDSmv-lQRhHd6rChPv1-wCSIZ0xgMMiDvzeBXFKBN3WVbBiUJ08hXBk_eEAPCIU1jwN5ShhVZCR45M3Gl8h8vb9AyRILH8aYYR8iYHIEEGu-yvmgBAsxI1C_ylqVkjOBWYyJDDiL77QmClNtUmZXFu5U6YN8tayzGnox--JNpt7d7OFxshgNhx-MKjT2Jt6n4Xg4maX5PG3qZY_Kmhl93EAJlIW58zF18vpNYSqqXOdP7Uw817-aviRmLS4mT-ou6ZwzAa0GzxvwlHnfNDWyBLL6GoPYO-WJ8xAwO-YDRkQqWnHa6m5qAmK4SJjFh_O4PjNRxV1nD_mpyyoOWwjA9JGFrwcr_ZN-b58k-l972tsz_pYt64Uh3wCt51xR8Mr2S39Yxy2bWg7mGwxHUI3FiSiF9-fHKJ0G5aqJYtQTyoqKmem-wdtJbZOH-6ohJd-j5ZodaiBfBBS5UiTQQBGICOtbtNV1cySXSto5ctWlAJq8mBSLlUl4yMUc7evXmH3nPMpbCJ74S-Q-4zBWd8maYgnZ--QQxYka55WRQ402kEhPF3KdXvcm7YrcLXpBru20rKZ9272xndtWr93tOA30ilyzazVvHad302rbHVtFdw30M52jafXaTsfuOb1Wx7Y7zXYDAQ0kF-PsFad_dn8A6JJUfw)
import it.unibo.inheritance.api.AccountHolder;
import it.unibo.inheritance.api.BankAccount;
import it.unibo.inheritance.impl.ExtendedStrictBankAccount;
import it.unibo.inheritance.impl.SimpleBankAccount;
import it.unibo.inheritance.impl.StrictBankAccount;

public class TestBankAccount {
    private static final int INTIAL_AMOUNT = 10000;
    private static final int WITHDRAW_AMOUNT = 15000;

    private TestBankAccount() {
    }

    private static void requireSame(final String what, final Object first, final Object second) {
        if (first.equals(second)) {
            System.out.println("# CORRECT: " + what + " " + first + " is equal to " + what + " " + second);
        } else {
            final var error = "# ERROR: " + what + " " + first + " is not equal to " + what + " " + second + " #";
            final var decorationBuilder = new StringBuilder(error.length());
            for (int i = 0; i < error.length(); i++) {
                decorationBuilder.append("#");
            }
            final var decoration = decorationBuilder.toString();
            System.out.println(decoration);
            System.out.println(error);
            System.out.println(decoration);
            System.exit(1);
        }
    }

    private static void requireSameAmount(BankAccount account1, BankAccount account2) {
        requireSame("amount in account", account1.getBalance(), account2.getBalance());
        requireSame("transactions count", account1.getTransactionsCount(), account2.getTransactionsCount());
    }

    public static void main() {
        final AccountHolder aRossi = new AccountHolder("Andrea", "Rossi", 1);
        final AccountHolder aBianchi = new AccountHolder("Alex", "Bianchi", 2);
        /*
         * Change SimpleBankAccount to ExtendedStrictBankAccount
         */
        final BankAccount rossisAccount = new ExtendedStrictBankAccount(aRossi.getUserID(), 0);
        final BankAccount bianchisAccount = new StrictBankAccount(aBianchi.getUserID(), 0);
        requireSameAmount(rossisAccount, bianchisAccount);
        // First deposit
        rossisAccount.deposit(aRossi.getUserID(), INTIAL_AMOUNT);
        bianchisAccount.deposit(aBianchi.getUserID(), INTIAL_AMOUNT);
        requireSameAmount(rossisAccount, bianchisAccount);
        // Withdraw
        rossisAccount.withdraw(aRossi.getUserID(), WITHDRAW_AMOUNT);
        bianchisAccount.withdraw(aBianchi.getUserID(), WITHDRAW_AMOUNT);
        requireSameAmount(rossisAccount, bianchisAccount);
        // Second deposit
        rossisAccount.deposit(aRossi.getUserID(), INTIAL_AMOUNT);
        bianchisAccount.deposit(aBianchi.getUserID(), INTIAL_AMOUNT);
        requireSameAmount(rossisAccount, bianchisAccount);
        // Withdraw
        rossisAccount.withdraw(aRossi.getUserID(), WITHDRAW_AMOUNT);
        bianchisAccount.withdraw(aBianchi.getUserID(), WITHDRAW_AMOUNT);
        requireSameAmount(rossisAccount, bianchisAccount);
        // Management fees
        rossisAccount.chargeManagementFees(aRossi.getUserID());
        bianchisAccount.chargeManagementFees(aBianchi.getUserID());
        requireSameAmount(rossisAccount, bianchisAccount);
    }
}
