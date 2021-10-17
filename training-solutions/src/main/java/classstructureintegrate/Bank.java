package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your account number?");
        String accountNumber = scanner.nextLine();

        System.out.println("What is your name?");
        String owner = scanner.nextLine();

        System.out.println("Your start balance?");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);
        System.out.println(bankAccount.getInfo());

        System.out.println("Deposit: ");
        int deposit = scanner.nextInt();
        bankAccount.deposit(deposit);
        System.out.println("New balance: " + bankAccount.getInfo());

        System.out.println("Withdraw: ");
        int withdraw = scanner.nextInt();
        bankAccount.withdraw(withdraw);
        System.out.println("New balance: " + bankAccount.getInfo());

    }

}