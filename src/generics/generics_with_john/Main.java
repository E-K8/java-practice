package generics.generics_with_john;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Printer<Integer> printer = new Printer<>(23);
    printer.print();

    Printer<Double> doublePrinter = new Printer<>(33.45);
    doublePrinter.print();
  }
}
