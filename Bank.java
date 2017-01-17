/**
 * Created by eugenevendensky on 1/17/17.
 */
public class Bank {


        private String accountType;
        private String accountNumer;
        private int balance;
        private String accountHoldersName;
        private float intRate;
        private String status = "Open";
        private boolean overDraftProtection = true;
        private int transactionCounter;

        public int getAccountBalance() {
            System.out.println(balance);
            return balance;
        }

        public int creditAccount(int x) {
            balance += x;
            transactionCounter++;
            System.out.println("Your balance is now " + balance);
            return balance;
        }

        public int debitAccount(int x) {
            if (status.equalsIgnoreCase("Closed") || status.equalsIgnoreCase("Ofac freeze")) {
                System.out.println("The account is unavailable for withdrawal");
                return balance;
            } else {
                if (overDraftProtection) {
                    if (balance - x <= 0) {
                        System.out.println("This transaction will result in an overdraft");
                        return balance;
                    } else {
                        int newBalance;
                        newBalance = balance - x;
                        balance = newBalance;
                        System.out.println("Your balance is now " + balance);
                        transactionCounter++;
                        return balance;
                    }
                } else {
                    int newBalance;
                    newBalance = balance - x;
                    balance = newBalance;
                    System.out.println("your balance is now " + balance);
                    transactionCounter++;
                    return balance;
                }



            }
        }
    public int getTransactions(){
        System.out.println("Your account has had " + transactionCounter + " transactions");
        return transactionCounter;
    }

}


