package generics;

public class GenericArr<T> {
  T[] array;

  public GenericArr(T[] array) {
    this.array = array;
  }

  public T[] getArray() {
    return array;
  }

  public T getElement(int idx) {
    return array[idx];
  }

  public  void setArray(T[] array) {
    this.array = array;
  }
}

