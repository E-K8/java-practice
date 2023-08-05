package oop1.this_keyword1;

public class Rectangle {
  private double length, width;

  public Rectangle() {
    this(2, 1);
  }
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double getArea() {
    return this.length * this.width;
  }

  double getPerimeter() {
    return (2 * (this.length + this.width));
  }

  void printAreaAndPerimeter() {
    System.out.println(this.getArea() + ", perimeter: " + this.getPerimeter());
  }
}

