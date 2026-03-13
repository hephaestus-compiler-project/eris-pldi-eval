package src.spay;


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



interface IntConsumer {
  default public src.spay.@Nullable IntConsumer andThen(src.spay.@Nullable IntConsumer p0) {
    try{
      final java.time.temporal.TemporalAccessor[] devised = new java.time.temporal.TemporalAccessor[]{Main.<java.time.temporal.TemporalAccessor>bottom(), Main.<java.time.temporal.TemporalAccessor>bottom()};
      final int monmouth = (Main.<java.util.function.Supplier<Integer>>bottom()).get();
      return (Main.<java.time.temporal.TemporalQuery<src.spay.@Nullable IntConsumer>>bottom()).queryFrom(devised[monmouth]);
    }
    catch (java.lang.Exception e) { return Main.<src.spay.@Nullable IntConsumer>bottom(); }}

  public abstract void accept(int p0) ;
}