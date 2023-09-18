package collections.hashmap;

import javax.sound.midi.Soundbank;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> dogs = new LinkedHashMap<>();
        dogs.put(101, "Roxy");
        dogs.put(102, "Bronx");
        System.out.println(dogs);

        dogs.putIfAbsent(103, "Pepper");
        System.out.println(dogs);

        dogs.computeIfAbsent(105, k -> "Duke");
        System.out.println(dogs);

        dogs.computeIfPresent(101, (k, v) -> v.toUpperCase() + "!!!");
        System.out.println(dogs);

        dogs.compute(101, (k, v) -> k + ": " + v);
        System.out.println(dogs);

        System.out.println(dogs.get(105));
        System.out.println(dogs.keySet());
        System.out.println(dogs.values());
        System.out.println(dogs);

        for(Map.Entry<Integer, String> entry: dogs.entrySet()) {
            System.out.println(entry.getKey() +":"+ entry.getValue());
        }

    }
}
