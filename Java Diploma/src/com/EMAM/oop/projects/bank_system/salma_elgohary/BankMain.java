/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.EMAM.oop.projects.bank_system.salma_elgohary;


import java.util.Scanner;

/**
 *
 * @author Salma Elgohary
 */
public class BankMain {

    /* steps:
     *step 1.continue or exit
     *step 2.old or new
     *step 3.old:  id=>    found:    step 4.ask for password
     *             =>    not found: error message + step(2)
     * password=> true:  5.open operation - choose one or exit -choose another or exit.
     *              => false: error massage + step(4)
     *new: (set the account as an object of array of objects)
     *ask for information (set new Id) + step(4)  
     *=> valid => deposit - choose another operation or exit.
     *=> notValid => error message  + step(4) 
     * operations: 1-deposit , 2-withdraw, 3-transfer , 4-check balance , 5-check bank statement  , 6-change password 7-exit
     * */
    static String hint = "\033[31m" + "Hint:\n"+"\033[30m";
    static Scanner input = new Scanner(System.in);
    static BankAccount[] clients = new BankAccount[5000];
    static BankAccount currentAccount;
    static BankAccount toAccount;

    public static void main(String[] args) {
        welcomeMessage();
    }

    public static void welcomeMessage() {
        char in;
        do {
            System.out.println("**\t**\t**\n\nWelcome to our Bank system. \n1-continue.\n2-exit.");
            in = input.next().charAt(0);
            switch (in) {
                case '1':
                    getUserChoice();
                    break;
                case '2':
                    break;
                default: {
                    System.out.println("You have entered an invalid option!!\n Try again.");
                    stopForSeconds(2);
                }
            }
        } while (in != '2');
    }

    public static void getUserChoice() {
        System.out.println("Please enter the number of appropriate choice from the following list."
                + "\n 1_ old client.\n2_ new client. ");
        char choice = input.next().charAt(0);
        switch (choice) {
            case '1':
                oldAccount();
                break;
            case '2':
                newAccount();
                break;
            default: {
                System.out.println("You have entered a nonexistent choice!!\n Try again.");
                stopForSeconds(2);
                getUserChoice();
            }
        }
    }

    public static void newAccount() {
        System.out.print("Enter your phone number:");
        String phone = input.next();
        System.out.print("Enter your name:");
        String name = input.next();
        currentAccount = clients[BankAccount.getAccountNum()] = new BankAccount(name, phone);
        printId();
    }

    public static void printId() {
        System.out.println("Your id is: " + currentAccount.getId()
                + "\n" + hint + "Remember it very well as you will enter the next time using it.");
        stopForSeconds(1);
        setNewPassword();
    }

    public static void setNewPassword() {
        changePassword();
        System.out.println("Now you already have an account. please deposit an amount of money.");
        deposit();
        stopForSeconds(2);
        chooseAnotherOperation();
    }
    
    public static void oldAccount() {
        System.out.print("Enter your id:");
        String id = input.next();
        for (BankAccount client : clients) {
            if (!(id.equals(client.getId()))) {
                System.out.println("There is no an old account with this id. "
                        + "Set a new account if you haven't.");
                getUserChoice();
            } else {
                currentAccount = client;
                checkPassword();
                break;
            }
        }
    }

    public static void checkPassword() {
        System.out.println("Enter your password:");
        String pass = input.next();
        if (currentAccount.getPassword().equals(pass)) {
            operations();
            stopForSeconds(2);
        } else {
            System.out.print("Wrong password!!\nTry again.");
            stopForSeconds(2);
            checkPassword();
        }
    }

