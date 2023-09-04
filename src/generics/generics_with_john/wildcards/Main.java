package generics.generics_with_john.wildcards;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> intList = new ArrayList<>();
    intList.add(3);
    printList(intList);
   }

   private static void printList(List<?> myList) {
     System.out.println();
   }
}
