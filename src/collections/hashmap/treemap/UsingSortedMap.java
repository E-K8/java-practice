package collections.hashmap.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

public class UsingSortedMap {
    public static void main(String[] args) {
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(2, "two");
        sortedMap.put(4, "four");
        sortedMap.put(6, "six");
        sortedMap.put(8, "eight");
        System.out.println(sortedMap);

        SortedMap<Integer, String> subMap = sortedMap.subMap(2, 6);
        System.out.println("subMap: " + subMap);
        System.out.println("headMap: " + sortedMap.headMap(4));
        System.out.println("tailMap: " + sortedMap.tailMap(4));

        System.out.println("firstKey: " + sortedMap.firstKey());
        System.out.println("lastKey: " + sortedMap.lastKey());

        System.out.println("keySet: " + sortedMap.keySet());
        System.out.println("values: " + sortedMap.values());
        System.out.println("entrySet: " + sortedMap.entrySet());


    }
}

