package com.EMAM.oop.projects.bank_system.raneem_yasser;

import java.util.Scanner;

public class Bank {

    /* we need to make an account in bank 
    the user either have an account or want to have a new one
     */
    public static Account[] a = new Account[10000];
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        the program ask the user to choose 1 if he have account 
        and 2 if he want a new one 
        and 0 if he want to exit 
        
         */
        System.out.println("\033[31m" + "did you have an account ?");
        System.out.println("\033[32m" + "1-Yes, i already have one .");
        System.out.println("\033[32m" + "2-No, i want to have one .");
        System.out.println("\033[32m" + "0-to exit ");
        int choose = s.nextInt();

        while (choose != 0 && choose == 1 || choose == 2) {
            switch (choose) {
                case 1:
                    /*
                    if the user choose 1 we will make a pointer wake on the array 
                    and count the indexes of the array until it reach a null index 
                    so if the account is exist the number of the id will be less than 
                    the numper of the first null index
                    then if it is in existed the program ask the user to enter the 
                    password if it is equal to the passpord of the account it will continue 
                     */
                    int acc = 0;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] != null) {
                            acc += 1;
                        }
                    }
                    System.out.println("\033[35m" + "please enter the id of your account");
                    int id = s.nextInt();
                    if (id <= acc) {
                        System.out.println("hi " + a[id].getname() + " please enter the password of your account  ");
                        String p = s.next();
                        if (a[id].getpassword() == p) {
                            /*
                            th eprogram ask the user to choose what he want to do in the account 
                             */
                            System.out.println("\033[31m" + "What you want to do ");
                            System.out.println("\033[32m" + "1-deposit.");
                            System.out.println("\033[32m" + "2-withdraw.");
                            int ch = s.nextInt();
                            switch (ch) {
                                /*
                                if the user choose 1 we will add the numper he want to  his account 
                                but the numper must be greater than 0
                                
                                 */
                                case 1:
                                    System.out.println("\033[35m" + "please enter the many you want ");
                                    int m = s.nextInt();
                                    while (m > 0) {
                                        a[id].deposit(m);

                                        System.out.println("\033[37m" + "the prosses is sucessful  and your mony is " + a[id].getMoney());
                                    }
                                    System.out.println("\033[31m" + "this is rong numper please enter a numper greater than 0 ");
                                case 2:
                                    /*
                                    if the user choose 2 Wew will subtract the number he want to his account 
                                     but the numper must be greater than 0
                                     */
                                    System.out.println("\033[31m" + "please enter the many you want ");
                                    int n = s.nextInt();
                                    while (n > 0) {
                                        a[id].withdraw(n);

                                        System.out.println("\033[37m" + "the prosses is sucessful  and your mony is " + a[id].getMoney());
                                    }
                                    System.out.println("\033[31m" + "this is rong numper please enter a numper greater than 0 ");
                            }
                        } else {
                            System.out.println("\033[31m" + "sorry you enter a wrong password ");
                        }

                        break;
                    } else {
                        System.out.println("\033[31m" + "i am sorry we didnot find this Accont please enter the write id ");
                    }
                case 2:
                    /*
                    if the user choose 2 that mean he want to add anew  account 
                    we will make a pointer to reach the first id that is empty to put the new account in 
                    we will create the new acount by full the emformation from the user 
                     */
                    int f = 0;
                    for (int i = 0; i < a.length; i++) {
                        if (a[i] == null) {
                            f = i;
                            break;
                        }
                    }

                    System.out.println("pleae enter your name ");
                    String k = s.next();
                    System.out.println("pleae enter the password ");
                    String pass = s.next();
                    System.out.println("your id is " + f);
                    a[f] = new Account(k, f, pass);
                    System.out.println("\033[31m" + "What you want to do ");
                    System.out.println("\033[31m" + "1-deposit.");
                    System.out.println("\033[32m" + "2-clouds.");
                    int cho = s.nextInt();
                    switch (cho) {
                        case 1:
                            /*
                            we ask the user to choose what he want to do 
                             if the user choose 1 we will add the numper he want to  his account 
                                but the numper must be greater than 0
                             */
                            System.out.println("\033[31m" + "please enter the many you want ");
                            int m = s.nextInt();
                            if (m > 0) {
                                a[f].deposit(m);

                                System.out.println("\033[33m" + "the prosses is sucessful  and your mony is " + a[f].getMoney());
                            } else {
                                System.out.println("\033[33m" + "this is rong numper please enter a numper greater than 0 ");
                            }
                            break;
                        case 2:
                            /*
                                    if the user choose 2 Wew will subtract the number he want to his account 
                                     but the numper must be greater than 0
                             */
                            System.out.println("\033[31m" + "please enter the many you want ");
                            int n = s.nextInt();
                            if (n > 0) {
                                a[f].withdraw(n);

                                System.out.println("the prosses is sucessful  and your mony is " + a[f].getMoney());
                            } else {
                                System.out.println("this is rong numper please enter a numper greater than 0 ");
                            }
                            break;
                    }

                    break;

            }
            /*
            we will do what we did before
             */
            System.out.println("\033[31m" + "do you want to do any extra process? if you want do you have account or not ?");
            System.out.println("\033[32m" + "1-Yes i have oready one .");
            System.out.println("\033[32m" + "2-No , i want to have one .");
            System.out.println("\033[32m" + "0-i want to exit ");
            choose = s.nextInt();
        }

        System.out.println("you are out .");
    }

}
