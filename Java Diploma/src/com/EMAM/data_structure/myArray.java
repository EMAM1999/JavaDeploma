/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.data_structure;

import java.util.Scanner;

public class myArray {

}


 class Test {
    public static void main(String[] args) {
//        int nums[] = new int[5];
//        for (int i = 0; i < nums.length; i++) {
//            int x = input();
//            insert(nums, i - 1, x);
//        }
//        int x = binarySearch(nums, 17, 0, 4);
//        System.out.println(x);
//        System.out.println(count);

        int[] a1 = {9, 8, 7, 6, 5};
        int[] a2 = {4, 3, 2, 1, 0};
        int[] a = new int[a1.length + a2.length];
        for (int i = 0; i < a1.length; i++) {
            insert(a, i - 1, a1[i]);
        }
        for (int i = 0; i < a2.length; i++) {
            insert(a, a1.length+i - 1, a2[i]);
        }
        printArray(a);
    }

    static int count = 0;

    static int linearSearch(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            count++;
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] array, int n, int start, int end) {
        if (start > end) return -1;
        count++;
        int mid = (start + end) / 2;
        if (array[mid] > n) {
            return binarySearch(array, n, start, mid - 1);
        } else if (array[mid] < n)
            return binarySearch(array, n, mid + 1, end);
        else
            return mid;
    }


    static void insert(int[] array, int index, int num) {
        if (index == -1) {
            array[0] = num;
        }
        int i = index;
        for (; i >= 0; i--) {
            if (num < array[i]) {
                array[i + 1] = array[i];
            } else {
                array[i + 1] = num;
                break;
            }
        }
        if (i == -1) {
            array[0] = num;
        }

    }

    static void printArray(int[] array) {
        for (int ele : array) {
            System.out.print(ele + "  ");
        }
        System.out.println();
    }

    static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
