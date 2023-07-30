package basics;

public class Arithmetic {
    /*
    +, -, /, %,
     */
    public static void main(String[] args) {
        int x = 8;
        double y = 7;
//        double addition = x + y;

        int addition = (int) (x + y);

        System.out.println("Addition result: " + addition);

        double subtraction = (int) (x - y);
        System.out.println("Subtraction result: " + subtraction);

        int multiplication = (int) (x * y);
        System.out.println("Multiplication result: " + multiplication);

        int num1 = 6;
        double num2 = 4;

        double division = num1 / num2;
        System.out.println("Division result: " + division);

        // modulo operator aka division remainder

        double remainder = x % y;
        System.out.println("Remainder: " + remainder);

        // increment
        x++;
        System.out.println(x);
        
        // decrement
        y--;
        System.out.println(y);
    }

}