package exceptions.try_with_resources;

//Exception propagation refers to the concept that if an exception is thrown in a method and it's not caught within that method, the exception will propagate (or bubble up) to the method that called it. If that method also doesn't handle the exception, it'll continue to propagate up the call stack until it's caught or until it reaches the top level, resulting in termination of the program.

public class ExceptionPropagation {
  public static void main(String[] args) {
    methodA();
  }

  static void methodA() {
    methodB();
  }

  static void methodB() {
    methodC();
  }

  static void methodC() {
    System.out.println(4 / 0);
  }


  // to avoid exception propagation:   If you do the below, then the exception will not propagate further, and the program will print "Cannot divide by zero!" instead of terminating with an exception stack trace. ↓↓↓

/*  static void methodC() {
    try {
      System.out.println(4 / 0);
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero!");
    }

  }*/
}
