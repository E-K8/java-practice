package basics;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if ( in.hasNextInt() ){
            int num = in.nextInt();

            if (num < 0) {
                System.out.println("You gave me a negative number");
            } else {
                System.out.println("You gave me a positive number");
            }
        } else {
            System.out.println("Please enter an integer");
        }
    }
}
