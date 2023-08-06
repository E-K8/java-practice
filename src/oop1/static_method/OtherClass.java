package oop1.static_method;

public class OtherClass {

  static int counter;

  static {
    counter = 5;
  }

  static void print() {
    System.out.println(counter);
  }

  /*
  static void sayYes() {
    System.out.println("Yes");
  }

  void sayNo() {
    System.out.println("No");
  }
  */
}
