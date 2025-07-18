package com.revature.day05;

public class AccountMain {
    public static void main(String[] args) {
        Account account=new Account();
        account.setBalance(1000);
        System.out.println("balance after deposit : " + +account.deposit(300));
        System.out.println("balance after withdraw : " + +account.withdraw(200));


    }
}
