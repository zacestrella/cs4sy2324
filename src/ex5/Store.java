package ex5;
import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    this.earnings = 0;
    // Initialize itemList as a new ArrayList
    itemList = new ArrayList();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    boolean found = false;
    // check if index is within the size of the itemList 
    if ((index >= 0) && (index <= itemList.size())){
    // get Item at index from itemList and add its cost to earnings
    Item item = itemList.get(index);
    this.earnings += item.getCost();
    found = true;
    // print statement indicating the sale
    System.out.println(item.getName() + "was sold for $" + item.getCost());
    } // (if not, print statement that there are only x items in the store)
    if(!found){
    System.out.printf("Unfortunately there are only %d items in the store. Please try again %n", itemList.size());    
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    boolean found = false;
    for (Item i : itemList){
        if (i.getName()==(name)){
            this.earnings += i.getCost();
            found = true;
            System.out.printf("%s was sold for $ %.2f", name,i.getCost());
        }
    } if(!found){
        System.out.printf("Unfortunately our stores does not sell %s%n", name);
    }
    }
    
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
 if(itemList.contains(i)){
    this.earnings += i.getCost();
}
}
    
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.printf("Here are the items that are the same type as %s: \n", type);
    for (Item i : itemList){
       if (i.getType().equals(type)){
           System.out.println(i.getName());
       } 
    }
  }
  
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.printf("Here are the items that are lower than %.2f: \n", maxCost);
    for (Item i : itemList){
   if(i.getCost() <= maxCost){
       System.out.println(i.getName());
   }
    }
  }
  
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.printf("Here are the items that are higher than %.2f: \n", minCost);
    for (Item i : itemList){
    if(i.getCost() >= minCost){
       System.out.println(i.getName());
   }
    }
    
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
   for (Store i: storeList){
       System.out.printf("The store %s has earned $%.2f%n", i.getName(), i.getEarnings());
   }
  }
}