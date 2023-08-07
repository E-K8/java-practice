package oop1.static_method;

import oop1.static_example.Person;

import javax.print.attribute.standard.MediaSize;

public class Main {
  public static void main(String[] args) {
    OtherClass personObj = new OtherClass();
    OtherClass.Read1 read1 = personObj.new Read1();

    OtherClass.Read2 read2 = new OtherClass.Read2();

    // anonymous class

    OtherClass anonymousPerson = new OtherClass(){
      @Override
      void walk() {
//        super.walk();
        System.out.println("walk in the forest");
      }
    };
    anonymousPerson.walk();



/*

    OtherClass other = new OtherClass();
    OtherClass.print();
*/

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
