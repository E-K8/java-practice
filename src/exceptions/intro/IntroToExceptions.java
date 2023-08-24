package exceptions.intro;

public class IntroToExceptions {
  public static void main(String[] args) {
    try {
      int result = divide(10, 0);
      System.out.println("Result is: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Exception caught: " + e.getMessage());
    } finally {
      System.out.println("This block gets executed regardless of an exception.");
    }
  }

  public static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
