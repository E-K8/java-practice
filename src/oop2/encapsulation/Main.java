package oop2.encapsulation;

public class Main {
  public static void main(String[] args) {
    Employee tom = new Employee();
//    tom.setSalary(-3000);
    tom.setSalary(100);
    System.out.println(tom.getSalary());
  }
}
