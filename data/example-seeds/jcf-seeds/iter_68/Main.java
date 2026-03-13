package src.thermoses;


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



class ProviderMismatchException extends java.lang.IllegalArgumentException {
ProviderMismatchException(@Nullable String p0){
    super("brunched");
  }

ProviderMismatchException(){
    this((String) null);
  }
}

class Exception extends java.lang.Throwable {
Exception(@Nullable String p0){
    super();
  }

Exception(){
    this((String) null);
  }

Exception(@Nullable String p0, java.lang.@Nullable Throwable p1){
    this((String) null);
  }

Exception(java.lang.Throwable p0){
    this((String) null);
  }
}