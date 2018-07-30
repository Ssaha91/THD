package intermidiateJava;

import java.util.ArrayList;

public class GroceryList {
    private static ArrayList<String> groceryItem = new ArrayList<String>();

    public static void main(String[] args) {

        groceryItem.add("Rice");
        groceryItem.add("Oil");
        groceryItem.add("sugar");
        groceryItem.add("flower");
        groceryItem.add("Rice");

        printGroceryItem();
        groceryItem.remove(4);
        printGroceryItem();

        addItem("Chiken");
        addItem("Vegatbles");

        removeItem(1);

        printGroceryItem();


    }

    public static void printGroceryItem(){
        System.out.println("You have " + groceryItem.size() + " Item in your list");
        for (int i =0; i<groceryItem.size(); i++){
            System.out.println(groceryItem.get(i));
        }
    }

    public static void addItem(String item){
        groceryItem.add(item);
    }
    public static void removeItem(int position){
        groceryItem.remove(position);
    }

}
