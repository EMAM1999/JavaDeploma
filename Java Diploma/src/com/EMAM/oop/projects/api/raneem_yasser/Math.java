package com.EMAM.oop.projects.api;

import java.util.Scanner;

/*
this class mad a few processes 
*addition -->to add number 1 to number 2
*subtraction --> to subtract number 1 to number 2
*multiplication --> to multiply number 1 of number 2 
*divition --> to divide number 1 by number 2
*factorial --> to have the factorial of the number
*power--> numper 1 is the power of the numper 2
* LastCommonFactor--> LastCommonFactor between numper 1 and numper 2 
*permutations
*Combination
*sumArray
*StundardMultiplication
*FirstDegreeEquation
*/
public class Math {

    public static final double PI = 3.14159265359;


    public static double addition(int n, int f) {
        int sum = n + f;
        return (sum);
    }

    public static double subtraction(int n, int t) {
        int sub = 0;
        if (n > t) {
            sub = n - t;
        } else {
            sub = t - n;
        }
        return sub;
    }

    public static double multiplication(int n, int m) {
        int mul = n * m;
        return mul;
    }

    public static double division(int n, int m) {
        double div = 0;
        if (m != 0) {
            div = n / m;
        } else {
            return Double.POSITIVE_INFINITY;
        }
        return div;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int j = 1; j <= n; j++) {
            fact *= j;
        }
        return fact;
    }

    public static int power(int n, int p) {
        int pow = 1;
        while (p != 0) {
            pow *= n;
            p = p - 1;
        }
        return pow;
    }

    public static int LastCommonFactor(int n, int p) {
        int m = 0;
        int f = n * p;
        for (int i = f; i > 1; i--) {
            if (n % i == 0 && p % i == 0) {
                m = i;
            } else {
                m = f;
            }
        }
        return m;
    }

    public static double permutations(int n, int p) {
        int per = 1;
        for (int j = n; j > n - p; j--) {
            per *= j;
        }
        return per;
    }

    public static double Combination(int n, int p) {
        double m = factorial(n) / (factorial(p) * factorial(n - p));
        return m;
    }

    public static int sumArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static int StandardMultiplication(int[] a) {
        int mult = 1;
        for (int i = 0; i < a.length; i++) {
            mult = mult * a[i];
        }
        return mult;
    }

    public static double FirstDegreeEquation(int a, int p) {
        double x = p / a;
        return (x);
    }

}
