package oop1.static_method;

import javax.print.attribute.standard.MediaSize;

public class Main {
  public static void main(String[] args) {
    OtherClass other = new OtherClass();
    OtherClass.print();
  }


/*  public static void main(String[] args) {
    // Instance of class vs class itself:
    // Static method: class itself
    sayHi();
    OtherClass.sayYes();

    // Non-static method: instance of a class
    Main m = new Main();
    m.sayBye();

    OtherClass o = new OtherClass();
    o.sayNo();
  }*/

/*  static void sayHi() {
    System.out.println("Hi");
  }

  void sayBye() {
    System.out.println("Bye");
  }*/
}
