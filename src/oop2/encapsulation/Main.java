package oop2.encapsulation;

import oop2.final_keyword.Final;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
  public static void main(String[] args) {
    Employee tom = new Employee();
//    tom.setSalary(-3000);
    tom.setSalary(100);
//    System.out.println(tom.getSalary());
    System.out.println(tom.getClass().getSimpleName());
    System.out.println(tom.getClass().getPackageName());

    for (Method method : tom.getClass().getMethods()) {
      System.out.println(method);
    }
    System.out.println("----------------");

    for (Constructor constructor : tom.getClass().getConstructors()) {
      System.out.println(constructor);
    }
    System.out.println("----------------");
    for(Field field: tom.getClass().getDeclaredFields()) {
      System.out.println(field);
    }
  }
}
