package collections.hashmap.linked_hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample1 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(14);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(7);
        linkedHashSet.add(8);

        System.out.println("HashSet: ");
        for (Integer num : hashSet) {
            System.out.print(num + " ");  // Output might be in any order like: 1 2 3 4 or 4 3 2 1 etc.
        }

        System.out.println("\nLinkedHashSet: ");
        for (Integer num : linkedHashSet) {
            System.out.print(num + " ");  // Output will always be: 1 2 3 4
        }
    }
}
