package lambdas.intro;

@FunctionalInterface
interface InterfaceExample1 {
  void printNumber();
// allowed: default, static, private methods
}

interface InterfaceExample2 {
  void print(String name);
}

interface InterfaceExample3 {
  void add(int x, int y);
}

interface InterfaceExample4 {
  int add(int x, int y);
}