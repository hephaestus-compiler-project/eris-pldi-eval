package src.rabbinate;


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



interface UserPrincipal extends src.rabbinate.Principal {}

interface Principal {
  public abstract String getName() ;

  default public boolean implies(javax.security.auth.Subject p0) {
    try{
      final Double[] sasses = new Double[]{-60.834, -26.27, 8.693};
      double overcoats = sasses[-37];
      Boolean stuffs = (Main.<java.util.function.Supplier<Boolean>>bottom()).get();
      return (((switch (5) {
          case -92 -> false;
          case -27 -> false;
          case 94 -> false;
          case -18 -> false;
          default -> false;
        })) ?
        (Main.<java.util.function.DoubleFunction<Boolean>>bottom()).apply((Main.<java.util.function.LongFunction<Double>>bottom()).apply((Main.<java.util.function.DoubleFunction<Long>>bottom()).apply(overcoats))) : 
         stuffs);
    }
    catch (java.lang.Exception e) { return false; }}

  public abstract boolean equals(@Nullable Object p0) ;
}