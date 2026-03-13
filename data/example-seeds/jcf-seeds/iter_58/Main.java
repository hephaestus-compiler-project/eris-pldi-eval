package src.totted;


class Main {
  static <T> T bottom() { throw new java.lang.RuntimeException(); }
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



interface UnaryOperator<T1> extends java.util.function.Function<T1, T1> {
  static public <F1> src.totted.@Nullable UnaryOperator<F1> identity() {
    try{
      return (src.totted.UnaryOperator<F1>) null;
  }
    catch (java.lang.Exception e) { return Main.<src.totted.@Nullable UnaryOperator<F1>>bottom(); }}
}