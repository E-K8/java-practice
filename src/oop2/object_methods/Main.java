package oop2.object_methods;

public class Main {
  public static void main(String[] args) {
    Employee obj1 = new Employee(101, "Tom");
    Employee obj2 = new Employee(101, "Tom");

    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
    System.out.println(obj1.equals(obj2));
    System.out.println(obj1);

  }
}
