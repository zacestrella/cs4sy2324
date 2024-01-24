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

class Restaurant {
    private String restoName;
    private double restoPrice;
    private String restoTheme;
    private String restoType;
    private ArrayList<MenuItems> restaurantMenu;
     

    public Restaurant(String restoName, double restoPrice, String restoTheme, String restoType) {
        this.restoName = restoName;
        this.restoPrice = restoPrice;
        this.restoTheme = restoTheme;
        this.restoType = restoType;
    }

    // Getters and Setters
    
    public ArrayList<MenuItems> getRestaurantMenu() {
        return restaurantMenu;
    }

    public String getRestoName() {
        return restoName;
    }

    public double getRestoPrice() {
        return restoPrice;
    }

    public String getRestoTheme() {
        return restoTheme;
    }

    public String getRestoType() {
        return restoType;
    }

    public ArrayList<MenuItems> createRandomizedMenu(String theme) {
    ArrayList<MenuItems> randomizedMenu = new ArrayList<>();

    // Categorize menu items based on nationality and match the theme
    for (MenuItems menuItem : MenuItems.getMenuItemsList()) {
        if (menuItem.getItemNationality().equals(theme)) {
            // If the item's nationality matches the theme, add it to the randomized menu
            randomizedMenu.add(menuItem);
        }
    }

    // Check if there are items in the randomized menu
    if (!randomizedMenu.isEmpty()) {
        // Generate a random number between 0 and the size of the array list
        int itemsToSelect = Math.min(5, randomizedMenu.size());

        // Create a smaller randomized menu by picking an item at the random index
        ArrayList<MenuItems> smallerRandomizedMenu = new ArrayList<>();
        
          for (int i = 0; i < itemsToSelect; i++) {
        smallerRandomizedMenu.add(randomizedMenu.get(i));
    }

    return smallerRandomizedMenu;
    } else {
        // Handle the case where there are no items in the randomized menu
        System.out.println("No items in the randomized menu.");
        return new ArrayList<>();
    }
}
    
    

 
    
}
    
 
