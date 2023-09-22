package collections.hashmap.linked_hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(4);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        System.out.println(linkedHashSet);

        linkedHashSet.remove(1);
//        linkedHashSet.removeAll(Set.of(8,9));

//        linkedHashSet.retainAll(Set.of(8, 9));

        System.out.println((linkedHashSet.contains(1)));
        System.out.println(linkedHashSet.containsAll(Set.of(8, 9)));

        linkedHashSet.size();
        linkedHashSet.isEmpty();
//        linkedHashSet.clear();

        linkedHashSet.forEach(e-> System.out.println(e)); // same as ↓
//        linkedHashSet.forEach(System.out::println);

        for(Integer n: linkedHashSet) {
            System.out.println(n);
        }

        Iterator<Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
