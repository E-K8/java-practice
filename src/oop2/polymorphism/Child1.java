package oop2.polymorphism;

public class Child1 extends Parent {
  public Child1() {
    super("Kate");
    System.out.println("printing in child1 constructor");
  }

  @Override
  void print() {
    super.print();
    System.out.println("Printing in child 1 class");
  }
}
