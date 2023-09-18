package collections.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

// LRU: least recently used

public class LRUExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>(5, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size()>5;
            }
        };
        populateAndPrint(students);

        for (int i = 0; i < 10; i++) students.get(6);
        for (int i = 0; i < 10; i++) students.get(5);
        for (int i = 0; i < 10; i++) students.get(7);
        students.forEach((k,v)-> System.out.println(k+": "+v));
    }

    private static void populateAndPrint(LinkedHashMap<Integer, String> students) {
        students.put(1, "one");
        students.put(2, "two");
        students.put(3, "three");
        students.put(4, "four");
        students.put(5, "five");
        students.put(6, "six");
        students.put(7, "seven");
        students.put(8, "eight");
        students.put(9, "nine");

        System.out.println(students);
    }
}
