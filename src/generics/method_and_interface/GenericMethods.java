package generics.method_and_interface;

public class GenericMethods {
  public static <T> void getType(T data) {
    System.out.println(data + " is from type: " + data.getClass().getSimpleName());
  }

  public static <T, U> void getTypes(T data1, U data2) {
    System.out.println(data1 + " is from type: " + data1.getClass().getSimpleName());
    System.out.println(data2 + " is from type: " + data2.getClass().getSimpleName());
  }

  public static <T> boolean isEqual(T data1, T data2) {
    return data1.equals(data2);
  }

  public static void main(String[] args) {
    getType("Kate");
    getType(33);
    getType(true);

    getTypes("crossroads", false);

  }
}
