package src.wraps;


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



class StringJoiner {
StringJoiner(java.lang.@Nullable CharSequence p0, java.lang.CharSequence p1, java.lang.CharSequence p2){  }

StringJoiner(java.lang.CharSequence p0){
    this((java.lang.CharSequence) null, Main.<java.lang.CharSequence>bottom(), Main.<java.lang.CharSequence>bottom());
  }

  public int length() {
    try{
      return (Main.<java.util.function.Supplier<Integer>>bottom()).get();
  }
    catch (java.lang.Exception e) { return 1; }}

  public src.wraps.StringJoiner setEmptyValue(java.lang.@Nullable CharSequence p0) {
    try{
      return Main.<src.wraps.StringJoiner>bottom();
  }
    catch (java.lang.Exception e) { return Main.<src.wraps.StringJoiner>bottom(); }}

  public src.wraps.StringJoiner add(java.lang.@Nullable CharSequence p0) {
    try{
      final java.lang.CharSequence balances = (Main.<java.util.concurrent.Callable<java.lang.CharSequence>>bottom()).call();
      final java.lang.CharSequence snitched = java.util.function.Function.<java.lang.CharSequence>identity().apply(balances);
      return new src.wraps.StringJoiner(snitched);
    }
    catch (java.lang.Exception e) { return Main.<src.wraps.StringJoiner>bottom(); }}

  public src.wraps.StringJoiner merge(src.wraps.StringJoiner p0) {
    try{
      return (Main.<java.util.function.IntFunction<src.wraps.StringJoiner>>bottom()).apply((Main.<java.util.function.IntFunction<Integer>>bottom()).apply((Main.<java.util.concurrent.Callable<Integer>>bottom()).call()));
  }
    catch (java.lang.Exception e) { return Main.<src.wraps.StringJoiner>bottom(); }}
}