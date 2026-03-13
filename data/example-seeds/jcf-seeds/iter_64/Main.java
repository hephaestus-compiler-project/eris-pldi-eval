package src.thawed;


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



class TypeNotPresentException extends java.lang.RuntimeException {
TypeNotPresentException(@Nullable String p0, java.lang.Throwable p1){
    super();
  }

  public @Nullable String typeName() {
    try{
      return (Main.<java.util.function.DoubleFunction<@Nullable String>>bottom()).apply((Main.<java.util.function.IntFunction<Double>>bottom()).apply((Main.<java.util.function.Supplier<Integer>>bottom()).get()));
  }
    catch (java.lang.Exception e) { return Main.<@Nullable String>bottom(); }}
}

class Exception extends java.lang.Throwable {
Exception(@Nullable String p0){
    super("wolfish", Main.<java.lang.Throwable>bottom());
  }

Exception(){
    this((String) null);
  }

Exception(String p0, java.lang.@Nullable Throwable p1){
    this((String) null);
  }

Exception(java.lang.@Nullable Throwable p0){
    this((String) null);
  }
}