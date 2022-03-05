package com.EMAM.oop.projects.bank_system.abd_elrehem;
import java.util.Scanner;

class Account {

    private String Accountnum;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);

    //method to open new account  
    public void openAccount() {
        System.out.print("Enter Account No: ");
        Accountnum = sc.next();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    //method to display account details  
    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + Accountnum);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance);
    }

    //method to deposit money  
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    //method to withdraw money  
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
        }
    }

    //method to search an account number  
    public boolean search(String ac_no) {
        if (Accountnum.equals(ac_no)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}

public class BankingApp1 {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Account C[] = new Account[50];
        int index = 0;
        int num;
        do {
            System.out.println("for new account Enter : 1");
            System.out.println("for old account Enter : 2");
            System.out.println("To Exit Enter : 3");
            num = sc.nextInt();

            switch (num) {

                case 1:
                    C[index] = new Account();
                    C[index].openAccount();
                    index++;
                    int ch;
                        System.out.println("\n ***Banking System Application***");
                        System.out.println("1. Deposit the amount \n 2. Withdraw the amount");
                        System.out.println("Enter your choice: ");
                        ch = sc.nextInt();
                        switch (ch) {
                            case 1:
                                C[index].deposit();
                                C[index].showAccount();
                                break;
                            case 2:
                                C[index].withdrawal();
                                C[index].showAccount();
                                break;
                        }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to use: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    int i ;
                    for (i = index; i < C.length; i++) {
                        found = C[i].search(ac_no);
                    }
                    if (found) {
                        int ch1;
                        System.out.println("\n ***Banking System Application***");
                        System.out.println("1. Deposit the amount \n 2. Withdraw the amount");
                        System.out.println("Enter your choice: ");
                        ch1 = sc.nextInt();
                        switch (ch1) {
                            case 1:
                                C[i].deposit();
                                C[i].showAccount();
                                break;
                            case 2:
                                C[i].withdrawal();
                                C[i].showAccount();
                                break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3 : 
                    System.out.println("Tnx , see you soon ...");
                    break;
            }
 
    }while (num!=3);
}
}
