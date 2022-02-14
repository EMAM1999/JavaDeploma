package com.EMAM.oop.projects.bank_system.salma_elgohary;

/**
 * @author Salma Elgohary
 */
public class BankAccount {

    private final String phoneNum;
    private final String name;
    private final String id;
    private String summary;
    private double balance;
    private String password;
    private static int clientNum = 0;

    public BankAccount(String name, String phone) {
        this.name = name;
        this.phoneNum = phone;
        this.id = this.name + clientNum;
        this.summary = "";
        this.password = "0000aaaa";
        clientNum++;
    }

    public static int getAccountNum() {
        return clientNum;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phoneNum;
    }

    public boolean withdrow(double money) {
        if (0 <= money && money <= balance) {
            double oldBalance = balance;
            balance -= money;
            this.summary += "withdraw\t" + money
                    + "\n\t" + oldBalance + "\t=>\t" + balance + "\n";
            return true;
        }
        return false;
    }

    public boolean deposit(double money) {
        if (money >= 0) {
            double oldBalance = balance;
            balance += money;
            this.summary += "deposit\t" + money
                    + "\n\t" + oldBalance + "\t=>\t" + balance + "\n";
            return true;
        }
        return false;
    }

    public boolean transfer(double money, BankAccount to) {
        if (money > 0 && money <= this.balance) {
            double oldFromBalance = this.balance;
            this.balance -= money;
            this.summary += "transfer\t" + money + "\tto\t" + to.name
                    + "\n\t" + oldFromBalance + "\t=>\t" + balance + "\n";
            double oldToBalance = to.balance;
            to.balance += money;
            to.summary += "transfer\t" + money + "\tfrom\t" + this.name
                    + "\n\t" + oldToBalance + "\t=>\t" + to.balance + "\n";
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public boolean setPassword(String p) {
        if (p!=null &&!this.password.equals(p) && isValid(p)) {
            this.password = p;
            return true;
        }
        return false;
    }

    public boolean isValid(String pass) {
        if (pass.length() < 8 || pass.length() > 20) {
            return false;
        }
        int letters = 0, digits = 0;
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isLetter(ch)) {
                letters++;
            }
        }
        return !(digits < 2 || letters < 4);
    }

    public String getPassword() {
        return password;
    }

    public String getSummary() {
        return this.summary;
    }

}
