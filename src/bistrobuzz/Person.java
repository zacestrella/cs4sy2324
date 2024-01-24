/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bistrobuzz;

/**
 *
 * @author adahestrella
 */
import java.util.Scanner;


class Person {
    private String personName;
    private double balance = 5000;
    private String personPassword;
    private String personEmail;
    private String personCreditCard;
    


    public Person(String personName, double initialBalance, String personPassword) {
        this.personName = personName;
        this.personPassword = personPassword;
        this.personEmail = personEmail;
        this.personCreditCard = personCreditCard;
    }

    // Getters and Setters

    public String getPersonName() {
        return personName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPersonPassword() {
        return personPassword;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public String getPersonCreditCard() {
        return personCreditCard;
    }
    
    

    public void personPrint() {
        // Print person's information
        System.out.println("Name: " + getPersonName());
        System.out.println("Balance: $" + getBalance());
        // Print other information as needed
    }

    public void personAddBalance() {
        // Add to the user's balance with a maximum of $1,500
        double amountToAdd = getUserInputDouble("Enter the amount to add (max $1500): ");
        if (amountToAdd > 0 && amountToAdd <= 1500) {
            setBalance(getBalance() + amountToAdd);
            System.out.println("Amount added successfully. New balance: $" + getBalance());
        } else {
            System.out.println("Invalid amount. Maximum amount to add is $1500.");
        }
    }

    private double getUserInputDouble(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    
    public static double getBalance(String personName) {
        return 5000;
    }

}

