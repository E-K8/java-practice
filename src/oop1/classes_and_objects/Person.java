package oop1.classes_and_objects;

public class Person {

    String firstName;
    String lastName;

    public void walk() {
        System.out.println(firstName + " is walking");
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public void eat(String food) {
        System.out.println(firstName +" is eating " + food);
    }
}
