/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpbank;

import java.util.Scanner;


public class SimpBank {

    static String accountName = "";
    static double balance = 0.0;
    static boolean accountCreated = false;
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int choice;
       
        do{
        System.out.println("\n\n----Bank App----");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
        System.out.println("Choose an option");
        
        choice = input.nextInt();
        
            switch (choice) {
                case 1: 
                    createAccount(input);
                    break;
                case 2:
                    deposit(input);
                    break;
                case 3:
                    withdraw(input);
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    System.out.print("Thank you for using the Bank App\n");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }    
        while (choice != 5);
        input.close();
    }
    static void createAccount(Scanner input){
        input.nextLine();
        System.out.print("Enter account name: ");
        accountName = input.nextLine();
        
        System.out.print("Enter starting balance: ");
        balance = input.nextDouble();
        
        accountCreated = true;
        System.out.print("Account created succesfully");
    }
    static void deposit(Scanner input){
        if (!accountCreated){
            System.out.print("Please create an account first.");
            return;
        }
        else{
            System.out.print("Enter deposit amount: ");
            double amount = input.nextDouble();
            balance += amount;
            
            System.out.print("deposit Succesful");
        }
    }
    static void withdraw(Scanner input){
        if(!accountCreated){
            System.out.print("Please create an account first");
            return;      
        }
        else{
            System.out.print("Enter amount to withdraw: ");
            double amount = input.nextDouble();
                if(amount > balance){
                    System.out.print("Insufficient funds.");
                }
                else{
                balance -= amount;
                System.out.print("Withdraw succesful.");
                System.out.print("\nCurrent Balance: " + balance);
                }
        }
    }
    static void checkBalance(){
        if(!accountCreated){
            System.out.print("Please create an account first");
            return;
        }
        else{
            System.out.print("Account name:" + accountName);
            System.out.print("\nAccount balance: GHC" + balance);
        }
    }
} 
   
        
    

