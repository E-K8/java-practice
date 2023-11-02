package date_time_math;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // intro
    System.out.println("Let's play! Guess the number!");
    displayLives(3);
    System.out.println("Enter a guess between 1 and 10 (inclusive)");

    // generate random number
    int random = new Random().nextInt(10) + 1;
    int lives = 3;

    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      int guess = scanner.nextInt();

      if (guess > random) {
        System.out.println("Your number is bigger than our number.");
        --lives;

        if (lives > 0) {
          System.out.println("Give it another go!");
        }
        displayLives(lives);
      } else if (guess < random) {
        System.out.println("Your number is smaller than our number.");
        --lives;
        if (lives > 0) {
          System.out.println("Give it another go!");
        }
        displayLives(lives);
      } else {
        System.out.println("Yes! You guessed the number!");
        break;
      }
    }

    if (lives == 0) {
      System.out.println("Game over. Good luck next time!");
    }
    scanner.close();
  }

  static void displayLives(int n) {
    StringBuilder sb = new StringBuilder(("You have " + n + " " + (n == 1 ? "life" : "lives") + " left: "));

    for (int i = 0; i < n; i++) {
      sb.append("❤");
    }
    System.out.println(sb);
  }
}
