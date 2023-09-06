package generics.wildcards;

public class Main {
  public static void main(String[] args) {
    ArrayExample<String> stringArray1 = new ArrayExample<>(new String[]{"Kate"});
    ArrayExample<String> stringArray2 = new ArrayExample<>(new String[]{"Kate", "Sam"});
    System.out.println(stringArray1.isLongerThan(stringArray2));

    ArrayExample<Integer> integerArray= new ArrayExample<>(new Integer[]{354, 34, 21});
    stringArray1.isLongerThan(integerArray);
  }
}
