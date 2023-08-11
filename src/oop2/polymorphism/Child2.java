package oop2.polymorphism;

public class Child2 extends Parent {
  public Child2() {
    super("David");
  }

  @Override
  void print() {
    System.out.println("printing in child 2 class");
  }
}

