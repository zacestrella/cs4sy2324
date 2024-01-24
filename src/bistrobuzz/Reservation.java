/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bistrobuzz;

/**
 *
 * @author adahestrella
 */
import java.util.ArrayList;
import java.util.Scanner;

class Reservation {
    private Restaurant restaurantChosen;
    private ArrayList<MenuItems> itemOrders = new ArrayList<>();
    private double expenseTracker = 0;
    private String preferredDate;
    private ArrayList<MenuItems> restaurantMenu;
    private double userBalance, newBalance, initialBalance;

    public Reservation(String personName) {
        this.userBalance = Person.getBalance(personName);
        this.newBalance = this.userBalance; 
        this.initialBalance = this.userBalance;
    }
    

    // Getters and Setters
    private double getInitialBalance() {
        return initialBalance;
    }
    
    public ArrayList<MenuItems> getRestaurantMenuItemsList() {
        return getRestaurantMenu();
    }

    public Restaurant getRestaurantChosen() {
        return restaurantChosen;
    }

    public void setRestaurantChosen(Restaurant restaurantChosen) {
        this.restaurantChosen = restaurantChosen;
    }

    public ArrayList<MenuItems> getItemOrders() {
        return itemOrders;
    }

    public double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(double userBalance) {
        this.userBalance = userBalance;
    }

    public double getExpenseTracker() {
        return expenseTracker;
    }

    public void setExpenseTracker(double expenseTracker) {
        this.expenseTracker = expenseTracker;
    }

    public String getPreferredDate() {
        return preferredDate;
    }

    public void setPreferredDate(String preferredDate) {
        this.preferredDate = preferredDate;
    }

