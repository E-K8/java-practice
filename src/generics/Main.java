package generics;

public class Main {
  public static void main(String[] args) {
    Double[] arr = {4.5, 2.2, 31.5, 76.3};
    DoubleArr doubleArr = new DoubleArr(arr);

    Double elementDouble = doubleArr.getElement(0);
    System.out.println(elementDouble);

    Object[] objects = {1, "Kate", 25.5};
    ObjectArr objectArr = new ObjectArr(objects);

    Integer elementInt = (Integer) objectArr.getElement(0);
    System.out.println(elementInt * 5);

  /*  Integer elementInt2 = (Integer) objectArr.getElement(1);
    System.out.println(elementInt2*3);*/

    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};
    GenericArr<Integer> genericArr = new GenericArr<>(numbers);
    System.out.println(genericArr.getElement(2));
  }
}
