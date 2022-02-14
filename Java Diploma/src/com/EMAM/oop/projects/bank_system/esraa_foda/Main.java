/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EMAM.oop.projects.bank_system.esraa_foda;

import java.util.Scanner;

/**
 * @author power
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Type Account(New or Old )");
        String type = sc.nextLine();
        if (type == "New") {
            System.out.println("Enter Account Name");
            String name = sc.nextLine();
            System.out.println("Enter All Data ");

            String email = sc.nextLine();
            String nationalNumber = sc.nextLine();
            int id = sc.nextInt();
            float money = sc.nextFloat();

        } else {
            System.out.println("Enter Id");
            int id = sc.nextInt();
            Account obj[] = new Account[3];
            obj[0] = new Account("esraa@1232.com", 123, "12345678", "Esraa", 900000000f);
            obj[1] = new Account("yasmeen@1232.com", 7896, "534326789", "yasmeen", 50000000f);
            obj[2] = new Account("esraa@1232.com", 5432, "87654321", "zhraa", 7000000f);
            for (int i = 0; i < obj.length; i++)
                if (obj[i].gettId() == id) {
                    System.out.println("Email is " + obj[i].gettEmail());
                    System.out.println("Id " + obj[i].gettId());
                    System.out.println("NationalNumber is " + obj[i].gettnationalNumber());
                    System.out.println("Money is " + obj[i].gettmoney());
                    System.out.println("Name is " + obj[i].gettName());
                }
            Account Ac = new Account();
            System.out.println("What do you want \n 1. Deposite . \n 2. Withdraw");
            int choice = sc.nextInt();
            while (choice != 0) {

                switch (choice) {
                    case 1:
                        System.out.println("What is your deposite");
                        float deposite = sc.nextFloat();
                        Ac.deposite(deposite);

                        System.out.println("Your new diposite is " + Ac.gettmoney());
                        break;
                    case 2:
                        System.out.println("What is your Withdrawn");
                        float withdrawn = sc.nextFloat();
                        if (Ac.gettmoney() - withdrawn > 0) {
                            Ac.withdraw(withdrawn);
                            System.out.println("Your new money is " + Ac.gettmoney());
                        } else
                            System.out.println("you not find your operation");
                    default:
                }
            }


        }
    }


}
