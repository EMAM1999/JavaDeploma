/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop;

public class Account {

//  public   private    protected

    private String id;
    private String name;
    private double money;
    private static int accountsNum = 0;


    public Account(String name) {
        this.accountsNum++;
        this.id = accountsNum + "" + name.charAt(0) + "BANK";
        this.name = name;
        this.money = 0;
    }

    public Account(String n, double m) {
        this(n);
        this.money = m;
    }

    void withdraw(double money) {
        this.money -= money;
    }

    void deposit(double m) {
        this.money += m;
    }

    public static int getAccountsNum() {
        return accountsNum;
    }

    public void setName(String n) {
        if (!(n == null || n.trim().isEmpty()))
            name = n.toLowerCase().trim();
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }
}
