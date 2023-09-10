package collections.sort_lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingLists {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>(List.of("Hey", "Sun", "Purpose", "Crunch", "World", "agree"));
    System.out.println("Before sorting: " + list);

    list.sort(Comparator.naturalOrder());
    list.sort(String.CASE_INSENSITIVE_ORDER);
    System.out.println("After sorting with case insensitive order: " + list);

    Comparator<String> lengthComparator1 = Comparator.comparingInt(String::length);
    Comparator<String> lengthComparator2 = (s1, s2)->Integer.compare((s1.length()), s2.length());

    Comparator<String> sortBySecondCharComparator = (s1,s2)->Integer.compare(s1.charAt(1), s2.charAt(1));

//    list.sort(lengthComparator1);
    list.sort(lengthComparator2);
    list.sort(sortBySecondCharComparator);

    System.out.println("After sorting with length comparators: " + list);
    System.out.println("After sorting by second character: " + list);


  }
}
