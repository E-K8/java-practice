package oop2.final_keyword;

public sealed class Parent permits Child {
  final String NAME;

  public Parent() {
    NAME = "Kate";
  }

   void print() {
    System.out.println(NAME);
  }

}
