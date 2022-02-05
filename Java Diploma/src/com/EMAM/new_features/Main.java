/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.new_features;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        jshell  9

//        Local Variable Type  10
        var n = 9;
        System.out.println(n);

//        text box 13
        String s = """
                Hello\s\
                World""";
        System.out.println(s);

//        switch statement 12-13
//        12
        int num = 432;
        switch (num % 10) {
            case 0, 2, 4, 6, 8 -> System.out.println("even");
            case 1, 3, 5, 7, 9 -> System.out.println("odd");
        }
//        13
        boolean isEven = switch (num % 10) {
            case 0, 2, 4, 6, 8 -> {
                System.out.println("even");
                yield true;
            }
            default -> {
                System.out.println("odd");
                yield false;
            }
        };
        int a = 4;
        int b = 4;
        char op = '+';
        double res = switch (op) {
            case '-' -> a - b;
            case '+' -> a + b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            case '^' -> Math.pow(a, b);
            default -> Double.NaN;
        };
        System.out.println(res);


//        New String Methods 11
//        isBlank, lines, strip, stripLeading, stripTrailing, and repeat.

//        New String Methods 11
//        indent, transform

//        New File Methods  11
//        readString and writeString

//        try with resources  9
        try (PrintWriter p = new PrintWriter("")) {

        } catch (FileNotFoundException e) {

        }


//        Immutable Set  9
        Set<String> strKeySet = Set.of("key1", "key2", "key3");

//        copyOf  10
        List<Integer> copyList = List.copyOf(new ArrayList<>());

//        Collection to an Array  11
        List sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = (String[]) sampleList.toArray(String[]::new);
//

//        Compact Number Formatting 12
        NumberFormat likesShort =
                NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        likesShort.setMaximumFractionDigits(2);
        System.out.println(likesShort.format(12546));



//        record  14,
        int[] arr = null;
        arr[0] = 1;
    }
}

interface InterfaceWithPrivateMethods {

    private static String staticPrivate() {
        return "static private";
    }

    //  9
    private String instancePrivate() {
        return "instance private";
    }

    default void check() {
        String result = staticPrivate();
        InterfaceWithPrivateMethods pvt = new InterfaceWithPrivateMethods() {
            // anonymous class
        };
        result = pvt.instancePrivate();
    }
}

