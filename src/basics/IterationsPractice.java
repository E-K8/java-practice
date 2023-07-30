package basics;

import java.util.Scanner;

public class IterationsPractice {
//    1. Find the sum of the first 5 natural numbers
//    2. Read 5 user inputs and print their total and average (using accumulator pattern)
//    3. Print the multiplication table of 6
//    4. Read 3 numbers from the user and print the max number

    public static void main(String[] args) {
//        1.
        /*
        int total = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.printf("Total = %d, i = %d\n", total, i);
            total+=i;
        }
        System.out.println(total);
        */

//        2.
/*
        Scanner in = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <=5; i++) {
            System.out.println("Enter number " +i);
            int currentValue = in.nextInt();
            total += currentValue;
        }
        System.out.println("Total: " + total);

        double avg = total / 5.0;
        System.out.printf("Average: %.2f", avg);
        */

//        3.
/*

        for (int i = 1; i <= 12; i++) {
            int result = 6*i;
            System.out.printf("6 X %d = %d\n", i, result);
        }
*/

//        4.
        Scanner in = new Scanner(System.in);
        int maxNum = 0;

        for (int i = 0; i < 3; i++) {
            int currNum = in.nextInt();

            if (currNum > maxNum) {
                maxNum = currNum;
            }
        }
        System.out.println("Maximum number is " + maxNum);

    }
}
