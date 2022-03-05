/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EMAM.oop.projects.vehicles.raneem_yasser;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author HP
 */
public class Owner {
    String name;
    String registerNo;
    String address;
    String tel;
    LocalDate dateOfRegistration;

    LocalDate getDateOfRegistration() {

        return dateOfRegistration;
    }

    @Override
    public String toString() {
        return ("the name is" + name + "the registerNo " + registerNo + " and the tel " + tel + " and Date Of Registration is " + dateOfRegistration);
    }
}
