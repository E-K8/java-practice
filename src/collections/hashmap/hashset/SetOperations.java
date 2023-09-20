package collections.hashmap.hashset;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    static HashSet<Integer> firstSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6));
    static HashSet<Integer> secondSet = new HashSet<>(Set.of(4, 5, 6, 7, 8, 9));
    static HashSet<Integer> smallSet = new HashSet<>(Set.of(1, 2, 3));
    public static void subSet(){
        boolean isSubSet = firstSet.containsAll(smallSet);
        System.out.println(isSubSet);
    }
    public static void union() {
        firstSet.addAll(secondSet);
    }
    public static void intersection(){
        firstSet.retainAll(secondSet);
    }
    public static void difference(){
        secondSet.removeAll(firstSet);
    }

    public static void main(String[] args) {
//        subSet();
//        union();
//        intersection();
        difference();
        System.out.println(secondSet);
    }

}