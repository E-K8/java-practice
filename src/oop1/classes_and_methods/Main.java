package oop1.classes_and_methods;

public class Main {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.firstName = "Tom";
        tom.lastName = "Jones";
        System.out.println(tom.hashCode());
        tom.walk();

        String fullName = tom.fullName();
        System.out.println(fullName);

        tom.eat("salad");
    }
}
