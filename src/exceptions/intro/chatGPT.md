In Java, exceptions are categorized into two main types:

Checked Exceptions: These are the exceptions that are checked at compile-time. It means if a method is throwing a checked exception, it should handle the exception using a try-catch block, or it must specify the exception using the throws keyword, otherwise the program will give a compilation error.

Unchecked Exceptions: These are the exceptions that are not checked at compile-time, but at runtime. They are also known as runtime exceptions. These exceptions are not required to be declared in a method or constructor's throws clause.

Examples:

1. Checked Exceptions:
   IOException: This exception is thrown when an I/O operation fails or is interrupted.


      try {
      FileReader file = new FileReader("somefile.txt");
      BufferedReader fileInput = new BufferedReader(file);
      // ... read from file ...
      } catch (IOException e) {
      e.printStackTrace();
      }

FileNotFoundException: This is a subclass of IOException and is thrown specifically when trying to access a file that doesn't exist.

      try {
      FileReader file = new FileReader("nonexistentfile.txt");
      } catch (FileNotFoundException e) {
      e.printStackTrace();
      }

ClassNotFoundException: Thrown when the application tries to load a class but cannot find its definition.


      try {
      Class.forName("some.missing.ClassName");
      } catch (ClassNotFoundException e) {
      e.printStackTrace();
      }

SQLException: Thrown when there's an error in accessing or interacting with a database.

      try {
      // ... some database operations ...
      } catch (SQLException e) {
      e.printStackTrace();
      }


2. Unchecked Exceptions:
   ArithmeticException: Thrown when an exceptional arithmetic condition has occurred, like dividing by zero.

      `try {
      int result = 10 / 0;
      } catch (ArithmeticException e) {
      e.printStackTrace();
      }`

NullPointerException: Thrown when the JVM tries to access an object or call a method on an object that is currently null.


      try {
      String str = null;
      int length = str.length();
      } catch (NullPointerException e) {
      e.printStackTrace();
      }

ArrayIndexOutOfBoundsException: Thrown when trying to access an array with an illegal index (either negative or greater than/equal to the size of the array).

      try {
      int[] array = new int[5];
      int value = array[10];
      } catch (ArrayIndexOutOfBoundsException e) {
      e.printStackTrace();
      }

ClassCastException: Thrown when trying to cast an object to a subclass it doesn't belong to.

      try {
      Object x = new Integer(0);
      System.out.println((String) x);
      } catch (ClassCastException e) {
      e.printStackTrace();
      }

Unchecked exceptions are typically caused by defects in the code, whereas checked exceptions are often caused by conditions outside of the control of the program (like missing files, database connection issues, etc.).




