package generics.generics_with_john.bounded_generic;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Printer<Cat> catPrinter = new Printer<>(new Cat());
    catPrinter.print();

    Printer<Dog> dogPrinter = new Printer<>(new Dog());
    dogPrinter.print();

    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat());
    Cat myCat = cats.get(0);
  }
}
