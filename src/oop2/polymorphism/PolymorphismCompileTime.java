//Compile-Time Polymorphism (Method Overloading)

/*
Compile-time polymorphism occurs when two or more methods in the same class have the same name but different parameters (either different types or a different number of parameters).
*/

package oop2.polymorphism;

class MathOperations {
  public int multiply(int a, int b) {
    return a * b;
  }

  public double multiply(double a, double b) {
    return a * b;
  }
}

public class PolymorphismCompileTime {
  public static void main(String[] args) {
    MathOperations obj = new MathOperations();
    System.out.println(obj.multiply(4, 5));  // Output will be 20
    System.out.println(obj.multiply(4.5, 5.5)); // Output will be 24.75
  }
}