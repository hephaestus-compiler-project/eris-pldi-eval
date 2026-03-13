package src.topped;


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



interface Closeable extends src.topped.AutoCloseable {
  public abstract void close() ;
}

class BufferedReader extends java.io.Reader {
BufferedReader(java.io.Reader p0, int p1){
    super();
  }

BufferedReader(java.io.@Nullable Reader p0){
    this(Main.<java.io.Reader>bottom(), 36);
  }

  public void mark(int p0) {
    try{
      (Main.<java.util.concurrent.Callable<Void>>bottom()).call();
  }
    catch (java.lang.Exception e) {  }}

  public int read() {
    try{
      short uncommon = (short)-34;
      final short braggart = (switch (81) {
        case -17 -> (short)62;
        case 29 -> (short)-96;
        case 9 -> (short)2;
        default -> (short)-34;
      });
      return (uncommon - braggart);
    }
    catch (java.lang.Exception e) { return 1; }}

  public @Nullable String readLine() {
    try{
      return this.readLine();
  }
    catch (java.lang.Exception e) { return Main.<@Nullable String>bottom(); }}

  public void reset() {
    try{
      Object x_0 =       (switch (28) {
        case -59 -> Main.<Void>bottom();
        case -56 -> Main.<Void>bottom();
        case 88 -> Main.<Void>bottom();
        case -35 -> Main.<Void>bottom();
        case -66 -> Main.<Void>bottom();
        default -> Main.<Void>bottom();
      });;
  }
    catch (java.lang.Exception e) {  }}

  public java.util.stream.@Nullable Stream<@Nullable String> lines() {
    try{
      return (Main.<java.util.function.LongFunction<java.util.stream.@Nullable Stream<@Nullable String>>>bottom()).apply((Main.<java.util.concurrent.Callable<Long>>bottom()).call());
  }
    catch (java.lang.Exception e) { return Main.<java.util.stream.@Nullable Stream<@Nullable String>>bottom(); }}

  public boolean markSupported() {
    try{
      return (Main.<java.util.function.IntFunction<Boolean>>bottom()).apply((Main.<java.util.concurrent.Callable<Integer>>bottom()).call());
  }
    catch (java.lang.Exception e) { return false; }}

  public int read(char[] p0, int p1, int p2) {
    try{
      return (switch (84) {
        case -80 -> 98;
        case 90 -> -30;
        default -> -18;
      });
  }
    catch (java.lang.Exception e) { return 1; }}

  public boolean ready() {
    try{
      java.time.temporal.TemporalAccessor muggiest = (Main.<java.util.function.LongFunction<java.time.temporal.TemporalAccessor>>bottom()).apply((long)86);
      if(((Main.<java.util.function.LongFunction<Boolean>>bottom()).apply((Main.<Long[]>bottom())[((Main.<java.util.function.IntFunction<Byte>>bottom()).apply(-38) + (Main.<java.util.function.LongFunction<Byte>>bottom()).apply((long)86))])))
      {
        final java.time.temporal.TemporalAccessor reels = (Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor>>bottom()).queryFrom((Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor>>bottom()).queryFrom(muggiest));
        if(((Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()).queryFrom(java.util.function.Function.<java.time.temporal.TemporalAccessor>identity().apply((Main.<java.util.function.Supplier<java.time.temporal.TemporalAccessor>>bottom()).get()))))
                  return false;
        else
        {
          return (Main.<java.util.function.IntFunction<Boolean>>bottom()).apply((Main.<java.time.temporal.TemporalQuery<Integer>>bottom()).queryFrom(reels));
        }
      }
      else
              return true;
    }
    catch (java.lang.Exception e) { return false; }}

  public long skip(long p0) {
    try{
      final Integer arrears = -37;
      if(((Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()).queryFrom((Main.<java.util.function.IntFunction<java.time.temporal.TemporalAccessor>>bottom()).apply(  ((((true) ?
    true : 
     true)) ?
  (Main.<java.util.function.Supplier<Integer>>bottom()).get() : 
   44)))))
              return (long)-93;
      else
      {
        return (Main.<java.util.function.IntToLongFunction>bottom()).applyAsLong(  (((Main.<java.util.concurrent.Callable<Boolean>>bottom()).call()) ?
  (Main.<java.util.function.Supplier<Integer>>bottom()).get() : 
   arrears));
      }
    }
    catch (java.lang.Exception e) { return 1; }}
}

interface AutoCloseable {
  public abstract void close() ;
}