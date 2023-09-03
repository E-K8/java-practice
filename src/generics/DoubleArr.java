package generics;

public class DoubleArr {
  Double[] array;
  public DoubleArr(Double[] array) {
    this.array = array;
  }

  public Double[] getArray() {
    return array;
  }

  public Double getElement(int idx) {
    return array[idx];
  }

  public void setArray(Double[] array) {
    this.array = array;
  }
}
