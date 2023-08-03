package oop1.pass_by_reference;

import java.util.Arrays;

public class PassByReference {
  public void changeArray(int[] array) {
    array[0] = 99;
    array[1] = 99;
    array[2] = 99;
    System.out.println("inside changeArray: " + Arrays.toString(array));
  }
}
