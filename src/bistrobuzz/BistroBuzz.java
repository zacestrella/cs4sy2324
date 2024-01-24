/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bistrobuzz;

/**
 *
 * @author adahestrella
 */
import java.util.Scanner;

// BistroBuzz.java

// ... (existing imports)

public class BistroBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create sample menu items
        MenuItems.createSampleMenuItems();

        // Welcome message
        System.out.println("Welcome to BistroBuzz! Kindly Input Your Name and Password.");
        System.out.print("Name: ");
        String personName = scanner.nextLine();

        // Check if the user already has an account or create a new one
        System.out.print("Password: ");
        String personPassword = scanner.nextLine();

        double initialBalance = 5000.0;
        double expenseTracker = 0.0;

        // Create a new Person instance
        Person person = new Person(personName, initialBalance, personPassword);

        // Create a single instance of Reservation
        Reservation reservation = new Reservation(personName);

        // Main menu loop
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("(a) Reserve a Restaurant");
            System.out.println("(b) Change Date of Reservation");
            System.out.println("(c) Change Food of Reservation");
            System.out.println("(d) Check your Money Balance");
            System.out.println("(e) Exit the Application\n");

            // User input
            System.out.print("Your choice: ");
            String choice = scanner.nextLine();

            // Switch based on user's choice
            switch (choice.toLowerCase()) {
                case "a":
                    reservation.chooseRestaurant();
                    break;
                case "b":
                    reservation.chooseDate();
                    break;
                case "c":
                    reservation.changeFoodOrder();
                    break;
                case "d":
                    reservation.computeBalance();
                    break;
                case "e":
                    reservation.exitApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
