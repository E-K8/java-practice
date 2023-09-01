package lambdas.variable_capturing;

interface Calculator {
  double calc(double x, double y);
}

class MyClass implements Calculator {
  @Override
  public double calc(double x, double y) {
    return x + y;
  }
}

public class CalculatorWithoutLambda {
  public static void main(String[] args) {
    MyClass myClass = new MyClass();
    double additionResult = myClass.calc(3, 5);
    System.out.println(additionResult);
  }
}
