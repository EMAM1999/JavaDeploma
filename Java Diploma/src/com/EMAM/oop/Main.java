/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop;

public class Main {
    public static void main(String[] args) {
//        Class and Objects
//        Student s1 = new Student();
//        s1.id = "1";
//        s1.name = "mohamed";
//        s1.age = 20;
//        s1.year = 2;
//        s1.GPA = 3;
//        System.out.println(s1.id);
//        System.out.println(s1.name);
//        System.out.println(s1.age);

//        Encapsulation
        Account a1 = new Account("Ahmed");
        System.out.println(a1.getId());
        Account a2 = new Account("Ahmed");
        System.out.println(a2.getId());
        Account a3 = new Account("Ahmed");
        System.out.println(a3.getId());
        Account[] accounts = new Account[3];

        accounts[0] = a1;
        accounts[1] = a2;
        accounts[2] = a3;
    }

}
