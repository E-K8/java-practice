package oop1.class_constructor;

public class Car {
  String colour;
  int year;
  public Car() {
    System.out.println("in no-args constructor");
  }
  public Car(String newColour, int newYear) {
    colour=newColour;
    year = newYear;
    System.out.println("in parameterised constructor");
  }
}
