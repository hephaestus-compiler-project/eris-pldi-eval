package src.shrieks;


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



class FutureTask<T1> implements java.util.concurrent.RunnableFuture<T1> {
FutureTask(java.util.concurrent.Callable<T1> p0){  }

FutureTask(java.lang.Runnable p0, T1 p1){
    this(Main.<java.util.concurrent.Callable<T1>>bottom());
  }

  public T1 get() {
    try{
      return (Main.<java.util.concurrent.Callable<T1>>bottom()).call();
  }
    catch (java.lang.Exception e) { return Main.<T1>bottom(); }}

  public T1 get(long p0, java.util.concurrent.TimeUnit p1) {
    try{
      long crowbar = (Main.<java.util.concurrent.Future<Long>>bottom()).get();
      java.util.concurrent.Callable<Long> siegfried = (Main.<java.util.function.LongFunction<java.util.concurrent.Callable<Long>>>bottom()).apply((Main.<java.util.concurrent.Future<Long>>bottom()).get(crowbar, p1));
      java.util.concurrent.TimeUnit mummery = (switch (76) {
        case -27 -> Main.<java.util.concurrent.TimeUnit>bottom();
        case -98 -> Main.<java.util.concurrent.TimeUnit>bottom();
        default -> Main.<java.util.concurrent.TimeUnit>bottom();
      });
      final int wickers = 70;
      int triptychs = (wickers + (byte)-61);
      if(((Main.<java.util.concurrent.Future<Boolean>>bottom()).get()))
      {
        java.util.concurrent.Callable<Integer> unhook = (Main.<java.util.function.IntFunction<java.util.concurrent.Callable<Integer>>>bottom()).apply(triptychs);
        if(((switch (54) {
            case 69 -> true;
            case -49 -> false;
            default -> false;
          })))
                  return Main.<T1>bottom();
        else
        {
          return this.get(new src.shrieks.FutureTask<Long>(siegfried).get(  (switch (94) {
  case -29 -> (long)21;
  case 37 -> (long)70;
  case 75 -> (long)45;
  case 6 -> (long)-67;
  default -> (long)88;
  }), mummery), (Main.<java.util.function.IntFunction<java.util.concurrent.TimeUnit>>bottom()).apply(new java.util.concurrent.FutureTask<Integer>(unhook).get()));
        }
      }
      else
              return Main.<T1>bottom();
    }
    catch (java.lang.Exception e) { return Main.<T1>bottom(); }}
}