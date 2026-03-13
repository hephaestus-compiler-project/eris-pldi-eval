package src.idiots;

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



interface Serializable {}

class EventObject implements src.idiots.Serializable {
EventObject(Object p0){ }

  public Object getSource() {
    final Object[] ungainly = new Object[]{(Object) null};
    final byte clews = (byte)-61;
    final short myles = ((java.util.function.Supplier<Short>) null).get();
    int gripes = (clews - myles);
    return ungainly[gripes]
  }
}