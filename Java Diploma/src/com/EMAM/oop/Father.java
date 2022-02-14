/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop;

public class Father {
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
    private String NID;

    public Father(String firstName, String lastName, int age, String nationality, String NID) {
        this(firstName,nationality,NID);
        this.lastName = lastName;
        this.age = age;
    }

    public Father(String firstName,String nationality, String NID) {
        this.firstName = firstName;
        this.nationality = nationality;
        this.NID = NID;
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
