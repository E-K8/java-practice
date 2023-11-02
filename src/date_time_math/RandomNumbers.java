package date_time_math;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
  public static void main(String[] args) {
    Random random = new Random();
    System.out.println("Here is a random number within the range of 5: " + random.nextInt(5));

    for (int i = 0; i < 10; i++) {
      System.out.println(getRandomNumber_03(4, 9));
    }
  }

  static int getRandomNumber_01(int min, int max) {
    Random random = new Random();
    int range = max - min;
    return random.nextInt(range) + min;
  }

  static int getRandomNumber_02(int min, int max) {
    Random random = new Random();
    return random.ints(min, max).findFirst().orElse(0);
  }

  static int getRandomNumber_03(int min, int max) {
    int range = max - min;
    int rand = (int) (Math.random() * range) + min;
    return rand;
//    or use inline variable as recommended by the IDE
//    return (int) (Math.random() * range) + min;
  }

  static int getRandomNumber_04(int min, int max) {
    return ThreadLocalRandom.current().nextInt(min, max);
  }
}
