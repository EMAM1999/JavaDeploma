/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM;

import java.util.Scanner;

import static com.EMAM.console.print;
import static com.EMAM.console.input;
import static com.EMAM.parser.Int;

public class myClass {


    public static void main(String[] args) {
        new Scanner(System.in);
        int n = Int(input("Enter a number"));
        print(n);
    }
}





class parser {

    public static double Double(String s) {
        return Double.parseDouble(s);
    }

    public static float Float(String s) {
        return Float.parseFloat(s);
    }
    public static byte Byte(String s) {
        return Byte.parseByte(s);
    }
    public static short Short(String s) {
        return Short.parseShort(s);
    }
    public static int Int(String s) {
        return Integer.parseInt(s);
    }
    public static long Long(String s) {
        return Long.parseLong(s);
    }

}

class console {


    public static void print(Object o) {
        System.out.println(o);
    }

    public static String input() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public static String input(String message) {
        print(message);
        return input();
    }


}


class Math {
    public static int max(int... num) {
        int max = num[0];
        for (int n : num) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static double max(double... num) {
        double max = num[0];
        for (double n : num) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }


}


class arrays {


    public static void print(Object[] o) {
        for (Object ele : o) {
            System.out.println(ele);
        }
    }
}
