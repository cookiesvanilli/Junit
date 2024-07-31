package ru.netology;



public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount(-80_000, 500_000);
        SimpleAccount simpleAccount = new SimpleAccount(10_000);

        System.out.println(simpleAccount.add(70_000));
        System.out.println(simpleAccount.pay(10_000));
        System.out.println(simpleAccount.pay(20_000));
        System.out.println(simpleAccount.getBalance());
        System.out.println(simpleAccount.transfer(creditAccount, 5_000));
        System.out.println(simpleAccount.getBalance());
        System.out.println(simpleAccount.transfer(creditAccount, 1_000));
        System.out.println(simpleAccount.getBalance());
        System.out.println("--------");

        System.out.println(creditAccount.getBalance());
        System.out.println(creditAccount.pay(25_000));
        System.out.println(creditAccount.getBalance());
        System.out.println(creditAccount.pay(6_000));
        System.out.println(creditAccount.add(50_000));
        System.out.println(creditAccount.getBalance());
        System.out.println(creditAccount.transfer(simpleAccount, 120_000));
        System.out.println(creditAccount.getBalance());
        System.out.println(creditAccount.transfer(simpleAccount, 30_000));
        System.out.println(creditAccount.getBalance());

    }
}