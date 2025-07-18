package com.revature.day05;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Account {
    private double balance;

    private static final Logger logger= LoggerFactory.getLogger(Account.class);
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance=balance;

    }

        public double deposit(double amount){
           logger.info("inside the deposit method");
            System.out.println("inside deposit method");
            balance+=amount;
        return (this.getBalance()+amount);
    }
    public double withdraw(double amount){
        logger.warn("inside the withdraw method");
        System.out.println("inside withdraw method");
        balance-=amount;
        return (this.getBalance()-amount);

    }
}
