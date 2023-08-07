package oop1.static_method;

public class OtherClass {

  static int counter;

  static {
    counter = 5;
  }

  void walk() {
    System.out.println("walking in a park");
  }

  static void print() {
    // local class: class with a name inside a method
    class FormatString{
      void format() {

      }
    }
    System.out.println(counter);
  }

  // inner class
  class Read1 {
    void readBook() {
      System.out.println("reading a book");
    }
  }

  static class Read2 {
    void readBook() {
      System.out.println("reading a book");
    }
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
