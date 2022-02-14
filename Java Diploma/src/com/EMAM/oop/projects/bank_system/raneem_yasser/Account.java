package com.EMAM.oop.projects.bank_system.raneem_yasser;

/*
we will make a class of Acount to made the object from it 
 */
public class Account {

    private String name;
    private int id;
    private int money;
    private String password;

    public Account(String n, int id, String password) {

        name = n;
        this.id = id;
        this.password = password;
    }

    public Account(int id) {
        this.id = id;

    }

    public String getpassword() {

        return (password);

    }

    public String getname() {

        return (name);

    }

    public int deposit(int m) {
        money = money + m;
        return (money);
    }

    public int withdraw(int n) {
        money = money - n;
        return (money);
    }

    public int getMoney() {
        return money;

    }
}
