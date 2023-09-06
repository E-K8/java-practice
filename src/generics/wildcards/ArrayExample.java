package generics.wildcards;

public class ArrayExample<T> {
  T[] array;

  public ArrayExample(T[] array) {
    this.array = array;
  }

  boolean isLongerThan(ArrayExample<?> otherArray) {
    return this.array.length > otherArray.array.length;
  }
}


