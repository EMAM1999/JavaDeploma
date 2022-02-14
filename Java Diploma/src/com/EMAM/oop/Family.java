/*
 * Copyright (c) $day.year. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.EMAM.oop;

public class Family {
    private Person father;
    private Person mother;
    private Person[] sons;
    private int sonsNum;

    public Family(Person father, Person mother) {
        this.father = father;
        this.mother = mother;
        this.sons = new Person[50];
        this.sonsNum = 0;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public Person[] getSons() {
        return sons;
    }

    public int getFamilyMembersNumber() {
        return 2 + sonsNum;
    }

    public void addSon(Person son) {
        sons[sonsNum] = son;
        sonsNum++;
    }
}
