package oop3.instance_of;

public abstract class Shape {
  abstract void print();
}

class Rectangle extends Shape {

  @Override
  void print() {
    System.out.println("Rectangle");
  }
}

class Circle extends Shape {

  @Override
  void print() {
    System.out.println("Circle");
  }
}
