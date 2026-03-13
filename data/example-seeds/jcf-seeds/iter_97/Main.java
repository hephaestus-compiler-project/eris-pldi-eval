package src.mother;


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



class GZIPInputStream extends java.util.zip.InflaterInputStream {
  static public int GZIP_MAGIC = 1;

GZIPInputStream(java.io.InputStream p0, int p1){
    super(Main.<java.io.InputStream>bottom());
  }

GZIPInputStream(java.io.InputStream p0){
    this(Main.<java.io.InputStream>bottom(), 83);
  }

  public int read(byte[] p0, int p1, int p2) {
    try{
      final int defecate = 100;
      return (new Integer[]{-99, -63, -17})[defecate];
    }
    catch (java.lang.Exception e) { return 1; }}

  public void close() {
    try{
      Object x_0 =       (switch (48) {
        case -7 -> Main.<Void>bottom();
        case -16 -> Main.<Void>bottom();
        case -32 -> Main.<Void>bottom();
        case 60 -> Main.<Void>bottom();
        case -17 -> Main.<Void>bottom();
        default -> Main.<Void>bottom();
      });;
  }
    catch (java.lang.Exception e) {  }}
}

interface Closeable extends src.mother.AutoCloseable {
  public abstract void close() ;
}

interface AutoCloseable {
  public abstract void close() ;
}