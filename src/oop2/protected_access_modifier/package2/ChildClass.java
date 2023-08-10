package oop2.protected_access_modifier.package2;

import oop2.protected_access_modifier.package1.ParentClass;

public class ChildClass extends ParentClass {
  void print() {
    this.name = "";
  }
}
