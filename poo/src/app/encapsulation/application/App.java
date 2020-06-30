package app.encapsulation.application;

import java.util.Locale;
import java.util.Scanner;

import app.encapsulation.entities.Account;

public class App {
    public static void main(final String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = input.nextInt();

        System.out.print("Enter account holder: ");
        String holder = input.next();

        System.out.println();
        System.out.print("Is There na initial deposit (y/n)? ");
        char question = input.next().charAt(0);
        if (question == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposite = input.nextDouble();
            account = new Account(number, holder, initialDeposite);
        } else {
            account = new Account(number, holder);
        }

        System.out.print("Account Data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposito = input.nextDouble();
        account.deposito(deposito);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value:");
        double saque = input.nextDouble();
        account.saque(saque);
        System.out.println("Enter a withdraw value:");
        System.out.println(account);

        System.out.println("Balance final");
        account.getBalance();

        input.close();
    }
}