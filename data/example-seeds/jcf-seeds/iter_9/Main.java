package src.hushing;


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

class InputMismatchException extends java.util.NoSuchElementException {
InputMismatchException(String p0){
    super("truckle");
  }

InputMismatchException(){
    this("synching");
  }
}

class Exception extends java.lang.Throwable {
Exception(String p0){
    super();
  }

Exception(){
    this("drifting");
  }

Exception(String p0, java.lang.Throwable p1){
    this("canyons");
  }

Exception(java.lang.@Nullable Throwable p0){
    this("goddard");
  }
}