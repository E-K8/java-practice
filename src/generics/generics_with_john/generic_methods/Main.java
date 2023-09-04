package generics.generics_with_john.generic_methods;

public class Main {
  public static void main(String[] args) {
    shout("Kate", 365);
  }

  private static <T, V> void shout(T thingToShout, V otherThingToShout) {
    System.out.println(thingToShout + "!!!!!");
    System.out.println(otherThingToShout + "!!!!!");
  }
}
