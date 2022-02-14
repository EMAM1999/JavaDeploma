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
        int num = 0;
        var in = new Scanner(System.in);
        String s = switch (num){
            case 0,1,2,3,6 -> "work";
            default -> "holiday";
        };
        System.out.println(s);
    }
}
