/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EMAM.oop.projects.bank_system.esraa_foda;

/**
 * @author power
 */
public class Account {
    private int id;
    private String email;
    private String name;
    private String nationalNumber;
    private float money;

    public int gettId() {
        return id;
    }

    public float gettmoney() {
        return money;
    }

    public String gettnationalNumber() {
        return nationalNumber;
    }

    public void settEmail(String email) {
        this.email = email;
    }

    public String gettEmail() {
        return email;
    }

    public void settName(String name) {
        this.name = name;
    }

    public String gettName() {
        return name;
    }

    public void deposite(double m) {
        money += m;
    }

    public void withdraw(double m) {
        money -= m;
    }

    Account(String email, int id, String N, String name, float money) {
        this.id = id;
        this.money = money;
        this.nationalNumber = N;
        this.name = name;
        this.email = email;
    }

    Account() {

    }

}
