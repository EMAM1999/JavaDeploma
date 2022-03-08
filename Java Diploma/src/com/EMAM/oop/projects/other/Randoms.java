/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop.projects.other;

public class Randoms {
    //1. ميثود بتجيب رقم عشوائي من بين رقمين
    // 2. ميثود بتجيب حرف عشوائي من بين الحروف الانجليزية
    // 3. ميثود بتاخد عينة الارقام وبتحسب نسبة اختيار رقم منهم عشوائي
    // 4. ميثود بتاخد العينة وبتحسب نسبة اختيار نفس العنصر مرتين ورا بعض
    public static void main(String[] args) {
        // [0, 1[ -> [0, 6[ -> [5, 11[ -> {5, 6, 7, 8, 9, 10}
//        System.out.println(probability(6, 2, 1, 2, 3, 4, 5, 6));
    }

    //    {0,0,1}  n^c   (count^c)/n^c
    static double probability(Object n, int c, Object... nums) {
        double count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (n == nums[i]) {
                count++;
            }
        }
        return count == 0 ? 0 : Math.pow(count, c) / Math.pow(nums.length, c);
    }

    //    {0,0,1}    count/size
    static double probability(Object n, Object... nums) {
        double count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (n == nums[i]) {
                count++;
            }
        }
        return count == 0 ? 0 : count / nums.length;
    }


    static int randInt(int start, int end) {
        return (int) (Math.random() * (end - start + 1) + start);
    }

    static char randChar(char start, char end) {
        return (char) ((int) (Math.random() * (end - start + 1) + start));
    }

}

