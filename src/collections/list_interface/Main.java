package collections.list_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    list1.add("first");
    list1.add("second");
    list1.add("third");

    list1.add(0, "newElement");

    List<String> list2 = new ArrayList<>() {
      {
        add("one");
        add("two");
      }
    };

    list1.addAll(1, list2);
    list2.add(1, "nth");


    System.out.println(list1.get(0));
    System.out.println(list1);

    System.out.println(list1.indexOf("nth"));
    System.out.println(list1.lastIndexOf("third"));

    System.out.println(list2.indexOf("nth"));

    list1.replaceAll(c -> c.toUpperCase()); // or String::toUpperCase

    List<String> subList = list1.subList(0, 3);

    list1.set(0, "zeroElement");

//    System.out.println("sublist: " + subList);

    System.out.println(list1);
//    System.out.println(list2);

    list1.sort(String::compareTo);

    ListIterator<String>listIterator = list1.listIterator(5);
    while(listIterator.hasPrevious()) {
      System.out.println(listIterator.previous());
    }

    System.out.println(list1);

  }
}
