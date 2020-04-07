package collections_example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IterableExample {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("red","orange","yellow", "green", "blue", "violet");
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
