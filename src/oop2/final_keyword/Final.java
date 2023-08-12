package oop2.final_keyword;

final public class Final {
  static final double PI = 3.14159;
  final int MAX = 5;

// if the variable isn't initialised as above it must be initialised in a constructor as below
//  Final() {
//    MAX = 5;
//  }

  final public void sayHi() {
    System.out.println("Hi!");
  }


  public static void main(String[] args) {
    Final f = new Final();
//    f.sayHi();
  }
}
