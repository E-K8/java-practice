package oop1.inner_classes;

class Outside {
  int a = 1;

  class Inside {
    int b = 3;
  }
}

public class OutsideInside {
  public static void main(String[] args) {
    Outside o = new Outside();
    Outside.Inside i = o.new Inside();
    System.out.println("Outside is: " + o.a + " and Inside is: " + i.b);
  }
}