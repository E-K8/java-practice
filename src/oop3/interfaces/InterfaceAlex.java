package oop3.interfaces;

interface WaterBottleInterface {
  String color="Blue";
  void fillUp();
  void pourOut();
}

public class InterfaceAlex implements WaterBottleInterface {
  public static void main(String[] args) {
    System.out.println(color);
    InterfaceAlex bottle = new InterfaceAlex();
    bottle.fillUp();
    bottle.pourOut();
  }

  @Override
  public void fillUp() {
    System.out.println("It is filled");
  }

  @Override
  public void pourOut() {

    System.out.println("It is poured out");
  }
}
