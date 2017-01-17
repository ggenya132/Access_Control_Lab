import java.util.Scanner;

/**
 * Created by eugenevendensky on 1/17/17.
 */
public class IO {


    Bank bank = new Bank();
    Scanner scan = new Scanner(System.in);

    public void userInterface() {


        String userChoice = "";
        while (!userChoice.equals("Exit")) {

            System.out.println("What operation would you like to perform?");
            System.out.println("Check Balance");
            System.out.println("Debit Account");
            System.out.println("Credit Account");
            System.out.println("Exit");


            userChoice = scan.nextLine();

            switch (userChoice) {
                case "Check Balance":
                    bank.getAccountBalance();
                    break;

                case "Debit Account":
                    System.out.println("How much would you like to withdraw?");
                    int debitAmount = scan.nextInt();
                    bank.debitAccount(debitAmount);
                    scan.nextLine();
                    break;
                case "Credit Account":
                    System.out.println("How much would you like to deposit?");
                    int creditAmount = scan.nextInt();
                    bank.creditAccount(creditAmount);
                    scan.nextLine();
                    break;
                default:
                    System.out.println("Thank you for using our service");

            }

        }
    }
}
