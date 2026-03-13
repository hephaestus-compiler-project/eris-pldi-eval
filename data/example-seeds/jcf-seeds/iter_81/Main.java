package src.masque;


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



class FileInputStream extends java.io.InputStream {
FileInputStream(java.io.@Nullable FileDescriptor p0){
    super();
  }

FileInputStream(java.io.File p0){
    this((java.io.FileDescriptor) null);
  }

FileInputStream(@Nullable String p0){
    this((java.io.FileDescriptor) null);
  }

  public void close() {
    try{
      java.time.temporal.TemporalAccessor literals = (Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor>>bottom()).queryFrom((Main.<java.util.concurrent.Callable<java.time.temporal.TemporalAccessor>>bottom()).call());
      Void casings = (Main.<java.time.temporal.TemporalQuery<Void>>bottom()).queryFrom(literals);
      java.util.function.Function.<Void>identity().apply(casings);
    }
    catch (java.lang.Exception e) {  }}

  public java.nio.channels.@Nullable FileChannel getChannel() {
    try{
      int wishing = 57;
      int datelined = (wishing + -54);
      final boolean rio = java.util.function.Function.<Boolean>identity().apply((Main.<java.util.function.IntFunction<Boolean>>bottom()).apply(datelined));
      final java.io.File[] scrape = new java.io.File[]{Main.<java.io.File>bottom(), Main.<java.io.File>bottom(), Main.<java.io.File>bottom()};
      final String near = java.util.function.Function.<String>identity().apply((Main.<java.util.concurrent.Callable<String>>bottom()).call());
      java.io.File fluffs = new java.io.File(  (switch (-82) {
  case -3 -> "martinis";
  case -19 -> "lott";
  case 27 -> "seder";
  case 6 -> "grater";
  case 15 -> "strep";
  case 47 -> "prize";
  default -> "next";
  }), (Main.<java.util.function.Supplier<String>>bottom()).get());
      return new src.masque.FileInputStream(  ((rio) ?
  new java.io.File(scrape[(Main.<java.util.function.Supplier<Integer>>bottom()).get()], near) : 
   fluffs)).getChannel();
    }
    catch (java.lang.Exception e) { return Main.<java.nio.channels.@Nullable FileChannel>bottom(); }}

  public int read() {
    try{
      final java.time.temporal.TemporalAccessor rubbers = Main.<java.time.temporal.TemporalAccessor>bottom();
      final double lunged = (Main.<java.time.temporal.TemporalQuery<Double>>bottom()).queryFrom(rubbers);
      return (Main.<java.util.function.DoubleFunction<Integer>>bottom()).apply(lunged);
    }
    catch (java.lang.Exception e) { return 1; }}

  public int read(byte[] p0, int p1, int p2) {
    try{
      return (Main.<java.util.function.Supplier<Integer>>bottom()).get();
  }
    catch (java.lang.Exception e) { return 1; }}

  public int available() {
    try{
      int reserve = -26;
      return (Main.<java.util.function.IntFunction<Integer>>bottom()).apply(reserve);
    }
    catch (java.lang.Exception e) { return 1; }}

  public java.io.FileDescriptor getFD() {
    try{
      final java.time.temporal.TemporalAccessor rollers = Main.<java.time.temporal.TemporalAccessor>bottom();
      double roach = (Main.<java.util.function.ToDoubleBiFunction<java.lang.ClassLoader, java.security.spec.PKCS8EncodedKeySpec>>bottom()).applyAsDouble(  (switch (75) {
  case 36 -> Main.<java.lang.ClassLoader>bottom();
  case -88 -> Main.<java.lang.ClassLoader>bottom();
  case 77 -> Main.<java.lang.ClassLoader>bottom();
  default -> Main.<java.lang.ClassLoader>bottom();
  }), (Main.<java.time.temporal.TemporalQuery<java.security.spec.PKCS8EncodedKeySpec>>bottom()).queryFrom(java.util.function.Function.<java.time.temporal.TemporalAccessor>identity().apply(rollers)));
      int haunted = (Main.<java.util.function.DoubleFunction<Integer>>bottom()).apply(roach);
      if(((new java.io.FileInputStream((Main.<java.util.concurrent.Callable<java.io.FileDescriptor>>bottom()).call()).read(  (switch (-18) {
  case 38 -> new byte[]{(byte)-21};
  case 75 -> new byte[]{(byte)84, (byte)-49};
  case -70 -> Main.<byte[]>bottom();
  default -> new byte[]{(byte)42, (byte)-51, (byte)28};
  }),   (switch (88) {
  case -39 -> -62;
  case 4 -> -65;
  case 88 -> 64;
  case 33 -> 16;
  default -> -16;
  }), (new Integer[]{-26, -61})[new java.io.FileInputStream(Main.<java.io.File>bottom()).read(new byte[]{(byte)87})]) <= (Main.<java.util.function.IntFunction<Byte>>bottom()).apply((new Integer[]{-74})[(Main.<java.util.function.Supplier<Integer>>bottom()).get()]))))
      {
        return (Main.<java.util.function.IntFunction<java.io.FileDescriptor>>bottom()).apply(haunted);
      }
      else
              return Main.<java.io.FileDescriptor>bottom();
    }
    catch (java.lang.Exception e) { return Main.<java.io.FileDescriptor>bottom(); }}

  public int read(byte[] p0) {
    try{
      return java.io.InputStream.nullInputStream().read();
  }
    catch (java.lang.Exception e) { return 1; }}

  public long skip(long p0) {
    try{
      return (long)20;
  }
    catch (java.lang.Exception e) { return 1; }}
}

interface Closeable extends src.masque.AutoCloseable {
  public abstract void close() ;
}

interface AutoCloseable {
  public abstract void close() ;
}