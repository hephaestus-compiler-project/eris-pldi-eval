package src.slogans;


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



interface Serializable {}

class IOError extends src.slogans.Error {
IOError(java.lang.Throwable p0){
    super((java.lang.Throwable) null);
  }
}

class Error extends java.lang.Throwable {
Error(@Nullable String p0){
    super();
  }

Error(){
    this((String) null);
  }

Error(@Nullable String p0, java.lang.Throwable p1){
    this((String) null);
  }

Error(java.lang.@Nullable Throwable p0){
    this((String) null);
  }
}