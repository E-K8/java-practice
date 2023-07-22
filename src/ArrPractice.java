import java.util.Scanner;

//    1. Traverse arrays
//    2. Total, average, max, min, search for number
//    3. Print array values reversed

public class ArrPractice {
    //    1.
    /*
    public static void main(String[] args) {
        String[] names = {"Lucy", "Dale", "Kyle", "Chris"};

        System.out.println(names.length);

        for (int i = 0; i < names.length; i++) {
            names[i] = "Hi and welcome, " + names[i] + "!";
        }
        System.out.println(Arrays.toString(names));

//        for-each
        for (String myString : names) {
            System.out.println(myString);
        }

        int[] myInt = {31, 52, 73, 94};

        for (int n : myInt) {
            System.out.println(n);
        }
    }
    */

    //    2.
    /*
    public static void main(String[] args) {
        double[] salaries = {23000.71, 45234.45, 63244.11, 18777.25};

        double total = 0, max = salaries[0], min = salaries[0];

        Scanner in = new Scanner(System.in);
        double searchNum = in.nextDouble();
        boolean found = false;

        for (double salary : salaries) {
            total += salary;
            if (salary > max) {
                max = salary;
            }
            if (salary < min) {
                min = salary;
            }
            if (searchNum == salary) {
                found = true;
            }
        }
        if (found) {
            System.out.println("found the match");
        } else {
            System.out.println("no match found");
        }

        System.out.println("Total to pay in salaries: " + String.format("%.2f",total));
        System.out.println("Average pay per annum: " + String.format("%.2f",(total / salaries.length)));
        System.out.println("The smallest salary being paid currently is: " + min);
        System.out.println("The biggest salary being paid currently is: " + max);
    }
*/

    //    3.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}

