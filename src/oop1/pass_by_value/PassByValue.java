package oop1.pass_by_value;

public class PassByValue {
  public void changeInteger(int x) {
    x += 99;
    System.out.println("inside changeInteger method: " + x);
  }
}
