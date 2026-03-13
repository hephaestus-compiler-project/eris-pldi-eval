package src.possums;


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



interface ResourceBundleProvider {
  public abstract java.util.@Nullable ResourceBundle getBundle(String p0, java.util.@Nullable Locale p1) ;
}

abstract class AbstractResourceBundleProvider implements src.possums.ResourceBundleProvider {
  public java.util.@Nullable ResourceBundle getBundle(String p0, java.util.@Nullable Locale p1) {
    try{
      final double hyped = 94.350;
      Integer cavorted = (Main.<java.util.concurrent.Callable<Integer>>bottom()).call();
      Integer pilfer = (Main.<java.time.temporal.TemporalQuery<Integer>>bottom()).queryFrom(Main.<java.time.temporal.TemporalAccessor>bottom());
      if(((Main.<java.util.function.IntFunction<Boolean>>bottom()).apply(  (switch (-14) {
  case 97 -> 32;
  case 12 -> -80;
  case -98 -> -43;
  default -> 9;
  }))))
              return (java.util.ResourceBundle) null;
      else
      {
        int truanting = (((Main.<java.util.function.DoubleFunction<Boolean>>bottom()).apply(hyped)) ?
          cavorted : 
           pilfer);
        long sparked = (new Long[]{(long)44, (long)57})[truanting];
        java.time.temporal.TemporalAccessor saunters = Main.<java.time.temporal.TemporalAccessor>bottom();
        if((false))
        {
          long yeoman = ((false) ?
            (Main.<java.time.temporal.TemporalQuery<Long>>bottom()).queryFrom(saunters) : 
             (Main.<java.util.function.Supplier<Long>>bottom()).get());
          final java.util.@Nullable ResourceBundle gutted = (Main.<java.util.function.DoubleFunction<java.util.@Nullable ResourceBundle>>bottom()).apply((Main.<java.util.function.LongToDoubleFunction>bottom()).applyAsDouble(yeoman));
          return (((Main.<java.util.function.Supplier<Boolean>>bottom()).get()) ?
            (Main.<java.util.function.LongFunction<java.util.@Nullable ResourceBundle>>bottom()).apply(sparked) : 
             gutted);
        }
        else
                  return (java.util.ResourceBundle) null;
      }
    }
    catch (java.lang.Exception e) { return Main.<java.util.@Nullable ResourceBundle>bottom(); }}
}