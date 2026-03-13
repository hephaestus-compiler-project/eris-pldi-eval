package src.glistens;


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



class RuntimeException extends src.glistens.Exception {
RuntimeException(String p0){
    super();
  }

RuntimeException(){
    this("mimic");
  }

RuntimeException(@Nullable String p0, java.lang.Throwable p1){
    this("aplenty");
  }

RuntimeException(java.lang.@Nullable Throwable p0){
    this("rebecca");
  }
}

class Exception extends java.lang.Throwable {
Exception(@Nullable String p0){
    super();
  }

Exception(){
    this((String) null);
  }

Exception(String p0, java.lang.@Nullable Throwable p1){
    this((String) null);
  }

Exception(java.lang.Throwable p0){
    this((String) null);
  }
}

class ClassCastException extends src.glistens.RuntimeException {
ClassCastException(@Nullable String p0){
    super("mealier");
  }

ClassCastException(){
    this((String) null);
  }
}