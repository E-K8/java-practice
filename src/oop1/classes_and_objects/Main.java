package oop1.classes_and_objects;

public class Main {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.name = "Tom";
        System.out.println(tom.hashCode());
        tom.walk();

        Person john = new Person();
        john.name = "John";
        john.walk();
    }
}
