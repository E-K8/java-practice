package generics.method_and_interface;

public class Employee implements Comparable<Employee> {
  int yearsOfExperience;

  @Override
  public int compareTo(Employee o) {
    return Integer.compare(this.yearsOfExperience, o.yearsOfExperience);
  }
}
