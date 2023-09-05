package generics.method_and_interface;

public interface MinMax <T extends Comparable<T>> {
  T min (T x, T y);
  T max (T x, T y);
}

class Example1 implements MinMax<Double> {
  @Override
  public Double min(Double x, Double y) {
    if (x<y) {
      return x;
    } else {
      return y;
    }
  }
  @Override
  public Double max(Double x, Double y) {
    return x>y? x: y;
  }

}

class Example2 implements MinMax<Integer> {


  @Override
  public Integer min(Integer x, Integer y) {
    return null;
  }

  @Override
  public Integer max(Integer x, Integer y) {
    return null;
  }
}
