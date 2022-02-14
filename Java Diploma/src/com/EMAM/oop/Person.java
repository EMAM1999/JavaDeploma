/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private String NID;

    public Person(String firstName, String lastName, int age, String nationality, String NID) {
        this(firstName);
        this.nationality=nationality;
        this.NID =NID;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getNID() {
        return NID;
    }

}
