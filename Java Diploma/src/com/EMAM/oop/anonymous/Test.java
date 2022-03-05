/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop.anonymous;

public class Test {

    //    outer class
//    inner class
//    anonymous class
    public static void main(String[] args) {
//        new Class() {
//            void m12() {
//                m1();
//                m2();
//            }
//        }.m12();

//        "123+152"

        double result = calculate("12-3");
        System.out.println(result);
    }

    public static double calculate(String eq) {
//        1. take the char
//        2. check if number
//        3. jump
//        4. is end
//        5. do operation


        return new Object() {
            int index = 0;

            double calc() {
                double n1 = getNumber();
                char op = getOperator();
                double n2 = getNumber();
                switch (op) {
                    case '+':
                        return n1 + n2;
                    case '-':
                        return n1 - n2;
                    case '*':
                        return n1 * n2;
                    case '/':
                        return n1 / n2;
                }
                return Double.NaN;
            }

            double getNumber() {
                String n = "";
                while (!isEnd()) {
                    char c = getNext();
                    if (Character.isDigit(c)) {
                        n = n + c;
                    } else {
                        index--;
                        break;
                    }
                }
                return Double.parseDouble(n);
            }

            char getOperator() {
                return getNext();
            }

            char getNext() {
                return eq.charAt(index++);
            }

            boolean isEnd() {
                return index == eq.length();
            }
        }.calc();

    }


}

class Class {

    void m1() {
        System.out.println("m1");
    }

    void m2() {
        System.out.println("m2");
    }

}



