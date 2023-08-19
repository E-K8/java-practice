package oop3.interfaces;

public class Car implements CarRemote, CarRemote.OpenTrunk {
  @Override
  public void openDoor() {
    System.out.println("opening door");
  }

  @Override
  public void openTrunk() {
    System.out.println("opening trunk");
  }

  @Override
  public void openAllDoors() {
    CarRemote.super.openAllDoors();
  }
}
