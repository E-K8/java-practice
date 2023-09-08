package collections.collection_interface_methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Collection<Integer> collection1 = new ArrayList<>();
    collection1.add(77);
    Collection<Integer> collection2 = List.of(2, 3, 4, 5, 6);
    Collection<Integer> collection3 = new ArrayList<>() {{
      add(3);
      add(4);
      add(5);
    }};

    System.out.println("Collection 1: " + collection1);
    System.out.println("Collection 2: " + collection2);
    System.out.println("Collection 3: " + collection3);

    collection1.addAll(collection2);
    System.out.println("Collection 1 after adding collection 2: " + collection1);

    collection1.remove(4);
    System.out.println("Collection 1 after removing element '4': " + collection1);

//    collection1.removeAll(collection2);
//    System.out.println("Collection 1 after removing collection 2: " + collection1);

//    collection1.removeAll(collection3);
//    System.out.println("Collection 1 after removing collection 3: " + collection1);

//    collection1.removeIf(c -> c % 2 == 0);

//    collection1.retainAll(collection3);

    System.out.println(collection1.contains(77)); // true
    System.out.println(collection1.containsAll(collection3));
    System.out.println(collection1.isEmpty());
    System.out.println(collection1.size());

    Iterator<Integer> iterator = collection1.iterator();
    while (iterator.hasNext()) {
      Integer currValue = iterator.next();
      System.out.println("--> " + currValue);
    }

    collection1.forEach(System.out::println);

  }
}
