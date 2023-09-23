package collections.treeset;

import org.w3c.dom.ls.LSOutput;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class UsingSortedSet {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>(Set.of(1,2,3,4,5,6));

//    subsets
        System.out.println("subSet: " + set.subSet(1,4));
        System.out.println("subSet: " + set.headSet(3));
        System.out.println("subSet: " + set.tailSet(2));

        System.out.println("first: " + set.first());
        System.out.println("last: " + set.last());
        System.out.println(set);
    }
}
