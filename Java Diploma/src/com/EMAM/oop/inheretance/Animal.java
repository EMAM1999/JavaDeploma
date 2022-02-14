/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop.inheretance;

public class Animal {
    String type;
    String color;
    int age;


    public Animal(String type, String color, int age) {
        this(type,age);
        this.color = color;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }


    public void speak(){
        System.out.println("hoof");
    }
}
