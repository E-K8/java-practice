package collections.sort_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsingCollections {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(List.of("Sun", "Mercury", "Mars", "Venus", "Pluto", "Moon", "example"));
    System.out.println("Array list before sorting: " + list);
    Collections.sort(list);
    System.out.println("Array list after sorting: " + list);

    Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
    System.out.println("Array list after case insensitive sorting: " + list);

    Collections.sort(list, Comparator.comparingInt(String::length));
    System.out.println("Array list after array length sorting: " + list);

    Collections.sort(list, Collections.reverseOrder());
    System.out.println("Array list after reverse sorting: " + list);

    Collections.sort(list, (s1,s2)->Integer.compare(s1.charAt(1), s2.charAt(1)));
    System.out.println("Array list sorted by the second characters: " + list);




  }

}
