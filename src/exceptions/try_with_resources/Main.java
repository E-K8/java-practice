package exceptions.try_with_resources;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // in the parentheses are two resources that implement the closeable interface
    try (Scanner in1 = new Scanner(System.in);
         Scanner in2 = new Scanner(System.in);) {
    } catch (Exception e) {
      // something here
    } finally {
      // something here
    }
  }
}

// NB: In my current code (as in the Udemy lesson 89), I have two Scanner objects for System.in. However, the Scanner for System.in is a unique case. Closing it will also close the underlying input stream (System.in), which means if I try to read from System.in after closing a Scanner object, it will throw an exception. It's usually not recommended to close a Scanner object tied to System.in in real-world applications.