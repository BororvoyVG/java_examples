package objects_and_apis.data_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionMain {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olimpia");

        System.out.println(map);

        map.put("Alaska", "Jeneau");
        System.out.println(map);

        String capitol = map.get("Oregon");
        System.out.println("The capitol is " + capitol);

        map.remove("California");
        System.out.println(map);

//        List<String> states = new ArrayList<>();
//        states.add("California");
//        states.add("Oregon");
//        states.add("Washington");
//
//        for (String state: states
//             ) {
//            System.out.println(state);
//        }
//
//        states.remove("Oregon");
//
//        for (String state: states
//        ) {
//            System.out.println(state);
//        }
//
//        System.out.println("Washington is at position: " + states.indexOf("Washington"));
    }


}
