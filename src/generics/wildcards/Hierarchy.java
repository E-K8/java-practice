package generics.wildcards;

import oop2.object_methods.Employee;
public class Hierarchy {
  static class Employee {
  }

  static class Programmer extends Employee {
  }

  static class Accountant extends Employee {
  }

  static class Designer extends Employee {
  }

  static class JavaProgrammer extends Programmer {
  }

  static class PythonProgrammer extends Programmer {
  }

  static class Developer extends JavaProgrammer {
  }

  static class Tester extends JavaProgrammer {
  }

  static class Lead extends JavaProgrammer {
  }
}
