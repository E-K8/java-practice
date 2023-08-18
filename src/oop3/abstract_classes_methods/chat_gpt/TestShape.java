package oop3.abstract_classes_methods.chat_gpt;

// Abstract class
abstract class Shape {
  // Abstract method (does not have a body)
  public abstract double area();

  // Regular method
  public void display() {
    System.out.println("This is a shape.");
  }
}

// Subclass (inherit from Shape)
class Circle extends Shape {
  double radius;

  Circle(double r) {
    radius = r;
  }

  // Implementation of the abstract method
  @Override
  public double area() {
    return Math.PI * radius * radius;
  }
}

// Subclass (inherit from Shape)
class Rectangle extends Shape {
  double length;
  double width;

  Rectangle(double l, double w) {
    length = l;
    width = w;
  }

  // Implementation of the abstract method
  @Override
  public double area() {
    return length * width;
  }
}

public class TestShape {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println("Circle area: " + circle.area());

    Rectangle rectangle = new Rectangle(4, 5);
    System.out.println("Rectangle area: " + rectangle.area());
  }
}
