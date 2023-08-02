package oop1.passbyvalue;

public class PassByValue {
  public void changeInteger(int x) {
    x += 99;
    System.out.println("inside changeInteger method: " + x);
  }
}
