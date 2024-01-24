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

class MenuItems {
    private String itemName;
    private double itemPrice;
    private String itemType;
    private String itemNationality;
    private static ArrayList<MenuItems> menuItemsList = new ArrayList<>();

    public MenuItems(String itemName, double itemPrice, String itemType, String itemNationality) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemType = itemType;
        this.itemNationality = itemNationality;
        menuItemsList.add(this);
    }

    // Getters and Setters

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemType() {
        return itemType;
    }

    public String getItemNationality() {
        return itemNationality;
    }
    
    
    public static ArrayList<MenuItems> getMenuItemsList() {
        return menuItemsList;
    }
    
         public static void createSampleMenuItems() {
            // Japanese menu items
            MenuItems sushi = new MenuItems("Sushi", 20.0, "Food", "Japanese");
            MenuItems ramen = new MenuItems("Ramen", 15.0, "Food", "Japanese");
            MenuItems tempura = new MenuItems("Tempura", 10.0, "Sides", "Japanese");
            MenuItems sashimi = new MenuItems("Sashimi", 25.0, "Food", "Japanese");
            MenuItems udon = new MenuItems("Udon", 18.0, "Food", "Japanese");
            MenuItems yakitori = new MenuItems("Yakitori", 12.0, "Sides", "Japanese");
            MenuItems misoSoup = new MenuItems("Miso Soup", 8.0, "Sides", "Japanese");

            // Indian menu items
            MenuItems butterChicken = new MenuItems("Butter Chicken", 150.5, "Food", "Indian");
            MenuItems naan = new MenuItems("Naan", 50.0, "Sides", "Indian");
            MenuItems mangoLassi = new MenuItems("Mango Lassi", 75.0, "Drinks", "Indian");
            MenuItems chickenBiryani = new MenuItems("Chicken Biryani", 120.0, "Food", "Indian");
            MenuItems samosa = new MenuItems("Samosa", 15.0, "Sides", "Indian");
            MenuItems masalaChai = new MenuItems("Masala Chai", 10.0, "Drinks", "Indian");
            MenuItems paneerTikka = new MenuItems("Paneer Tikka", 90.0, "Sides", "Indian");
            MenuItems dosa = new MenuItems("Dosa", 40.0, "Food", "Indian");
            MenuItems alooGobi = new MenuItems("Aloo Gobi", 30.0, "Food", "Indian");

            // Greek menu items
            MenuItems moussaka = new MenuItems("Moussaka", 25.0, "Food", "Greek");
            MenuItems greekSalad = new MenuItems("Greek Salad", 15.0, "Sides", "Greek");
            MenuItems frappe = new MenuItems("Frappé", 10.0, "Drinks", "Greek");
            MenuItems souvlaki = new MenuItems("Souvlaki", 30.0, "Food", "Greek");
            MenuItems tzatziki = new MenuItems("Tzatziki", 12.0, "Sides", "Greek");
            MenuItems spanakopita = new MenuItems("Spanakopita", 20.0, "Appetizer", "Greek");
            MenuItems kleftiko = new MenuItems("Kleftiko", 35.0, "Food", "Greek");
            MenuItems fava = new MenuItems("Fava", 14.0, "Sides", "Greek");

        }

    }
