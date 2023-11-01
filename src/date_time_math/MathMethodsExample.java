package date_time_math;

public class MathMethodsExample {
  public static void main(String[] args) {
    System.out.println("Biggest number of 3 and 5 is: " + Math.max(3, 5));
    System.out.println("Smallest number of 3 and 5 is: " + Math.min(3, 5));

    System.out.println("The square root of 47 is: " + Math.sqrt(49));
    System.out.println("The cube root of 125 is: " + Math.cbrt(125));

    System.out.println("10 raised to the power of 4 is: " + Math.pow(10, 4));

    System.out.println("The absolute value of -13 is: " + Math.abs(-13));
    System.out.println("The absolute value of 9 is: " + Math.abs(9));

    System.out.println("AddExact(6,4) is: " + Math.addExact(6, 4));
    System.out.println("Decrementing 5: " + Math.decrementExact(5));

    System.out.println("Math.ceil 9.6 is: " + Math.ceil(9.6));
    System.out.println("Math.ceil 9.2 is: " + Math.ceil(9.2));

    System.out.println("Math.floor 9.7 is: " + Math.floor(9.7));
    System.out.println("Math.floor 9.2 is: " + Math.floor(9.2));

    System.out.println("Round of 9.2 is: " + Math.round(9.2));
    System.out.println("Round of 4.5 is: " + Math.round(4.5));
    System.out.println("Round of 3.3 is: " + Math.round(3.3));

    System.out.println("Copy sign from -4 to 3: " + Math.copySign(3, -4));

    System.out.println("Math.random is: " + Math.random()); // returns value between 0.0 and 0.9999999

//    generate random number between 0 and 10
    double randomNumber = Math.random();
    double randomDoubleBetweenZeroAndTen = randomNumber * 11;
    int randomIntegerBetweenZeroAndTen = (int) (randomDoubleBetweenZeroAndTen);

    System.out.println(randomNumber);
    System.out.println(randomDoubleBetweenZeroAndTen);
    System.out.println(randomIntegerBetweenZeroAndTen);

// generate a random number
    int min = 5;
    int max = 11;
    int randomBetweenMinAndMax = (int) (Math.random() * (max - min)) + min;
    System.out.println(randomBetweenMinAndMax);

    double randomDoubleBetween46And23 = randomNumber * (46 - 23);
    int randomIntegerBetween46and23 = (int) (randomDoubleBetween46And23);
    System.out.println(randomIntegerBetween46and23);
  }
}
