package generics.wildcards;

import oop2.inheritance.Employee;
public class Printer<T> {
  void print(Printer<? extends Hierarchy.Programmer> emp) {
    System.out.println(emp.getClass().getSimpleName());
  }

  public static void main(String[] args) {
    Printer<Hierarchy.Employee> printer = new Printer<>();
    printer.print(new Printer<Hierarchy.Lead>());
  }
}
