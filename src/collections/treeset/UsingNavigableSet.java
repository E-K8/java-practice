package collections.treeset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class UsingNavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>(Set.of(2, 4, 6, 8));
        System.out.println("Set: " + set);

        System.out.println("Descending set: " + set.descendingSet());

        System.out.println("subSet: " + set.subSet(2, true, 6, true));
        System.out.println("seadSet: " + set.headSet(2, true));
        System.out.println("tailSet: " + set.tailSet(2, true));

        System.out.println("Higher: " + set.higher(2));
        System.out.println("Lower: " + set.lower(2));

        System.out.println("Ceiling: " + set.ceiling(3)); // returns element if it exists or higher
        System.out.println("Floor: " + set.floor(2)); // returns the element or the lower element


// poll will mutate the set
        System.out.println("pollFirst: " + set.pollFirst());
        System.out.println("pollLast: " + set.pollLast());
        System.out.println("set: " + set);


    }
}
