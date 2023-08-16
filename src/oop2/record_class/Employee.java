package oop2.record_class;

public record Employee(int id, String name) {

  static String address;

  // compact constructor
  public Employee {
    if (id < 0) {
      throw new IllegalArgumentException("id can't be less than zero");
    }
  }

  public Employee() {
    this(1, "");
  }

  @Override
  public String name() {
    return "My name is " + name;
  }

  public void printName() {
    System.out.println("The name is: " + name);
  }
}
