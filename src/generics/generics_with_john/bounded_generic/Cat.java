package generics.generics_with_john.bounded_generic;
import java.io.Serializable;
public class Cat extends Animal implements Serializable {
  private String litterPreference;

  public Cat(String name) {
    this.name = name;
  }

  public Cat() {
    // Default constructor
  }

  public String getLitterPreference() {
    return litterPreference;
  }

  public void setLitterPreference(String litterPreference) {
    this.litterPreference = litterPreference;
  }
}

