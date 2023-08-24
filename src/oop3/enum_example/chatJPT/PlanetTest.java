package oop3.enum_example.chatJPT;

/*
In Java, an enum is a special data type that enables for a variable to be a set of predefined constants. The variable must be equal to one of the values that have been predefined for it. They are used when you want to represent a fixed set of named constants.

Some features of Java enum:

They can have attributes, methods, and constructors.
They are implicitly final (cannot be extended) and static.
The constants in an enum type are public, static, and final by default.
 */

public class PlanetTest {
  public static void main(String[] args) {
    for (Planet p : Planet.values()) {
      System.out.printf("Surface gravity on planet %s is %f%n", p, p.surfaceGravity());
    }
  }
}
