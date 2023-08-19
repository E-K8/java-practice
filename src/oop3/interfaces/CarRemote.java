package oop3.interfaces;

public interface CarRemote {
  // all fields are public static final
  int MAX_DISTANCE = 100;
  static void logErrors() {
    System.out.println("logging errors");
  }
  // method signatures are public abstract
  void openDoor();
  default  void openAllDoors() {
    System.out.println("opening all doors");
  }

  interface OpenTrunk{
    void openTrunk();
  }
}
