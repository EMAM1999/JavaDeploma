/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.basics;

import com.EMAM.oop.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base = input("Enter the base");
        int power = input("Enter the power");
        int res = power(base, power);
        System.out.println(res);
    }

     static int input(String s) {
        Scanner in = new Scanner(System.in);
        System.out.println(s);
        return in.nextInt();
    }

    static int power(int base, int power) {
        int res = 1;
        for (int i = 0; i < power; i++) {
            res *= base;
        }
        return res;
    }


}
