package src.plodder;

class Main {

}

interface Function0<R> {
  public R apply();
}

interface Function1<A1, R> {
  public R apply(A1 a1);
}

interface Function2<A1, A2, R> {
  public R apply(A1 a1, A2 a2);
}

interface Function3<A1, A2, A3, R> {
  public R apply(A1 a1, A2 a2, A3 a3);
}



interface ObjectInputFilter {
  public abstract java.io.ObjectInputFilter.Status checkInput(src.plodder.ObjectInputFilter.FilterInfo p0) 

  static interface FilterInfo {
    public abstract long depth() 

    public abstract java.lang.Class<?> serialClass() 

    public abstract long arrayLength() 

    public abstract long references() 

    public abstract long streamBytes() 
}
}