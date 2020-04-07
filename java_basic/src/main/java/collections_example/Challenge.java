package collections_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Challenge {

    public static void main(String[] args) {
        ArrayList<String> groceryItems = new ArrayList(Arrays.asList("Milk","Vegetables","Meat"));
        System.out.println("Grocery items: " + groceryItems);

        ArrayList<String> additionalItems = new ArrayList(Arrays.asList("water", "butter", "bread"));
        System.out.println("Additional items: " + additionalItems);

        groceryItems.addAll(additionalItems);
        System.out.println("Added additional items in main list: " + groceryItems);
        if(groceryItems.contains("Vegetables")){
            groceryItems.remove("Vegetables");
        }
        System.out.println("After Vegetables removing: " + groceryItems);
    }
}
