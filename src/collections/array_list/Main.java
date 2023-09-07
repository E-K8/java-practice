package collections.array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add (99);
    numbers.add (56);
    numbers.add (44);
    numbers.add (1,32);


    System.out.println(numbers);
    System.out.println(numbers.get(1));
  }
}
