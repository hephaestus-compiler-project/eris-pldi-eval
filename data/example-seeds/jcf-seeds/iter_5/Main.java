package src.izmir;


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



interface Future<T1> {
  public abstract @Nullable T1 get() ;

  public abstract boolean isCancelled() ;

  public abstract boolean cancel(boolean p0) ;

  public abstract T1 get(long p0, java.util.concurrent.@Nullable TimeUnit p1) ;

  public abstract boolean isDone() ;
}