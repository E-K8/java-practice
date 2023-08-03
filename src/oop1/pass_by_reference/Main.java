package oop1.pass_by_reference;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] array = {0, 0, 0};

    PassByReference obj = new PassByReference();
    obj.changeArray(array);

    System.out.println("inside main method: " + Arrays.toString(array));
  }
}
