/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.new_features;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        jshell, var, text box,switch statement

        System.out.println("""
                info
                    name: mohamed
                    age:  23""");

        var x = 1.5;
        var y = x;
        var in = new Scanner(System.in);

        int num = 0;
        String s = "";
        s = switch (num) {
            case 0, 1, 2, 3, 4 -> {
                yield "work";
            }

            case 5, 6 -> "holiday";
            default -> "error";
        };
        System.out.println(s);
    }
}
