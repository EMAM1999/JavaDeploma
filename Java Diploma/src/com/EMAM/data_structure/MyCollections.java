/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.data_structure;

import java.time.LocalDate;
import java.util.*;

public class MyCollections {
    public static void main(String[] args) {
        Student student1 = new Student("Ahmed", 20);
        Student student2 = new Student("Mohamed", 21);
        Student student3 = new Student("Ali", 22);
        Student student4 = new Student("Mostafa", 23);


        Set students = new HashSet();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);

        List numbers = new ArrayList();
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(numbers);
        System.out.println(Arrays.asList(-1, -2, 3, 4, 5));
        numbers.retainAll(Arrays.asList(-1, -2, 3, 4, 5));
        System.out.println(numbers);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}