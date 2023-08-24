package oop3.enum_example.alex_lee;
// Enums is like if a class and an array had a baby: a list of values that doesn't change, but it's set up like a class, and you access it like a class
// Enums don't have types, they are sort of labels
// This example ↓↓↓ is of an enum outside of a class

enum Level {
  LOW, MEDIUM, HIGH
}

public class LetsDoEnums {


  public static void main(String[] args) {

//    System.out.println(Level.HIGH);

    Level l = Level.LOW;
    Level m = Level.MEDIUM;
    Level h = Level.HIGH;
    System.out.println(l);
    System.out.println(m);
    System.out.println(h);

    switch (m) {
      case LOW -> System.out.println("Low level");
      case MEDIUM -> System.out.println("Medium level");
      case HIGH -> System.out.println("High level");
    }
  }
}
