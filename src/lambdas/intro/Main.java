package lambdas.intro;

import oop3.interfaces.multiple.MyInterface;

public class Main {
  public static void main(String[] args) {
    InterfaceExample1 interfaceExample1 = () -> System.out.println(5);
    interfaceExample1.printNumber();

    InterfaceExample2 interfaceExample2 = (x) -> System.out.println(x);
    interfaceExample2.print("Java");

    InterfaceExample3 interfaceExample3 = (x, y) -> System.out.println(x + y);
    interfaceExample3.add(3, 5);

    InterfaceExample4 interfaceExample4 = (x, y) -> x + y;
    int result = interfaceExample4.add(3,4);
    System.out.println(result);
  }
}
