package oop1.pass_by_value;

public class Main {
  public static void main(String[] args) {
    int x = 1;

    PassByValue obj = new PassByValue();
    obj.changeInteger(x);

    System.out.println("inside main method: " + x);
  }
}
