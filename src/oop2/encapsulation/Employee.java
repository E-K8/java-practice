package oop2.encapsulation;

public class Employee {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private double salary;

  public String getSalary() {
    // validate users and limit accessibility
    return "£" + salary;
  }

  public void setSalary(double salary) {
    if (salary < 0) {
      System.out.println("Invalid number");
      return;
    }
    this.salary = salary;
  }
}
