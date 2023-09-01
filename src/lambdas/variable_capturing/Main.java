package lambdas.variable_capturing;

interface myInterface {
  void test();
}

public class Main {
  String name = "Kate";
  double salary = 5000;

  public static void main(String[] args) {
    int x = 57; // local variable must be final or effectively final

    myInterface myInterface = () -> {
      System.out.println(x);
      int y = 3;
      int z = 5;
      System.out.println(y+z);
    };
    myInterface.test();
  }
}
