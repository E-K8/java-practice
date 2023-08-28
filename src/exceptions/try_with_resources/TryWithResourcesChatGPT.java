package exceptions.try_with_resources;

//To illustrate the try-with-resources concept, you'll want to:
//        Use resources that make it clear why you're using try-with-resources.
//        Show the difference between managing resources manually and using try-with-resources.
//
//        Let's use an example with a simple class AutoCloseResource that simulates a resource that needs closing. Here's an illustration of the try-with-resources concept:

public class TryWithResourcesChatGPT {

  public static void main(String[] args) {
    // Traditional try-catch-finally
    AutoCloseResource resource1 = null;
    try {
      resource1 = new AutoCloseResource("Resource1");
      resource1.operate();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      if (resource1 != null) {
        try {
          resource1.close();
        } catch (Exception e) {
          System.out.println("Error closing resource1: " + e.getMessage());
        }
      }
    }

    System.out.println();

    // Using try-with-resources
    try (AutoCloseResource resource2 = new AutoCloseResource("Resource2")) {
      resource2.operate();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

class AutoCloseResource implements AutoCloseable {
  private String name;

  public AutoCloseResource(String name) {
    this.name = name;
    System.out.println(name + " opened.");
  }

  public void operate() {
    System.out.println("Operating on " + name);
  }

  @Override
  public void close() throws Exception {
    System.out.println(name + " closed.");
  }
}