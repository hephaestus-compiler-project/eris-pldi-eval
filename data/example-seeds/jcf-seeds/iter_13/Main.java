package src.dreyfus;


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



interface Condition {
  public abstract boolean await(long p0, java.util.concurrent.TimeUnit p1) ;

  public abstract void awaitUninterruptibly() ;

  public abstract void signal() ;

  public abstract void await() ;

  public abstract long awaitNanos(long p0) ;

  public abstract boolean awaitUntil(java.util.Date p0) ;

  public abstract void signalAll() ;
}