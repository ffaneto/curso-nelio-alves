package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main35 {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);

        BusinessAccount bAcc = new BusinessAccount(1002, "Maria", 0.0, 500);

        // UPCASTING

        Account acc1 = bAcc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        //  BusinessAccount acc5 = (BusinessAccount) acc3;

        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(2);
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account acc6 = new Account(1007, "Alex2", 1000.0);
        acc6.withdraw(200);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1008, "Alex3", 1000.0,0.01);
        acc7.withdraw(200);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1009, "Alex4", 1000.0,500);
        acc8.withdraw(200);
        System.out.println(acc8.getBalance());

        Account x = new Account(1020, "Alex", 1000.0);

        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50);
        y.withdraw(50);

        System.out.println(x.getBalance());

        System.out.println(y.getBalance());
    }
}
