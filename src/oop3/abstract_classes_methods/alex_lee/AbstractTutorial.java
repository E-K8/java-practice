package oop3.abstract_classes_methods.alex_lee;

interface DogInterface {
  void bark();
  void play();
}

abstract class Dog {
  public void bark() {
    System.out.println("Bark!");
  }

  public abstract void play();
}

class Chihuahua extends Dog {
  public void play() {
    System.out.println("The dog is playing!");
  }
}

public class AbstractTutorial {

  public static void main(String[] args) {
    Chihuahua c = new Chihuahua();
    c.bark();
    c.play();
  }
}
