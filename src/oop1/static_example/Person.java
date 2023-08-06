package oop1.static_example;

public class Person {
  static int counter;

  static {
    System.out.println("Static block one");
  }
  static {
    System.out.println("Static block two");
  }

  /*
  String name;
  public Person (String name) {
    this.name = name;
  }
  */

  public Person() {
    System.out.println("constructor");
  }

  static {
    counter=5;
  }

}
