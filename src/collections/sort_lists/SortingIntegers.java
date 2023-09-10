package collections.sort_lists;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingIntegers {
  public static void main(String[] args) {
    Integer[] array = {4, 3, 2, 6, 1};
    List<Integer> list = new ArrayList<>(Arrays.asList(array));

    System.out.println("Before sorting: " + list);

    list.sort(Comparator.naturalOrder());

    list.add(null);
    list.sort(Comparator.nullsLast(Comparator.naturalOrder()));

    System.out.println("After sorting: " + list);


  }


}
