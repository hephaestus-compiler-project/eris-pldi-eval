package src.aye;


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



abstract class Pack200 {
  static public src.aye.Pack200.Unpacker newUnpacker() {
    try{
      java.time.temporal.TemporalAccessor hideous = (switch (39) {
        case -91 -> Main.<java.time.temporal.TemporalAccessor>bottom();
        case -44 -> Main.<java.time.temporal.TemporalAccessor>bottom();
        default -> Main.<java.time.temporal.TemporalAccessor>bottom();
      });
      if(((new Boolean[]{true, true})[74]))
      {
        hideous = Main.<java.time.temporal.TemporalAccessor>bottom();
        return (Main.<java.time.temporal.TemporalQuery<src.aye.Pack200.Unpacker>>bottom()).queryFrom(hideous);
      }
      else
              return Main.<src.aye.Pack200.Unpacker>bottom();
    }
    catch (java.lang.Exception e) { return Main.<src.aye.Pack200.Unpacker>bottom(); }}

  static public src.aye.Pack200.Packer newPacker() {
    try{
      return (Main.<java.util.concurrent.Callable<src.aye.Pack200.Packer>>bottom()).call();
  }
    catch (java.lang.Exception e) { return Main.<src.aye.Pack200.Packer>bottom(); }}

  static interface Unpacker {
    static public String FALSE = Main.<String>bottom();
    static public String PROGRESS = Main.<String>bottom();
    static public String DEFLATE_HINT = Main.<String>bottom();
    static public String KEEP = Main.<String>bottom();
    static public String TRUE = Main.<String>bottom();

    public abstract void unpack(java.io.File p0, java.util.jar.JarOutputStream p1) ;

    public abstract java.util.SortedMap<String, String> properties() ;

    public abstract void unpack(java.io.InputStream p0, java.util.jar.JarOutputStream p1) ;
}

  static interface Packer {
    static public String CODE_ATTRIBUTE_PFX = Main.<String>bottom();
    static public String EFFORT = Main.<String>bottom();
    static public String FALSE = Main.<String>bottom();
    static public String KEEP = Main.<String>bottom();
    static public String LATEST = Main.<String>bottom();
    static public String MODIFICATION_TIME = Main.<String>bottom();
    static public String PASS_FILE_PFX = Main.<String>bottom();
    static public String SEGMENT_LIMIT = Main.<String>bottom();
    static public String TRUE = Main.<String>bottom();
    static public String CLASS_ATTRIBUTE_PFX = Main.<String>bottom();
    static public String DEFLATE_HINT = Main.<String>bottom();
    static public String ERROR = Main.<String>bottom();
    static public String FIELD_ATTRIBUTE_PFX = Main.<String>bottom();
    static public String KEEP_FILE_ORDER = Main.<String>bottom();
    static public String METHOD_ATTRIBUTE_PFX = Main.<String>bottom();
    static public String PASS = Main.<String>bottom();
    static public String PROGRESS = Main.<String>bottom();
    static public String STRIP = Main.<String>bottom();
    static public String UNKNOWN_ATTRIBUTE = Main.<String>bottom();

    public abstract void pack(java.util.jar.JarInputStream p0, java.io.OutputStream p1) ;

    public abstract void pack(java.util.jar.JarFile p0, java.io.OutputStream p1) ;

    public abstract java.util.SortedMap<String, String> properties() ;
}
}