    private int getUserInputInt(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private String getUserInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
     /**
     * @return the restaurantMenu
     */
    public ArrayList<MenuItems> getRestaurantMenu() {
        return restaurantMenu;
    }

    /**
     * @param restaurantMenu the restaurantMenu to set
     */
    public void setRestaurantMenu(ArrayList<MenuItems> restaurantMenu) {
        this.restaurantMenu = restaurantMenu;
    }
    
    
    /**
     * @return the newBalance
     */
    public double getNewBalance() {
        return newBalance;
    }

    /**
     * @param newBalance the newBalance to set
     */
    public void setNewBalance(double newBalance) {
        this.newBalance = newBalance;
    }

    

    public void displayMenuItems(ArrayList<MenuItems> menuItems) {
    int index = 1;
    for (MenuItems menuItem : menuItems) {
        System.out.println(index + ". " + menuItem.getItemName() + " - $" + menuItem.getItemPrice());
        index++;
    }
}

    /**
     * @param itemOrders the itemOrders to set
     */
    public void setItemOrders(ArrayList<MenuItems> itemOrders) {
        this.itemOrders = itemOrders;
    }
    
   private ArrayList<Restaurant> getAvailableRestaurants() {
    // Return the list of available restaurants (could be fetched from a database)
    ArrayList<Restaurant> restaurants = new ArrayList<>();
    restaurants.add(new Restaurant("Japanese Delight", 20.0, "Japanese", "Buffet"));
    restaurants.add(new Restaurant("Indian Feast", 30.0, "Indian", "Buffet"));
    restaurants.add(new Restaurant("Greek Tavern", 25.0, "Greek", "Cafe"));
    return restaurants;
}

    private void displayRestaurants(ArrayList<Restaurant> restaurants) {
    int index = 1;
    for (Restaurant restaurant : restaurants) {
        System.out.println(index + ". " + restaurant.getRestoName());
        index++;
    }}
   
    
public void chooseRestaurant() {
    System.out.println("Choose a Restaurant:");
    ArrayList<Restaurant> restaurants = getAvailableRestaurants();
    displayRestaurants(restaurants);

    int choice = getUserInputInt("Enter the number of your chosen restaurant: ");
    if (choice >= 1 && choice <= restaurants.size()) {
        Restaurant chosenRestaurant = restaurants.get(choice - 1);
        setRestaurantChosen(chosenRestaurant);
        System.out.println("\nGreat choice! You've selected: " + chosenRestaurant.getRestoName());
        
        chooseDate();

        chooseItem(chosenRestaurant);
    } else {
        System.out.println("Invalid choice.");
    }
}

public void chooseItem(Restaurant chosenRestaurant) {
    System.out.println("\nSelect your menu items for " + chosenRestaurant.getRestoName() + ":");

    ArrayList<MenuItems> smallerRandomizedMenu = chosenRestaurant.createRandomizedMenu(chosenRestaurant.getRestoTheme());

    ArrayList<MenuItems> orderedItems = new ArrayList<>(); // Track ordered items
    ArrayList<Integer> quantities = new ArrayList<>(); // Track corresponding quantities
    double expenseTracker = 0.0; // Track total expense

    while (true) {
        displayMenuItems(smallerRandomizedMenu);

        System.out.println("Enter the number of your chosen item or type 'Finished' to complete your order: ");
        String userInput = getUserInput("Your choice: ");

        if (userInput.equalsIgnoreCase("Finished")) {
            break;
        }

        try {
            int itemChoice = Integer.parseInt(userInput);
            if (itemChoice >= 1 && itemChoice <= smallerRandomizedMenu.size()) {
                MenuItems chosenItem = smallerRandomizedMenu.get(itemChoice - 1);

                // Ask for quantity
                int quantity = getUserInputInt("\nHow many " + chosenItem.getItemName() + " do you want? ");
                if (quantity > 0) {
                    orderedItems.add(chosenItem);
                    quantities.add(quantity);
                    expenseTracker += chosenItem.getItemPrice() * quantity;
                    System.out.println("You've added: " + quantity + " " + chosenItem.getItemName());
                } else {
                    System.out.println("Invalid quantity. Please enter a number greater than 0.");
                }
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number or 'Finished'.");
        }
    }

    // Calculate the new balance
    newBalance = getUserBalance()- expenseTracker;
    setUserBalance(newBalance);

    // Set the ordered items to the Reservation instance
    setItemOrders(orderedItems);

    System.out.println("\nReceipt:");
    System.out.println("-----------");

    for (int i = 0; i < orderedItems.size(); i++) {
        MenuItems item = orderedItems.get(i);
        int quantity = quantities.get(i);
        System.out.println(item.getItemName() + " - Quantity: " + quantity +
                " - $" + item.getItemPrice() * quantity);
    }

    System.out.println("-----------");
    System.out.println("Total: $" + expenseTracker);
    System.out.println("Thank you for your order!");
}


 
    public void chooseDate() {
        setPreferredDate(getUserInput("Enter the date for your reservation (YYYY-MM-DD): "));
    }

 public void changeFoodOrder() {
        if (!getItemOrders().isEmpty()) {
            // Display the current order
            System.out.println("\nCurrent Food Order:");
            displayFoodOrder();

            String changeOrder = getUserInput("\nDo you want to change your food order? (yes/no): ");
            if (changeOrder.equalsIgnoreCase("yes")) {
                // Reset newBalance to the initial balance
                setUserBalance(getInitialBalance());

                // Remove the existing order
                getItemOrders().clear();

                // Choose new items
                chooseItem(getRestaurantChosen());

                // Display the updated order
                System.out.println("\nUpdated Food Order:");
                displayFoodOrder();
            } else {
                System.out.println("Food order not changed.");
            }
        } else {
            System.out.println("No food items ordered yet. Please place an order first.");
        }
    }



private void displayFoodOrder() {
    for (MenuItems item : getItemOrders()) {
        System.out.println(item.getItemName() + " - $" + item.getItemPrice());
    }
}

public void computeBalance() {
    // Get the most up-to-date balance from the Person instance
    System.out.println("Your current balance: $" + getNewBalance() + "\n");
}

    public void exitApplication() {
        System.out.println("\nThank you for using BistroBuzz!");
        System.exit(0);
    }
}