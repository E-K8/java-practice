package oop3.enum_example.chatJPT;

// Enum with methods and attributes

/*
In this example, the Planet enum has attributes (mass and radius), a constructor, and methods. The PlanetTest class demonstrates iterating over each enum constant and printing its surface gravity.

Enums can also implement interfaces, have abstract methods, and much more. They are a powerful way to represent a fixed set of related constants in Java.
 */

public enum Planet {
  MERCURY(3.303e+23, 2.4397e6),
  VENUS(4.869e+24, 6.0518e6),
  EARTH(5.976e+24, 6.37814e6);
  // ... (other planets here)

  private final double mass;   // in kilograms
  private final double radius; // in meters

  Planet(double mass, double radius) {
    this.mass = mass;
    this.radius = radius;
  }

  public double getMass() {
    return mass;
  }

  public double getRadius() {
    return radius;
  }

  // Example method to calculate surface gravity
  public double surfaceGravity() {
    return 6.67300E-11 * mass / (radius * radius);
  }
}
