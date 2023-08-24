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
    Flavour flav = Flavour.MINT;

    flav.printFlavour();
    Flavour.getVanilla();


    /*
    if (flav == flav.VANILLA) {
      System.out.println("It's vanilla");
    } else   if (flav == flav.CHOCOLATE) {
      System.out.println("It's chocolate");
    } else   if (flav == flav.MINT) {
      System.out.println("It's mint");
    } else {
      System.out.println("It's strawberry");
    }
    */

  }
}
