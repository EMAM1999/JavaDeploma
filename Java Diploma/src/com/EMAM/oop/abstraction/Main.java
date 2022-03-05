/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop.abstraction;

//   u1  -->  ["mohamed"]
//   u2  -->  ["mohamed"]

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User("mohamed");
        User u2 = (User) u1.clone();
        u2.setUsername("Ahmed");

        System.out.println(u1.getUsername());
    }
}


// class  extends  class
// class  implements  interface1, interface2
// interface  extends  interface1, interface2


class User implements Cloneable {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


interface a {
}

interface b {
}

interface c extends a, b {
}

class Class1 implements a {
}

class Class2 implements a {
}

class Class3 implements a {
}

class Class4 implements a {
}



