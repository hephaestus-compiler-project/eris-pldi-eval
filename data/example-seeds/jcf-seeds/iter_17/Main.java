package src.spaceship;


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



abstract class TimerTask implements src.spaceship.Runnable {
  public void run() {
    try{
      Void[] indorsed = Main.<Void[]>bottom();
Object x_0 = indorsed[java.util.function.Function.<Integer>identity().apply((Main.<java.util.concurrent.Callable<Integer>>bottom()).call())];
    }
    catch (java.lang.Exception e) {  }}

  public boolean cancel() {
    try{
      return (Main.<java.util.function.DoubleFunction<Boolean>>bottom()).apply((Main.<java.util.function.Supplier<Double>>bottom()).get());
  }
    catch (java.lang.Exception e) { return false; }}

  public long scheduledExecutionTime() {
    try{
      return java.util.function.LongUnaryOperator.identity().applyAsLong((Main.<java.util.function.Supplier<Long>>bottom()).get());
  }
    catch (java.lang.Exception e) { return 1; }}
}

interface Runnable {
  public abstract void run() ;
}