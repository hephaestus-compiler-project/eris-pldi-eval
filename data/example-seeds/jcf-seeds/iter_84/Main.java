package src.stoppard;


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



class ParseException extends java.lang.Exception {
ParseException(@Nullable String p0, int p1){
    super();
  }

  public int getErrorOffset() {
    try{
      long alisa = (long)-52;
      return (Main.<java.util.function.IntFunction<Integer>>bottom()).apply((Main.<java.util.function.LongFunction<Integer>>bottom()).apply(alisa));
    }
    catch (java.lang.Exception e) { return 1; }}
}