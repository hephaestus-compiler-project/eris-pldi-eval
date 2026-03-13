package src.pinky;


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



class ZipOutputStream extends java.util.zip.DeflaterOutputStream {
  static public int CENATX = 1;
  static public int CENCRC = 1;
  static public int CENEXT = 1;
  static public int CENHDR = 1;
  static public int CENLEN = 1;
  static public int CENOFF = 1;
  static public int CENSIZ = 1;
  static public int CENVEM = 1;
  static public int DEFLATED = 1;
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
  static public int STORED = 1;
  static public int CENATT = 1;
  static public int CENCOM = 1;
  static public int CENDSK = 1;
  static public int CENFLG = 1;
  static public int CENHOW = 1;
  static public int CENNAM = 1;
  static public long CENSIG = 1;
  static public int CENTIM = 1;
  static public int CENVER = 1;
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

ZipOutputStream(java.io.@Nullable OutputStream p0, java.nio.charset.Charset p1){
    super(Main.<java.io.OutputStream>bottom(), Main.<java.util.zip.Deflater>bottom());
  }

ZipOutputStream(java.io.@Nullable OutputStream p0){
    this((java.io.OutputStream) null, Main.<java.nio.charset.Charset>bottom());
  }

  public void closeEntry() {
    try{
      final Void[] rationale = new Void[]{Main.<Void>bottom(), Main.<Void>bottom(), Main.<Void>bottom()};
      final Long[] doped = Main.<Long[]>bottom();
      int cloisters = java.util.zip.ZipOutputStream.LOCNAM;
      long countable = doped[cloisters];
      int evans = (Main.<java.util.function.LongFunction<Integer>>bottom()).apply(countable);
Object x_0 = rationale[evans];
    }
    catch (java.lang.Exception e) {  }}

  public void putNextEntry(java.util.zip.@Nullable ZipEntry p0) {
    try{
      (Main.<java.util.function.Supplier<Void>>bottom()).get();
  }
    catch (java.lang.Exception e) {  }}

  public void setLevel(int p0) {
    try{
      final short bathes = (short)72;
      final char colluding = 'K';
      final float lallygags = (float)16.423;
      if(((Main.<java.util.function.IntFunction<Boolean>>bottom()).apply((Main.<java.util.function.Supplier<Integer>>bottom()).get())))
      {
        boolean plainer = (colluding > lallygags);
        final double catbirds = 33.756;
        final java.time.temporal.TemporalAccessor mummery = (Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalAccessor>>bottom()).apply((Main.<java.util.function.DoubleFunction<Double>>bottom()).apply(catbirds));
        if(((new Boolean[]{false, true})[java.util.zip.ZipOutputStream.CENOFF]))
        {        }
        else
        {
          final java.time.temporal.TemporalAccessor atari = ((plainer) ?
            Main.<java.time.temporal.TemporalAccessor>bottom() : 
             mummery);
          Void cresting = (Main.<java.time.temporal.TemporalQuery<Void>>bottom()).queryFrom(atari);
Object x_1 = (((bathes > (Main.<java.util.function.DoubleFunction<Long>>bottom()).apply((Main.<java.util.concurrent.Callable<Double>>bottom()).call()))) ?
            Main.<Void>bottom() : 
             cresting);;
        }
      }
      else
      {      }
    }
    catch (java.lang.Exception e) {  }}

  public void write(byte[] p0, int p1, int p2) {
    try{
      final long fulls = (Main.<java.util.concurrent.Callable<Long>>bottom()).call();
      (Main.<java.util.function.LongFunction<Void>>bottom()).apply(fulls);
    }
    catch (java.lang.Exception e) {  }}

  public void close() {
    try{
      (Main.<java.util.function.Supplier<Void>>bottom()).get();
  }
    catch (java.lang.Exception e) {  }}

  public void finish() {
    try{
      int neocons = 31;
      if((true))
      {      }
      else
      {
        long allege = java.util.function.Function.<Long>identity().apply((Main.<java.util.function.IntFunction<Long>>bottom()).apply(neocons));
Object x_2 = (new Void[]{Main.<Void>bottom()})[(Main.<java.util.function.IntFunction<Integer>>bottom()).apply((Main.<java.util.function.LongFunction<Integer>>bottom()).apply(allege))];
      }
    }
    catch (java.lang.Exception e) {  }}

  public void setComment(@Nullable String p0) {
    try{
      (Main.<java.util.function.Supplier<Void>>bottom()).get();
  }
    catch (java.lang.Exception e) {  }}

  public void setMethod(int p0) {
    try{
      Object x_3 =       (switch (-3) {
        case -21 -> Main.<Void>bottom();
        case -93 -> Main.<Void>bottom();
        case -69 -> Main.<Void>bottom();
        default -> Main.<Void>bottom();
      });;
  }
    catch (java.lang.Exception e) {  }}
}

class FilterOutputStream extends java.io.OutputStream {
FilterOutputStream(java.io.@Nullable OutputStream p0){
    super();
  }

  public void flush() {
    try{
      (Main.<java.util.function.Supplier<Void>>bottom()).get();
  }
    catch (java.lang.Exception e) {  }}

  public void write(byte[] p0, int p1, int p2) {
    try{
      (Main.<java.util.function.Supplier<Void>>bottom()).get();
  }
    catch (java.lang.Exception e) {  }}

  public void close() {
    try{
      Void[] elongates = new Void[]{Main.<Void>bottom(), Main.<Void>bottom()};
      int arraign = -64;
      if(((Main.<Boolean[]>bottom())[(Main.<java.util.function.DoubleFunction<Integer>>bottom()).apply((Main.<java.util.function.Supplier<Double>>bottom()).get())]))
      {
        Object x_4 = elongates[arraign];
      }
      else
      {      }
    }
    catch (java.lang.Exception e) {  }}

  public void write(byte[] p0) {
    try{
      (Main.<java.util.function.Supplier<Void>>bottom()).get();
  }
    catch (java.lang.Exception e) {  }}

  public void write(int p0) {
    try{
      Object x_5 =       (switch (-15) {
        case -44 -> Main.<Void>bottom();
        case 79 -> Main.<Void>bottom();
        case -79 -> Main.<Void>bottom();
        case -10 -> Main.<Void>bottom();
        case -31 -> Main.<Void>bottom();
        case -6 -> Main.<Void>bottom();
        default -> Main.<Void>bottom();
      });;
  }
    catch (java.lang.Exception e) {  }}
}