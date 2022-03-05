/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop.exception_handling;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        1.
//        int [] nums = {1,2,3,4,5};
//        System.out.println(nums[-1]);
//        2.
//        System.out.println(in.nextInt());
//        3.
//        System.out.println(5/0);
//        4.
//        Class[] c = new Class[2];
//        c[0].method();
        try {
            a(5);
        } catch (Exception e) {
        }

    }


    static void a(int n) throws Exception {
        b(n);
    }

    static void b(int n) throws Exception {
        c(n);
    }

    static void c(int n) throws Exception {
        if (n > 0) System.out.println(n);
        else {
            throw new Exception("");
        }
    }


}


class Class {
    void method() {
    }
}