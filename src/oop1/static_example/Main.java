package oop1.static_example;

public class Main {
  public static void main(String[] args) {
    Person john = new Person("John");
    Person.counter++;
    Person.counter++;
    Person.counter++;
    Person.counter++;
    System.out.println(Person.counter);

    Person tom = new Person("Tom");
    Person.counter++;
    System.out.println(Person.counter);
  }
}
