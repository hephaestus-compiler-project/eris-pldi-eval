package src.catalepsy;


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



interface RunnableScheduledFuture<T1> extends src.catalepsy.RunnableFuture<T1>, java.util.concurrent.ScheduledFuture<T1> {
  public abstract boolean isPeriodic() ;
}

interface RunnableFuture<T1> extends java.lang.Runnable, java.util.concurrent.Future<T1> {
  public abstract void run() ;
}