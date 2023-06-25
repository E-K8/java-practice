import java.util.Scanner;

public class ScannerClass {
    /*
    1. Import the Scanner class form java.util package
    2. Create an object from the class Scanner
    3. Use methods available in the Scanner object
    4. Close the scanner object
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Welcome " + name);
        input.close();
    }

}
