package collections.hashmap;

import java.util.HashMap;

public class HashMap_intro {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put("Steven", 23);
        map.put("Lizzy", 21);
        map.put("Karen", 28);

        // Retrieve a value associated with the key
        int ageOfKaren = map.get("Karen");
        System.out.println("Karen's age: "+ ageOfKaren);

        // Check if a key exists in the map
        if (map.containsKey("Steven")) {
            System.out.println("Steven is in the map.");
        }
    }
}
