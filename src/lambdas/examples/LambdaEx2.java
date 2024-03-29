package lambdas.examples;

interface MyFilter {
  boolean filter(int n);
}

class Main2 {
  static void filterArrays(MyFilter myFilter, int[] arr) {
    for (int n : arr) {
      if (myFilter.filter(n)) {
        System.out.println(n + ", ");
      }
    }
  }

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    filterArrays((x) -> x % 2 != 0, numbers);
    filterArrays((x) -> x % 2 == 0, numbers);
  }
}