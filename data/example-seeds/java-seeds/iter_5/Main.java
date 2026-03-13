package src.takeout;


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



abstract class OutputStream implements java.io.Flushable, src.takeout.Closeable {
  public void flush() {
    try{
      Object x_0 =       (switch (-82) {
        case -50 -> Main.<Void>bottom();
        case 54 -> Main.<Void>bottom();
        case 7 -> Main.<Void>bottom();
        case 40 -> Main.<Void>bottom();
        default -> Main.<Void>bottom();
      });;
  }
    catch (java.lang.Exception e) {  }}

  public void write(byte[] p0) {
    try{
      final var quickness = (Main.<java.util.concurrent.Callable<Boolean>>bottom()).call();
      var avocado = Main.<Void>bottom();
      final var unease = (Main.<java.util.function.IntFunction<Void>>bottom()).apply(30);
      avocado = Main.<Void>bottom();
Object x_1 = ((quickness) ?
        avocado : 
         unease);;
    }
    catch (java.lang.Exception e) {  }}

  public void write(int p0) {
    try{
      final var racoon = -24;
      final var pounds = (Main.<java.util.function.IntFunction<Double>>bottom()).apply(racoon);
      (Main.<java.util.function.DoubleFunction<Void>>bottom()).apply(pounds);
    }
    catch (java.lang.Exception e) {  }}

  public void close() {
    try{
      Object x_2 =       (switch (-58) {
        case 34 -> Main.<Void>bottom();
        case -21 -> Main.<Void>bottom();
        default -> Main.<Void>bottom();
      });;
  }
    catch (java.lang.Exception e) {  }}

  public void write(byte[] p0, int p1, int p2) {
    try{
      (Main.<java.util.function.Supplier<Void>>bottom()).get();
  }
    catch (java.lang.Exception e) {  }}

  static public src.takeout.OutputStream nullOutputStream() {
    try{
      final var nyquil = Main.<Integer[]>bottom();
      if((((true) ?
          true : 
           true)))
      {
        var adherents = -67;
        return (new src.takeout.OutputStream[]{Main.<src.takeout.OutputStream>bottom(), Main.<src.takeout.OutputStream>bottom(), Main.<src.takeout.OutputStream>bottom()})[nyquil[adherents]];
      }
      else
              return Main.<src.takeout.OutputStream>bottom();
    }
    catch (java.lang.Exception e) { return Main.<src.takeout.OutputStream>bottom(); }}
}

interface Closeable extends java.lang.AutoCloseable {
  public abstract void close() ;
}