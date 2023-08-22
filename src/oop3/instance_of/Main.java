package oop3.instance_of;

public class Main {

  public static void print(Shape shape) {
    if (shape instanceof Rectangle rectangleObj) {
      rectangleObj.print();
    } else if (shape instanceof Circle circleObj) {
      circleObj.print();
    }

  }

  public static void main(String[] args) {

    print(new Rectangle());
  }
}
