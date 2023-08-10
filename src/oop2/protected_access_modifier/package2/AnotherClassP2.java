package oop2.protected_access_modifier.package2;

import oop2.protected_access_modifier.package1.ParentClass;

public class AnotherClassP2 {
  void print() {
    ParentClass p = new ParentClass();
//    p. - cannot access any fields
  }
}
