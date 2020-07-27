package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.AbstractCollection;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);
        // BusinessAccount acc5 = (BusinessAccount)acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc6 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());
    }
}
