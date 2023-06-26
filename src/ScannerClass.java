import java.util.Scanner;

public class ScannerClass {
    /*
    Task:
    Convert Fahrenheit temperature to Celsius temperature
    Formula: c = (f-32) / 1.8;
    */

    /*
    next()
    nextLine()
    nextInt()
    nextDouble()
    */

    /*
    1. Import the Scanner class form java.util package
    2. Create an object from the class Scanner
    3. Use methods available in the Scanner object
    4. Close the scanner object
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double f = in.nextDouble();
        double c = (f-32)/1.8;
        System.out.printf("The Celsius value is %.1f", c);


//        Scanner in = new Scanner(System.in);
//        String myWord = in.next();
//        String myLine = in.nextLine();
//        int myInt = in.nextInt();
//        double myDouble = in.nextDouble();

//        System.out.println(myWord);
//        System.out.println(myLine);
//        System.out.println(myWord);
//        System.out.println(myInt);
//        System.out.println(myDouble);


//        Scanner input = new Scanner(System.in);
//        String name = input.next();
//        System.out.println("Welcome " + name);
//        input.close();
    }

}
