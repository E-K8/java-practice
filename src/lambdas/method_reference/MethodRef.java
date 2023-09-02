package lambdas.method_reference;

interface PassString1 {
  void test(String x);
}

public class MethodRef {

  public MethodRef(String x) {

  }
  public static void sayHello(String name) {
    System.out.println("Hello" + name);
  }

  public static void main(String[] args) {
    PassString1 passString1 = System.out::println; // (x) -> System.out.println(x)
    PassString1 passString2 = MethodRef::sayHello; // (x) -> sayHello(x)

    PassString1 passString11 = MethodRef::new;
  }
}
