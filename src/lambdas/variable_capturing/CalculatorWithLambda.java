package lambdas.variable_capturing;

public class CalculatorWithLambda {
  static void print(Calculator calculator, double x, double y) {
    System.out.println(calculator.calc(x, y));
  }

  public static void main(String[] args) {
    print((x, y) -> x + y, 3, 5);
    print((x, y) -> x - y, 3, 5);
    print((x, y) -> x * y, 3, 5);
    print((x, y) -> x / y, 3, 5);
  }
}
