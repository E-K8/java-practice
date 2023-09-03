package generics;

public class ObjectArr {
  Object[] array;

  public ObjectArr(Object[] array) {

    this.array = array;
  }

  public Object[] getArray() {
    return array;
  }

  public Object getElement(int idx) {
    return array[idx];
  }

  public void setArray(Object[] array) {
    this.array = array;
  }
}
