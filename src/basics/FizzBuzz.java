package basics;

import java.util.Scanner;

public class FizzBuzz {
    /*
    if the number is a multiple of 3, print the word fizz
    if the number is a multiple of 5, print the word buzz
    if the number is divisible by both 3 and 5 print fizzbuzz
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        }
    }
}
