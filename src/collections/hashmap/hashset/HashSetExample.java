package collections.hashmap.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>(Set.of(1,2,3,4,5,6));
        hashSet1.add(1);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(91);
        hashSet1.add(null);
        System.out.println("HashSet:"+ hashSet1);

        System.out.println("contains: " + hashSet1.contains(91));

        System.out.println("remove:" + hashSet1.remove(91));
        //System.out.println("removeAll:" + hashSet.removeAll(hashSet1));

        System.out.println("size:" + hashSet2.size());
        System.out.println("isEmpty:" + hashSet2.isEmpty());

        Iterator<Integer> iterator = hashSet1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Integer s : hashSet1) {
            System.out.println(s);
        }

        hashSet1.clear();
    }
}
