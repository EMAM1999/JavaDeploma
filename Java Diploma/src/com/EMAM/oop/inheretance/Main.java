/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop.inheretance;

public class Main {
    public static void main(String[] args) {
        Object[] objects = {"", 1, 2.5, true, ' ', new Circle(5)};


        Shape square = new Square(5);
        Shape triangle = new Triangle(3, 4, 5);
        Shape circle = new Circle(10);

        Shape[] shapes = new Shape[5];
        shapes[0] = square;
        shapes[1] = triangle;
        shapes[2] = circle;

        for (int i = 0; i < 3; i++)
            if (shapes[i] instanceof Square)
                System.out.println(((Square) shapes[i]).length);
            else if (shapes[i] instanceof Triangle) {
                Triangle t = ((Triangle) shapes[i]);
                System.out.println(t.aLength);
                System.out.println(t.bLength);
                System.out.println(t.cLength);
            } else if (shapes[i] instanceof Circle)
                System.out.println(((Circle) shapes[i]).radius);

            getArea(square);
    }

    public static double getArea(Shape s) {
        return s.getArea();
    }
}
