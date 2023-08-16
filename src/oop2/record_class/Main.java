package oop2.record_class;

public class Main {
  public static void main(String[] args) {
    Employee obj1 = new Employee(101, "Kate");
    Employee obj2 = new Employee(102, "Kate");

    System.out.println(obj2.name());

    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());

    System.out.println(obj1.equals(obj2));

    System.out.println(obj1);

//    Employee obj3 = new Employee(-1, "Sam");

    obj2.printName();
  }
}
