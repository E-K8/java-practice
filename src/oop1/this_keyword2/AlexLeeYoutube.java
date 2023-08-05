package oop1.this_keyword2;

public class AlexLeeYoutube {
  int a;
  int b;
  String food;
  char size;

  public void setData(String food, char size) {
this.food = food;
this.size = size;
  }

  public void setData(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public static void main(String[] args) {

    AlexLeeYoutube example = new AlexLeeYoutube();

    example.setData(4,3);
    example.setData("soup", 'L');

    System.out.println(example.a);
    System.out.println(example.b);
    System.out.println(example.food);
    System.out.println(example.size);
  }

}
