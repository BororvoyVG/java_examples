package collections_example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,1,2,3,5,8,13,21,34,55);
        System.out.println("position of 21: " + integerList.indexOf(21));
        System.out.println("position of 21: " + Collections.binarySearch(integerList, 21));
    }
}
