package exceptions.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// checked exception: compile-time exceptions
public class Solution {
  public static void main(String[] args) throws IOException {
    System.out.println("Enter your name, please:");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
    System.out.println(("You have a beautiful name, " + name + "."));
  }
}