    public static void operations() {
        System.out.println("Enter the option you want from the following list: \n1-withdrow \n2-deposit"
                + "\n3-transfer \n4-checkBalance.\n5-printAccountStatement. \n6_change password. \n7- exit");
        char op = input.next().charAt(0);
        switch (op) {
            case '1':
                withdrow();
                chooseAnotherOperation();
                break;
            case '2':
                deposit();
                chooseAnotherOperation();
                break;
            case '3':
                transfer();
                chooseAnotherOperation();
                break;
            case '4':
                checkBalance();
                chooseAnotherOperation();
                break;
            case'5':
                printAccountStatement();
                chooseAnotherOperation();
                break;
            case '6':
                changePassword();
                chooseAnotherOperation();
                break;
            case '7':
                break;
            default:
                System.out.println("You have entered a nonexistent choice!!\n Try again.");
                operations();
        }

    }
    
    public static void chooseAnotherOperation() {
        System.out.print("Now if you want to do any another opreation. ");
        operations();
    }

    public static void withdrow() {
        System.out.print("Enter the value of money you want to withdrow:");
        double m = input.nextDouble();
        if (currentAccount.withdrow(m)) {
            System.out.println("Done. Now your balance is: $ " + currentAccount.getBalance());
        } else {
            System.out.println("Your balance is only $ " + currentAccount.getBalance() + ". Try again.");
            withdrow();
        }
    }

    public static void deposit() {
        System.out.print("Enter the value of money:");
        double m = input.nextDouble();
        if (currentAccount.deposit(m)) {
            System.out.println("$ " + m + " deposited successfully. Now your balance is: $ " + currentAccount.getBalance());
        } else {
            System.out.println("Invalid deposition.Please try again.");
            deposit();
        }
    }

    public static void transfer() {
        System.out.print("Enter the id of the account.");
        String id=input.next();
        if(id.equals(currentAccount.getId())){
            System.out.println("Transfer couldn't done to your account. Enter the correct id");
            transfer();
        }
        searchForId(id);
    } 
      
    public static void searchForId(String id){
        for (BankAccount client : clients) {
            if (!(id.equals(client.getId()))) {
                System.out.println("There is no an account with this id. "
                        + "Enter the id correctly.");
                transfer();
            } 
            else {                
                 toAccount = client;
                System.out.print("Enter the value of money you want to transfer:");
                double money = input.nextDouble();
                ensureTranfer( money);
                break;
            }
        }
    }
    
    public static void ensureTranfer(double money){
        System.out.println("Are you sure you want to transfer $ "+money+" to the account with id : "+toAccount.getId()
        +"\n1_Yes,sure.\n2_No.Edit input.\n3_Return to the operation list");
        int c= input.nextInt();
        switch (c) {
            case 1:  
                if(currentAccount.transfer(money, toAccount)){
                    System.out.println("Transfering done successfully.");
                } 
                else{
                    System.out.println("Invalid transfer.Your Balance is only : $ "+currentAccount.getBalance());
                    transfer();
                }
                break;
            case 2: 
                transfer();               
                break;
            case 3:
                operations();                
                break;                
            default:
                System.out.println("Wrong option.Try again.");
                ensureTranfer(money);
        }
    }
    
    public static void checkBalance() {
        System.out.println("My dear client, your balance is: $ " + currentAccount.getBalance());
    }

    public static void changePassword() {
        System.out.println("Please enter a strong password for your account:\n"
                + hint + "Strong Password should be between (8&20) characters and also have at least 2 digits & 4 letters");
        String pass = input.next();
        if (currentAccount.setPassword(pass)) {
            System.out.println("Done successfully.");
        } else {
            System.out.println("Invalid password. Enter another one.");
            changePassword();
        }
    }
    
    public static void  printAccountInformation(){
       System.out.println("Our dear client:"+currentAccount.getName()+"\nPhone: "+currentAccount.getPhone()
       +"\nId: "+currentAccount.getId());
    }
    
     public static void  printAccountStatement(){
         printAccountInformation();
        System.out.println(currentAccount.getSummary());
        stopForSeconds(3);
    }    

    public static void stopForSeconds(long s) {
        try {
            Thread.sleep(s * 1000);
        } catch (Exception e) {
        }
    }

}
