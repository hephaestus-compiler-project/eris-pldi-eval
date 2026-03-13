package src.client;


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



class ZipFile implements java.io.Closeable {
  static public int CENATX = 1;
  static public int CENCRC = 1;
  static public int CENEXT = 1;
  static public int CENHDR = 1;
  static public int CENLEN = 1;
  static public int CENOFF = 1;
  static public int CENSIZ = 1;
  static public int CENVEM = 1;
  static public int ENDCOM = 1;
  static public int ENDOFF = 1;
  static public int ENDSIZ = 1;
  static public int ENDTOT = 1;
  static public int EXTHDR = 1;
  static public long EXTSIG = 1;
  static public int LOCCRC = 1;
  static public int LOCFLG = 1;
  static public int LOCHOW = 1;
  static public int LOCNAM = 1;
  static public int LOCSIZ = 1;
  static public int LOCVER = 1;
  static public int OPEN_READ = 1;
  static public int CENATT = 1;
  static public int CENCOM = 1;
  static public int CENDSK = 1;
  static public int CENFLG = 1;
  static public int CENHOW = 1;
  static public int CENNAM = 1;
  static public long CENSIG = 1;
  static public int CENTIM = 1;
  static public int CENVER = 1;
  static public int ENDHDR = 1;
  static public long ENDSIG = 1;
  static public int ENDSUB = 1;
  static public int EXTCRC = 1;
  static public int EXTLEN = 1;
  static public int EXTSIZ = 1;
  static public int LOCEXT = 1;
  static public int LOCHDR = 1;
  static public int LOCLEN = 1;
  static public long LOCSIG = 1;
  static public int LOCTIM = 1;
  static public int OPEN_DELETE = 1;

ZipFile(java.io.@Nullable File p0, int p1){  }

ZipFile(java.io.@Nullable File p0, java.nio.charset.Charset p1){
    this((java.io.File) null, -81);
  }

ZipFile(@Nullable String p0, java.nio.charset.Charset p1){
    this((java.io.File) null, -33);
  }

ZipFile(java.io.@Nullable File p0){
    this((java.io.File) null, 32);
  }

ZipFile(java.io.File p0, int p1, java.nio.charset.@Nullable Charset p2){
    this((java.io.File) null, 77);
  }

ZipFile(@Nullable String p0){
    this((java.io.File) null, -90);
  }

  public java.util.@Nullable Enumeration<? extends java.util.zip.@Nullable ZipEntry> entries() {
    try{
      boolean braille = (switch (4) {
        case -47 -> false;
        case -86 -> true;
        case -25 -> true;
        case 79 -> true;
        default -> false;
      });
      final java.time.temporal.TemporalAccessor methanol = Main.<java.time.temporal.TemporalAccessor>bottom();
      java.util.@Nullable Enumeration<? extends java.util.zip.@Nullable ZipEntry> ronda = (Main.<java.time.temporal.TemporalQuery<java.util.@Nullable Enumeration<? extends java.util.zip.@Nullable ZipEntry>>>bottom()).queryFrom((Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor>>bottom()).queryFrom(methanol));
      return ((braille) ?
        (Main.<java.util.concurrent.Callable<java.util.@Nullable Enumeration<? extends java.util.zip.@Nullable ZipEntry>>>bottom()).call() : 
         ronda);
    }
    catch (java.lang.Exception e) { return Main.<java.util.@Nullable Enumeration<? extends java.util.zip.@Nullable ZipEntry>>bottom(); }}

  public String getComment() {
    try{
      final int pretend = (Main.<java.util.function.Supplier<Integer>>bottom()).get();
      final java.time.temporal.TemporalAccessor[] save = new java.time.temporal.TemporalAccessor[]{Main.<java.time.temporal.TemporalAccessor>bottom(), Main.<java.time.temporal.TemporalAccessor>bottom(), Main.<java.time.temporal.TemporalAccessor>bottom()};
      int laureate = java.util.zip.ZipFile.CENSIZ;
      final java.time.temporal.TemporalAccessor donkeys = save[laureate];
      java.time.temporal.TemporalAccessor pancaked = (((Main.<java.util.function.IntFunction<Boolean>>bottom()).apply(pretend)) ?
        donkeys : 
         (Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalAccessor>>bottom()).apply((Main.<java.util.function.Supplier<Double>>bottom()).get()));
      java.time.temporal.TemporalAccessor shrift = (Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalAccessor>>bottom()).apply(-68.616);
      return (Main.<java.time.temporal.TemporalQuery<String>>bottom()).queryFrom(  (((Main.<java.util.concurrent.Callable<Boolean>>bottom()).call()) ?
  pancaked : 
   shrift));
    }
    catch (java.lang.Exception e) { return Main.<String>bottom(); }}

  public java.io.InputStream getInputStream(java.util.zip.ZipEntry p0) {
    try{
      return (Main.<java.util.function.Supplier<java.io.InputStream>>bottom()).get();
  }
    catch (java.lang.Exception e) { return Main.<java.io.InputStream>bottom(); }}

  public int size() {
    try{
      long topped = (long)54;
      return (Main.<java.util.function.LongFunction<Integer>>bottom()).apply(topped);
    }
    catch (java.lang.Exception e) { return 1; }}

  public void close() {
    try{
      Void[] tipples = new Void[]{Main.<Void>bottom()};
      Integer misprint = -27;
Object x_0 = tipples[java.util.function.Function.<Integer>identity().apply(misprint)];
    }
    catch (java.lang.Exception e) {  }}

  public java.util.zip.@Nullable ZipEntry getEntry(@Nullable String p0) {
    try{
      return (java.util.zip.ZipEntry) null;
  }
    catch (java.lang.Exception e) { return Main.<java.util.zip.@Nullable ZipEntry>bottom(); }}

  public String getName() {
    try{
      return "peaces";
  }
    catch (java.lang.Exception e) { return Main.<String>bottom(); }}

  public java.util.stream.Stream<? extends java.util.zip.ZipEntry> stream() {
    try{
      java.time.temporal.TemporalAccessor plovers = (Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalAccessor>>bottom()).apply((Main.<java.util.function.Supplier<Double>>bottom()).get());
      return (Main.<java.time.temporal.TemporalQuery<java.util.stream.Stream<? extends java.util.zip.ZipEntry>>>bottom()).queryFrom(plovers);
    }
    catch (java.lang.Exception e) { return Main.<java.util.stream.Stream<? extends java.util.zip.ZipEntry>>bottom(); }}
}