package generics;

public class IntegerArr {
  Integer[] array;
  public IntegerArr(Integer[] array) {
    this.array = array;
  }

  public Integer[] getArray() {
    return array;
  }

  public Integer getElement(int idx) {
    return array[idx];
  }

  public void setArray(Integer[] array) {
    this.array = array;
  }
}
