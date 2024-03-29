package generics.generics_with_john.bounded_generic;

import java.io.Serializable;

public class Printer<T extends Animal & Serializable> {
  T thingToPrint;

  public Printer(T thingToPrint) {
    this.thingToPrint = thingToPrint;
  }

  public void print() {
    thingToPrint.eat();
    System.out.println(thingToPrint);
  }
}