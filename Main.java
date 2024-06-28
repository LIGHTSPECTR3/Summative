import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // declaring the scanner to pick up user input
        Scanner scanner = new Scanner(System.in);
        //Printing a prompt for user input
        System.out.println("Enter a character");
        char c = scanner.next().charAt(0);
        System.out.println("input option is " + c);


        class BankAccount {


            int balance;
            int PreviousTransactions;
            void deposit(int amount) {
                if (amount != 0) {
                    balance = balance + amount;
                    PreviousTransactions = amount;
                }
            }
            void Withdraw(int amount){
                if (amount !=0){
                    balance = balance - amount;
                    PreviousTransactions =- amount;
                }
            }

            void getPreviousTransactions()
            {
                if (PreviousTransactions > 0 ){
                    System.out.println("Deposited: " + PreviousTransactions);
                }
                else if (PreviousTransactions < 0 ) {
                    System.out.println("Withdrawn: " +Math.abs(PreviousTransactions));
                }
                else {
                    System.out.println("No transaction occurred");
                }

            }



            void showmenu(){


                char option = "0";

                Scanner scanner1 = new Scanner(System.in);
                System.out.println(
                        "A. Check Balance\nA. Deposit \nB. Withdraw\nC. Exit"
                );

                do {
                    System.out.println("Enter Option");
                    option = scanner1.next().charAt(0);
                    System.out.println("\n");

                    switch (option) {
                        case 'A' -> {
                            System.out.println("\n");
                            System.out.println(balance = +balance);
                        }
                        case 'B' -> {
                            System.out.println("\n");
                            System.out.println("Enter Deposit Amount");
                            System.out.println("\n");
                            int amount = scanner1.nextInt();
                            deposit(amount);
                            System.out.println("\n");
                        }
                        case 'C' -> {
                            System.out.println("\n");
                            System.out.println("Enter Withdraw Amount");
                            System.out.println("\n");
                            int amount2 = scanner1.nextInt();
                            Withdraw(amount2);
                            System.out.println("\n");
                        }
                        case 'D' -> {
                            System.out.println("\n");
                            getPreviousTransactions();
                            System.out.println("\n");



                        }
                        default -> System.out.println("Incorrect Option");
                    }
                } while (option != 'E' );
                System.out.println("Thank You");
            }

        }
    }

}
