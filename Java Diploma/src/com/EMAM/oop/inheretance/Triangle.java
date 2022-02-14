/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop.inheretance;

public class Triangle extends SShape {
    double aLength;
    double bLength;
    double cLength;

    public Triangle(double aLength, double bLength, double cLength) {
        super(3);
        this.aLength = aLength;
        this.bLength = bLength;
        this.cLength = cLength;
    }

    @Override
    public double getCircumference() {
        return aLength + bLength + cLength;
    }

    @Override
    public double getArea() {
        return area;
    }


}
