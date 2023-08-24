package oop3.enum_example.alex_lee;

public class EnumsInside {
  enum Flavour {
    CHOCOLATE, MINT, STRAWBERRY, VANILLA;

    public void printFlavour() {
      System.out.println(this);
    }

    public static void getVanilla() {
      System.out.println(Flavour.VANILLA);
    }
  }

  public static void main(String[] args) {
    Flavour taste = Flavour.MINT;

    taste.printFlavour();
    Flavour.getVanilla();


    /*
    if (taste == taste.VANILLA) {
      System.out.println("It's vanilla");
    } else   if (taste == taste.CHOCOLATE) {
      System.out.println("It's chocolate");
    } else   if (taste == taste.MINT) {
      System.out.println("It's mint");
    } else {
      System.out.println("It's strawberry");
    }
    */

  }
}
