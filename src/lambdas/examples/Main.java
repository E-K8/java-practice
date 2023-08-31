package lambdas.examples;

public class Main {

  static void myPrint(Calculator calculator, double x, double y) {
    double res = calculator.calc(x, y);
    System.out.println(res);
  }

  public static void main(String[] args) {
    myPrint(Double::sum, 4, 5); // replaced lambda with method reference
    myPrint((x, y) -> x - y, 4, 5);
    myPrint((x, y) -> x * y, 4, 5);
    myPrint((x, y) -> x / y, 4, 5);
  }
}
