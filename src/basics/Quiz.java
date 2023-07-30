package basics;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to Java Quiz! Please react with either true or false to the following sentences:");
        System.out.println("JVM is a program that executes compiled Java code.");
        boolean answer = in.nextBoolean();
        if (answer == true) {
            score++;
        }
        System.out.println("String is a primitive data type.");
        answer = in.nextBoolean();
        if (answer == false) {
            score++;
        }
        System.out.println("Java has 9 primitive data types.");
        answer = in.nextBoolean();
        if (answer == false) {
            score++;
        }
        System.out.printf("You've given %d correct answers.\n", score);
        if (score == 3) {
            System.out.println("Great result!");
        } else if (score == 2) {
            System.out.println("You're doing good");
        } else {
            System.out.println("Please review Java fundamentals. I believe you can do better.");
        }
    }
}
