/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop.array_of_objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = 0;
        User[] users = new User[10];

        User u1 = new User("ahmed", "ahmed@ex.com", "123");
        User u2 = new User("mohamed", "mohamed@ex.com", "123");
        User u3 = new User("ali", "ali@ex.com", "123");

//        String name = in.next();
//        String email = in.next();
//        String pass = in.next();
//        User u4 = new User(name, email, pass);

        users[index++] = u1;
        users[index++] = u2;
        users[index++] = u3;
//        users[index++] = u4;


        String key = "ali";
        for (int i = 0; i < index; i++) {
            if (users[i].getUsername().equalsIgnoreCase(key)) {
                System.out.println(users[i]);
                break;
            }
        }
    }
}


class User {
    private String username;
    private final String email;
    private String password;
    private static int usersCount = 0;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.usersCount++;
    }

    public static int getUserCount() {
        return usersCount;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}