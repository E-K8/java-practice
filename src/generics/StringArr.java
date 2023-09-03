
package generics;

public class StringArr {
  String[] array;
  public StringArr(String[] array) {
    this.array = array;
  }

  public String[] getArray() {
    return array;
  }

  public String getElement(int idx) {
    return array[idx];
  }

  public void setArray(String[] array) {
    this.array = array;
  }
}

