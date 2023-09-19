package collections.hashmap.treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class UsingNavigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String> navigableMap = new TreeMap<>();
        navigableMap.put(2, "two");
        navigableMap.put(4, "four");
        navigableMap.put(6, "six");
        navigableMap.put(8, "eight");
        System.out.println("NavigableMap: "+ navigableMap);

        System.out.println("descendingMap: "+ navigableMap.descendingMap());
        System.out.println("descendingKeySet: "+ navigableMap.descendingKeySet());
        System.out.println("navigableKeySet: "+ navigableMap.navigableKeySet());


//        System.out.println(navigableMap.pollFirstEntry());
//        System.out.println(navigableMap);
//        System.out.println(navigableMap.pollLastEntry());
//        System.out.println(navigableMap);

//        System.out.println(navigableMap.ceilingEntry(3));
//        System.out.println(navigableMap.ceilingKey(3));
//        System.out.println(navigableMap.floorEntry(2));
//        System.out.println(navigableMap.floorKey(3));

//        System.out.println(navigableMap.higherEntry(2));
//        System.out.println(navigableMap.higherKey(2));

        System.out.println(navigableMap.headMap(2, true));
        System.out.println(navigableMap.tailMap(2, false));


    }
}
