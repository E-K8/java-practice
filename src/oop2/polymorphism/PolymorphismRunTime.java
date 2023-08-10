// Runtime Polymorphism (Method Overriding)
/*
Runtime polymorphism is achieved by method overriding. In method overriding, a subclass provides a specific implementation of a method that is already defined in its superclass.
*/

class Animal {
  void sound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("Dog barks");
  }
}

class Cat extends Animal {
  void sound() {
    System.out.println("Cat meows");
  }
}

public class PolymorphismRunTime {
  public static void main(String[] args) {
    Animal a1 = new Animal();
    Animal a2 = new Dog();
    Animal a3 = new Cat();

    a1.sound(); // Output: Animal makes a sound
    a2.sound(); // Output: Dog barks
    a3.sound(); // Output: Cat meows
  }
}