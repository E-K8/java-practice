package exceptions.intro;

// unchecked exception: runtime exceptions

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntroToExceptions {
  public static void main(String[] args) {
    try {
      System.out.println("This is a divider before exception. Also, enter your number: ");

      Scanner in = new Scanner(System.in);
      int x = in.nextInt();

      int result = divide(10, 0);


      System.out.println("Result is: " + result);
      System.out.println("after exception");
    } catch (Exception e) {
      System.out.println("Exception caught: " + e.getMessage());
    } finally {
      System.out.println("This block gets executed regardless of an exception.");
    }
  }

  public static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
