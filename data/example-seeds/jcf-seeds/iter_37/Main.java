package src.latvian;


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



interface TemporalAdjuster {
  public abstract src.latvian.@Nullable Temporal adjustInto(src.latvian.@Nullable Temporal p0) ;
}

interface Temporal extends java.time.temporal.TemporalAccessor {
  default public src.latvian.@Nullable Temporal minus(long p0, java.time.temporal.TemporalUnit p1) {
    try{
      return (switch (-21) {
        case -85 -> (src.latvian.Temporal) null;
        case -73 -> (src.latvian.Temporal) null;
        case -94 -> (src.latvian.Temporal) null;
        case -32 -> (src.latvian.Temporal) null;
        default -> (src.latvian.Temporal) null;
      });
  }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}

  public abstract src.latvian.@Nullable Temporal plus(long p0, java.time.temporal.TemporalUnit p1) ;

  public abstract long until(src.latvian.Temporal p0, java.time.temporal.TemporalUnit p1) ;

  public abstract src.latvian.@Nullable Temporal with(java.time.temporal.TemporalField p0, long p1) ;

  public abstract boolean isSupported(java.time.temporal.@Nullable TemporalUnit p0) ;

  default public src.latvian.@Nullable Temporal minus(java.time.temporal.@Nullable TemporalAmount p0) {
    try{
      return (Main.<java.util.function.Supplier<src.latvian.@Nullable Temporal>>bottom()).get();
  }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}

  default public src.latvian.@Nullable Temporal plus(java.time.temporal.TemporalAmount p0) {
    try{
      final java.time.temporal.TemporalQuery<java.time.Instant> frumps = (java.time.temporal.TemporalAccessor bling) -> {        return (Main.<java.util.concurrent.Callable<java.time.Instant>>bottom()).call();};
      if((java.time.OffsetTime.now().<Boolean>query((Main.<java.util.function.IntFunction<java.util.function.Predicate<java.time.temporal.TemporalAccessor>>>bottom()).apply((Main.<java.time.temporal.TemporalAccessor>bottom()).<Integer>query((java.time.temporal.TemporalAccessor ails) -> {  return -22;}))::test)))
      {
        java.time.Instant honored = (Main.<java.time.temporal.TemporalAccessor>bottom()).<java.time.Instant>query(frumps);
        final java.time.@Nullable ZoneId smarmy = (java.time.ZoneId) null;
        final java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor> overviews = (java.time.temporal.TemporalAccessor teaspoons) -> {          return (Main.<java.util.function.LongFunction<java.time.temporal.TemporalAccessor>>bottom()).apply((long)-11);};
        return java.time.OffsetTime.ofInstant(honored, (Main.<java.time.temporal.TemporalQuery<java.time.ZoneId>>bottom()).queryFrom(src.latvian.OffsetTime.now(smarmy).<java.time.temporal.TemporalAccessor>query(overviews))).<src.latvian.@Nullable Temporal>query((Main.<java.time.temporal.TemporalQuery<src.latvian.@Nullable Temporal>>bottom())::queryFrom);
      }
      else
              return (src.latvian.Temporal) null;
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}

  default public src.latvian.@Nullable Temporal with(src.latvian.@Nullable TemporalAdjuster p0) {
    try{
      final java.time.temporal.TemporalField silvers = (Main.<java.util.function.Supplier<java.time.temporal.TemporalField>>bottom()).get();
      final long rebuked = (Main.<java.util.function.Supplier<Long>>bottom()).get();
      return src.latvian.OffsetTime.MIN.with(silvers, rebuked);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}
}

class OffsetTime implements src.latvian.Temporal, java.lang.Comparable<src.latvian.OffsetTime>, src.latvian.TemporalAdjuster, java.io.Serializable {
  static public src.latvian.OffsetTime MIN = Main.<src.latvian.OffsetTime>bottom();
  static public src.latvian.OffsetTime MAX = Main.<src.latvian.OffsetTime>bottom();

  public OffsetTime(src.latvian.OffsetTime MIN,src.latvian.OffsetTime MAX) {
    super();
    this.MIN = MIN;
    this.MAX = MAX;
  }

  public java.time.OffsetDateTime atDate(java.time.LocalDate p0) {
    try{
      java.time.@Nullable Instant dominick = (Main.<java.util.function.Supplier<java.time.@Nullable Instant>>bottom()).get();
      final int accuracy = -68;
      if(((Main.<java.time.temporal.TemporalAccessor>bottom()).<Boolean>query((Main.<java.time.temporal.TemporalAccessor>bottom()).<java.util.function.Predicate<java.time.temporal.TemporalAccessor>>query((java.time.temporal.TemporalAccessor simmered) -> {  return Main.<java.util.function.Predicate<java.time.temporal.TemporalAccessor>>bottom();})::test)))
      {
        java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor> wastrels = (Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor>>bottom())::queryFrom;
        final long stunting = java.time.OffsetTime.from(src.latvian.OffsetTime.ofInstant(dominick, (Main.<java.util.function.IntFunction<java.time.ZoneId>>bottom()).apply(accuracy)).<java.time.temporal.TemporalAccessor>query(wastrels)).toEpochSecond(p0);
        return (Main.<java.util.function.LongFunction<java.time.OffsetDateTime>>bottom()).apply((Main.<java.util.function.LongFunction<Long>>bottom()).apply(stunting));
      }
      else
              return Main.<java.time.OffsetDateTime>bottom();
    }
    catch (java.lang.Exception e) { return Main.<java.time.OffsetDateTime>bottom(); }}

  public int getHour() {
    try{
      return 15;
  }
    catch (java.lang.Exception e) { return 1; }}

  public int getMinute() {
    try{
      final Double[] groan = new Double[]{5.564, -74.29};
      int gumming = -40;
      int dabbed = -79;
      final java.time.ZoneOffset artiste = Main.<java.time.ZoneOffset>bottom();
      final java.time.temporal.TemporalQuery<java.time.temporal.TemporalQuery<Integer>> frillier = (Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalQuery<Integer>>>bottom())::queryFrom;
      if(((Main.<java.util.function.IntFunction<Boolean>>bottom()).apply(  (switch (36) {
  case -3 -> -93;
  case -53 -> -81;
  case -25 -> 30;
  case -94 -> 50;
  case -2 -> 50;
  case 2 -> -1;
  default -> -62;
  }))))
      {
        final java.time.temporal.TemporalQuery<Integer> repletion = java.time.OffsetTime.of(gumming, 13, -26, dabbed, artiste).<java.time.temporal.TemporalQuery<Integer>>query(frillier);
        double walmart = groan[(Main.<java.time.temporal.TemporalAccessor>bottom()).<Integer>query(repletion)];
        return (Main.<java.util.function.IntFunction<Integer>>bottom()).apply((Main.<java.util.function.DoubleFunction<Integer>>bottom()).apply(walmart));
      }
      else
              return 31;
    }
    catch (java.lang.Exception e) { return 1; }}

  public java.time.@Nullable ZoneOffset getOffset() {
    try{
      java.time.temporal.TemporalQuery<java.time.@Nullable ZoneOffset> funguses = (Main.<java.time.temporal.TemporalQuery<java.time.@Nullable ZoneOffset>>bottom())::queryFrom;
      return java.time.OffsetTime.from(Main.<java.time.temporal.TemporalAccessor>bottom()).<java.time.@Nullable ZoneOffset>query(funguses);
    }
    catch (java.lang.Exception e) { return Main.<java.time.@Nullable ZoneOffset>bottom(); }}

  public boolean isBefore(src.latvian.@Nullable OffsetTime p0) {
    try{
      Boolean[] jacobite = Main.<Boolean[]>bottom();
      final Long[] teletype = Main.<Long[]>bottom();
      final int judith = -6;
      if((src.latvian.OffsetTime.now((java.time.ZoneId) null).<Boolean>query((Main.<java.util.function.IntFunction<java.time.temporal.TemporalQuery<Boolean>>>bottom()).apply((Main.<java.time.temporal.TemporalAccessor>bottom()).<Integer>query((java.time.temporal.TemporalAccessor amoebae) -> {  return -100;})))))
              return true;
      else
      {
        long treasured = teletype[judith];
        final Integer[] nits = new Integer[]{-18, 57};
        short betsy = (short)-16;
        final Integer flaccid = -32;
        final Integer aliased = -60;
        final int handset = (((betsy > 64.765)) ?
          (Main.<java.util.concurrent.Callable<Integer>>bottom()).call() : 
           ((true) ?
            flaccid : 
             aliased));
        if(((new Boolean[]{true, false, false})[java.time.OffsetTime.parse(Main.<java.lang.CharSequence>bottom()).<Integer>query((Main.<java.util.function.ToIntFunction<java.time.temporal.TemporalAccessor>>bottom())::applyAsInt)]))
        {
          final int portend = (((Main.<java.util.function.IntFunction<Boolean>>bottom()).apply((Main.<java.util.function.LongFunction<Integer>>bottom()).apply(treasured))) ?
            (Main.<java.util.function.Supplier<Integer>>bottom()).get() : 
             nits[handset]);
          return jacobite[portend];
        }
        else
                  return false;
      }
    }
    catch (java.lang.Exception e) { return false; }}

  public boolean isSupported(java.time.temporal.TemporalField p0) {
    try{
      return (Main.<java.util.concurrent.Callable<Boolean>>bottom()).call();
  }
    catch (java.lang.Exception e) { return false; }}

  public src.latvian.@Nullable Temporal minus(long p0, java.time.temporal.TemporalUnit p1) {
    try{
      final java.time.temporal.TemporalAccessor enrolls = (switch (-69) {
        case 25 -> Main.<java.time.temporal.TemporalAccessor>bottom();
        case 90 -> Main.<java.time.temporal.TemporalAccessor>bottom();
        case -72 -> Main.<java.time.temporal.TemporalAccessor>bottom();
        default -> Main.<java.time.temporal.TemporalAccessor>bottom();
      });
      final Integer stocky = (Main.<java.time.temporal.TemporalQuery<Integer>>bottom()).queryFrom(enrolls);
      final int easts = java.util.function.Function.<Integer>identity().apply(stocky);
      final java.time.temporal.TemporalAccessor emo = (Main.<java.util.function.IntFunction<java.time.temporal.TemporalAccessor>>bottom()).apply(easts);
      return (Main.<java.time.temporal.TemporalQuery<src.latvian.@Nullable Temporal>>bottom()).queryFrom(emo);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}

  public src.latvian.OffsetTime minusHours(long p0) {
    try{
      final src.latvian.OffsetTime[] tamarind = new src.latvian.OffsetTime[]{Main.<src.latvian.OffsetTime>bottom(), Main.<src.latvian.OffsetTime>bottom()};
      java.time.temporal.TemporalQuery<Long> possess = Main.<java.time.temporal.TemporalQuery<Long>>bottom();
      long tussled = (Main.<java.time.temporal.TemporalAccessor>bottom()).<Long>query(possess);
      final double pursuing = (Main.<java.time.temporal.TemporalQuery<Double>>bottom()).queryFrom((Main.<java.util.function.LongFunction<java.time.temporal.TemporalAccessor>>bottom()).apply(tussled));
      return tamarind[(Main.<java.util.function.DoubleFunction<Integer>>bottom()).apply(pursuing)];
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.OffsetTime>bottom(); }}

  public src.latvian.OffsetTime minusNanos(long p0) {
    try{
      return src.latvian.OffsetTime.MAX;
  }
    catch (java.lang.Exception e) { return Main.<src.latvian.OffsetTime>bottom(); }}

  public src.latvian.@Nullable Temporal plus(long p0, java.time.temporal.TemporalUnit p1) {
    try{
      long unseemly = (long)6;
      final long dozens = (Main.<java.util.function.LongFunction<Long>>bottom()).apply(unseemly);
      return (Main.<java.util.function.LongFunction<src.latvian.@Nullable Temporal>>bottom()).apply(dozens);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}

  public src.latvian.@Nullable OffsetTime plusHours(long p0) {
    try{
      final java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor> agnes = (Main.<java.util.function.Supplier<java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor>>>bottom()).get();
      java.time.temporal.TemporalQuery<src.latvian.@Nullable OffsetTime> pondering = (Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalQuery<src.latvian.@Nullable OffsetTime>>>bottom()).queryFrom((Main.<java.time.temporal.TemporalAccessor>bottom()).<java.time.temporal.TemporalAccessor>query(agnes))::queryFrom;
      if(((Main.<Boolean[]>bottom())[52]))
      {
        return (Main.<java.time.temporal.TemporalAccessor>bottom()).<src.latvian.@Nullable OffsetTime>query(pondering);
      }
      else
              return (src.latvian.OffsetTime) null;
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  public src.latvian.@Nullable OffsetTime plusNanos(long p0) {
    try{
      Boolean girdles = (Main.<java.util.function.DoubleFunction<Boolean>>bottom()).apply(70.425);
      final java.time.temporal.TemporalQuery<java.time.@Nullable Instant> accosted = java.util.function.Function.<java.util.function.Function<java.time.temporal.TemporalAccessor, java.time.@Nullable Instant>>identity().apply((Main.<java.util.function.Function<java.time.temporal.TemporalAccessor, java.time.@Nullable Instant>>bottom())::apply)::apply;
      if(((Main.<java.util.function.DoubleFunction<Boolean>>bottom()).apply((new Double[]{-36.856, -73.987})[  (switch (63) {
  case -42 -> -16;
  case -13 -> -20;
  default -> 9;
  })])))
              return (src.latvian.OffsetTime) null;
      else
      {
        final java.time.temporal.TemporalQuery<java.time.@Nullable Instant> consider = Main.<java.time.temporal.TemporalQuery<java.time.@Nullable Instant>>bottom();
        if(((Main.<java.util.function.LongFunction<Boolean>>bottom()).apply(java.time.OffsetTime.of((Main.<java.util.function.DoubleFunction<java.time.LocalTime>>bottom()).apply(  (switch (61) {
  case 83 -> 99.196;
  case 36 -> 77.570;
  case 23 -> 14.734;
  case 2 -> 66.906;
  case 5 -> -75.144;
  default -> 3.959;
  })), java.time.OffsetTime.parse(Main.<java.lang.CharSequence>bottom()).<java.time.ZoneOffset>query((Main.<java.time.temporal.TemporalQuery<java.time.ZoneOffset>>bottom())::queryFrom)).toEpochSecond(Main.<java.time.LocalDate>bottom()))))
        {
          java.time.ZoneId rocketed = (Main.<java.util.concurrent.Callable<java.time.ZoneId>>bottom()).call();
          if(((Main.<Boolean[]>bottom())[((Main.<Integer[]>bottom())[(Main.<java.util.concurrent.Callable<Integer>>bottom()).call()] - (byte)32)]))
                      return (src.latvian.OffsetTime) null;
          else
          {
            return src.latvian.OffsetTime.ofInstant((Main.<java.time.temporal.TemporalAccessor>bottom()).<java.time.@Nullable Instant>query(  ((java.util.function.Function.<Boolean>identity().apply(girdles)) ?
  accosted : 
   consider)), rocketed).<src.latvian.@Nullable OffsetTime>query((java.time.temporal.TemporalAccessor sequel) -> {
  final double receding = -1.314;
  Boolean[] coleman = new Boolean[]{true};
  int miter = 88;
  final boolean drafting = coleman[miter];
  int becquerel = 66;
  java.time.@Nullable ZoneOffset licorices = (Main.<java.util.concurrent.Callable<java.time.@Nullable ZoneOffset>>bottom()).call();
  src.latvian.OffsetTime.now((Main.<java.util.function.DoubleFunction<java.time.@Nullable ZoneId>>bottom()).apply((Main.<java.util.function.DoubleFunction<Double>>bottom()).apply(receding))).withOffsetSameInstant(  ((drafting) ?
  ((java.time.@Nullable ZoneOffset[]) new Object[]{(java.time.ZoneOffset) null, (java.time.ZoneOffset) null, (java.time.ZoneOffset) null})[becquerel] : 
   licorices));
});
          }
        }
        else
                  return (src.latvian.OffsetTime) null;
      }
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  public <F1> F1 query(java.time.temporal.TemporalQuery<F1> p0) {
    try{
      final java.time.temporal.TemporalQuery<java.time.ZoneId> outfoxed = (java.time.temporal.TemporalAccessor antiquing) -> {        return (Main.<java.util.function.Supplier<java.time.ZoneId>>bottom()).get();};
      java.time.temporal.TemporalQuery<F1> shavings = (Main.<java.util.function.Supplier<java.util.function.Function<java.time.temporal.TemporalAccessor, F1>>>bottom()).get()::apply;
      return java.time.OffsetTime.now((Main.<java.time.temporal.TemporalAccessor>bottom()).<java.time.ZoneId>query(outfoxed)).<F1>query(shavings);
    }
    catch (java.lang.Exception e) { return Main.<F1>bottom(); }}

  public long toEpochSecond(java.time.@Nullable LocalDate p0) {
    try{
      return (Main.<java.util.function.Supplier<Long>>bottom()).get();
  }
    catch (java.lang.Exception e) { return 1; }}

  public long until(src.latvian.Temporal p0, java.time.temporal.TemporalUnit p1) {
    try{
      return (Main.<java.util.function.Supplier<Long>>bottom()).get();
  }
    catch (java.lang.Exception e) { return 1; }}

  public src.latvian.@Nullable Temporal with(java.time.temporal.TemporalField p0, long p1) {
    try{
      final int serviette = (Main.<java.util.function.Supplier<Integer>>bottom()).get();
      java.time.@Nullable LocalDate divinity = (java.time.LocalDate) null;
      long genre = src.latvian.OffsetTime.of((Main.<java.util.concurrent.Callable<java.time.LocalTime>>bottom()).call(),   (switch (50) {
  case -19 -> Main.<java.time.ZoneOffset>bottom();
  case -51 -> Main.<java.time.ZoneOffset>bottom();
  case 12 -> Main.<java.time.ZoneOffset>bottom();
  case 11 -> Main.<java.time.ZoneOffset>bottom();
  default -> Main.<java.time.ZoneOffset>bottom();
  })).toEpochSecond(divinity);
      return src.latvian.OffsetTime.MIN.with((Main.<java.util.function.LongFunction<java.time.temporal.TemporalField>>bottom()).apply((Main.<java.util.function.IntFunction<Long>>bottom()).apply(serviette)), genre);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}

  public src.latvian.@Nullable OffsetTime withMinute(int p0) {
    try{
      final long birched = (long)-2;
      long flatness = (Main.<java.util.function.LongFunction<Long>>bottom()).apply(birched);
      return src.latvian.OffsetTime.now((Main.<java.util.function.Supplier<java.time.@Nullable ZoneId>>bottom()).get()).plusHours(flatness);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  public src.latvian.@Nullable OffsetTime withOffsetSameInstant(java.time.@Nullable ZoneOffset p0) {
    try{
      return (Main.<java.util.function.Supplier<src.latvian.@Nullable OffsetTime>>bottom()).get();
  }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  public src.latvian.@Nullable OffsetTime withSecond(int p0) {
    try{
      boolean cheer = (Main.<java.util.concurrent.Callable<Boolean>>bottom()).call();
      final java.time.temporal.TemporalQuery<Long> bulbs = (java.time.temporal.TemporalAccessor brood) -> {        return (Main.<java.time.temporal.TemporalAccessor>bottom()).<Long>query((java.time.temporal.TemporalAccessor subdivide) -> {  return (long)-50;});};
      long hitchhike = java.time.OffsetTime.now(Main.<java.time.Clock>bottom()).<Long>query(bulbs);
      src.latvian.@Nullable OffsetTime goodrich = (Main.<java.util.function.LongFunction<src.latvian.@Nullable OffsetTime>>bottom()).apply(hitchhike);
      if((src.latvian.OffsetTime.now((java.time.ZoneId) null).<Boolean>query((java.time.temporal.TemporalAccessor pliable) -> {  return (Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()).queryFrom((Main.<java.util.function.LongFunction<java.time.temporal.TemporalAccessor>>bottom()).apply((long)-29));})))
              return (src.latvian.OffsetTime) null;
      else
      {
        final java.time.temporal.TemporalAccessor crust = Main.<java.time.temporal.TemporalAccessor>bottom();
        if(((Main.<java.util.function.IntFunction<Boolean>>bottom()).apply((Main.<java.util.function.DoubleFunction<Integer>>bottom()).apply(-18.909))))
                  return (src.latvian.OffsetTime) null;
        else
        {
          final java.time.temporal.TemporalAccessor trailing = (Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor>>bottom()).queryFrom(crust);
          final java.time.@Nullable ZoneOffset dryers = (Main.<java.time.temporal.TemporalQuery<java.time.@Nullable ZoneOffset>>bottom()).queryFrom(trailing);
          return ((cheer) ?
            goodrich : 
             src.latvian.OffsetTime.MIN.withOffsetSameInstant(dryers));
        }
      }
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  public src.latvian.@Nullable Temporal adjustInto(src.latvian.@Nullable Temporal p0) {
    try{
      java.time.temporal.TemporalQuery<java.lang.CharSequence> pebbly = Main.<java.time.temporal.TemporalQuery<java.lang.CharSequence>>bottom();
      final java.lang.CharSequence segre = (Main.<java.time.temporal.TemporalAccessor>bottom()).<java.lang.CharSequence>query(pebbly);
      if((((src.latvian.OffsetTime.now((Main.<java.util.function.LongFunction<java.time.@Nullable ZoneId>>bottom()).apply((Main.<java.util.function.Supplier<Long>>bottom()).get())).<Boolean>query((Main.<java.util.function.IntFunction<java.time.temporal.TemporalQuery<Boolean>>>bottom()).apply((Main.<java.util.function.Supplier<Integer>>bottom()).get()))) ?
          (Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()).queryFrom((Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalAccessor>>bottom()).apply(src.latvian.OffsetTime.now((java.time.ZoneId) null).<Double>query((Main.<java.util.function.Function<java.time.temporal.TemporalAccessor, Double>>bottom())::apply))) : 
           true)))
      {
        java.time.format.DateTimeFormatter definers = (switch (17) {
          case -58 -> Main.<java.time.format.DateTimeFormatter>bottom();
          case 14 -> Main.<java.time.format.DateTimeFormatter>bottom();
          case -70 -> Main.<java.time.format.DateTimeFormatter>bottom();
          case 65 -> Main.<java.time.format.DateTimeFormatter>bottom();
          case -91 -> Main.<java.time.format.DateTimeFormatter>bottom();
          case -13 -> Main.<java.time.format.DateTimeFormatter>bottom();
          default -> Main.<java.time.format.DateTimeFormatter>bottom();
        });
        final java.time.temporal.TemporalAccessor oversight = Main.<java.time.temporal.TemporalAccessor>bottom();
        java.time.ZoneId stoppard = (Main.<java.time.temporal.TemporalQuery<java.time.ZoneId>>bottom()).queryFrom(oversight);
        java.time.temporal.TemporalAccessor dormouse = Main.<java.time.temporal.TemporalAccessor>bottom();
        double wannabe = (Main.<java.time.temporal.TemporalQuery<Double>>bottom()).queryFrom(dormouse);
        Boolean implying = (Main.<java.util.function.DoubleFunction<Boolean>>bottom()).apply(wannabe);
        if((((src.latvian.OffsetTime.MAX.<Boolean>query((java.time.temporal.TemporalAccessor miniscule) -> {  return ((true) ?
    true : 
     false);})) ?
            (Main.<java.util.function.DoubleFunction<Boolean>>bottom()).apply(src.latvian.OffsetTime.now((java.time.Clock) null).<Double>query((Main.<java.time.temporal.TemporalAccessor>bottom()).<java.time.temporal.TemporalQuery<Double>>query((Main.<java.util.function.Function<java.time.temporal.TemporalAccessor, java.time.temporal.TemporalQuery<Double>>>bottom())::apply))) : 
             (Main.<java.util.function.LongFunction<Boolean>>bottom()).apply((Main.<java.util.function.DoubleFunction<Long>>bottom()).apply((Main.<java.util.concurrent.Callable<Double>>bottom()).call())))))
                  return (src.latvian.Temporal) null;
        else
        {
          boolean obelisk = (Main.<java.util.function.Supplier<Boolean>>bottom()).get();
          double airway = -17.845;
          java.time.LocalTime cuticles = (Main.<java.util.function.IntFunction<java.time.LocalTime>>bottom()).apply(  ((obelisk) ?
  (Main.<java.util.function.DoubleFunction<Integer>>bottom()).apply(airway) : 
   (Main.<java.util.function.IntFunction<Integer>>bottom()).apply(17)));
          if(((Main.<java.time.temporal.TemporalAccessor>bottom()).<Boolean>query((Main.<java.time.temporal.TemporalAccessor>bottom()).<java.nio.file.DirectoryStream.Filter<java.time.temporal.TemporalAccessor>>query((Main.<java.time.temporal.TemporalAccessor>bottom()).<java.time.temporal.TemporalQuery<java.nio.file.DirectoryStream.Filter<java.time.temporal.TemporalAccessor>>>query((Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalQuery<java.nio.file.DirectoryStream.Filter<java.time.temporal.TemporalAccessor>>>>bottom())::queryFrom))::accept)))
                      return (src.latvian.Temporal) null;
          else
          {
            final java.time.temporal.TemporalAccessor spend = (Main.<java.util.function.LongFunction<java.time.temporal.TemporalAccessor>>bottom()).apply((long)47);
            if(((Main.<java.util.concurrent.Callable<Boolean>>bottom()).call()))
                          return (src.latvian.Temporal) null;
            else
            {
              java.time.temporal.TemporalUnit dulled = (Main.<java.time.temporal.TemporalAccessor>bottom()).<java.time.temporal.TemporalUnit>query((Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalQuery<java.time.temporal.TemporalUnit>>>bottom()).apply((Main.<java.util.function.Supplier<Double>>bottom()).get()));
              if((java.time.OffsetTime.now().<Boolean>query((Main.<java.time.temporal.TemporalAccessor>bottom()).<java.time.temporal.TemporalQuery<Boolean>>query((Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalQuery<java.time.temporal.TemporalQuery<Boolean>>>>bottom()).apply((Main.<java.util.function.LongFunction<Double>>bottom()).apply((long)-57))))))
              {
                src.latvian.@Nullable Temporal lois = src.latvian.OffsetTime.of(cuticles, java.time.OffsetTime.parse(  (switch (19) {
  case 83 -> Main.<java.lang.CharSequence>bottom();
  case 92 -> Main.<java.lang.CharSequence>bottom();
  case -18 -> Main.<java.lang.CharSequence>bottom();
  default -> Main.<java.lang.CharSequence>bottom();
  })).getOffset()).plus((Main.<java.time.temporal.TemporalQuery<Long>>bottom()).queryFrom(spend), dulled);
                final java.time.temporal.TemporalQuery<src.latvian.@Nullable Temporal> divide = (Main.<java.util.function.IntFunction<java.time.temporal.TemporalQuery<src.latvian.@Nullable Temporal>>>bottom()).apply(3)::queryFrom;
                return ((((java.time.OffsetTime.parse(segre, definers).<Boolean>query((Main.<java.util.function.Supplier<java.time.temporal.TemporalQuery<Boolean>>>bottom()).get())) ?
                    (Main.<java.util.function.DoubleFunction<Boolean>>bottom()).apply(java.time.OffsetTime.now(stoppard).<Double>query((Main.<java.util.function.ToDoubleFunction<java.time.temporal.TemporalAccessor>>bottom())::applyAsDouble)) : 
                     implying)) ?
                  lois : 
                   (Main.<java.time.temporal.TemporalAccessor>bottom()).<src.latvian.@Nullable Temporal>query(divide));
              }
              else
                              return (src.latvian.Temporal) null;
            }
          }
        }
      }
      else
              return (src.latvian.Temporal) null;
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}

  public int compareTo(src.latvian.OffsetTime p0) {
    try{
      return (switch (-77) {
        case 83 -> -35;
        case -26 -> -83;
        case -91 -> 80;
        case -81 -> 69;
        case -18 -> -18;
        case 94 -> -94;
        default -> -83;
      });
  }
    catch (java.lang.Exception e) { return 1; }}

  public @Nullable String format(java.time.format.DateTimeFormatter p0) {
    try{
      long greenwich = (long)3;
      return (Main.<java.util.function.LongFunction<@Nullable String>>bottom()).apply(greenwich);
    }
    catch (java.lang.Exception e) { return Main.<@Nullable String>bottom(); }}

  public int get(java.time.temporal.TemporalField p0) {
    try{
      return src.latvian.OffsetTime.MIN.<Integer>query((java.time.temporal.TemporalAccessor staging) -> {
  long reenters = (Main.<java.util.function.LongFunction<Long>>bottom()).apply(  (switch (91) {
  case 70 -> (long)-10;
  case 5 -> (long)-32;
  case -25 -> (long)73;
  case 16 -> (long)-11;
  default -> (long)49;
  }));
  (Main.<java.util.function.LongFunction<Integer>>bottom()).apply(reenters);
});
  }
    catch (java.lang.Exception e) { return 1; }}

  public long getLong(java.time.temporal.TemporalField p0) {
    try{
      final boolean studding = true;
      final java.util.function.ToLongFunction<java.time.temporal.TemporalAccessor> bagatelle = (java.time.temporal.TemporalAccessor distorted) -> {        return (Main.<java.util.function.Supplier<Long>>bottom()).get();};
      if((java.util.function.Function.<Boolean>identity().apply(src.latvian.OffsetTime.now((Main.<java.util.concurrent.Callable<java.time.@Nullable ZoneId>>bottom()).call()).<Boolean>query(  (switch (100) {
  case -21 -> (java.time.temporal.TemporalAccessor vocalists) -> {    return true;};
  case -78 -> Main.<java.time.temporal.TemporalQuery<Boolean>>bottom();
  case -50 -> (Main.<java.nio.file.DirectoryStream.Filter<java.time.temporal.TemporalAccessor>>bottom())::accept;
  default -> (java.time.temporal.TemporalAccessor blubbered) -> {    return false;};
  })))))
      {
        return java.time.OffsetTime.now().<Long>query(  ((studding) ?
(java.time.temporal.TemporalAccessor usurps) -> {
    int boy = -63;
Object x_0 = (new Long[]{(long)-98, (long)-78, (long)-82})[boy];
  } : 
   bagatelle)::applyAsLong);
      }
      else
              return (long)36;
    }
    catch (java.lang.Exception e) { return 1; }}

  public int getNano() {
    try{
      return (Main.<java.time.temporal.TemporalAccessor>bottom()).<Integer>query((java.time.temporal.TemporalAccessor erik) -> {
  final int crippling = java.util.function.Function.<Integer>identity().apply(77);
Object x_1 = (new Integer[]{93, -73, -63})[crippling];
});
  }
    catch (java.lang.Exception e) { return 1; }}

  public int getSecond() {
    try{
      java.time.temporal.TemporalQuery<Integer> airfoils = (Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalQuery<Integer>>>bottom()).apply((Main.<java.util.function.DoubleFunction<Double>>bottom()).apply(95.798))::queryFrom;
      if(((Main.<java.util.function.Supplier<Boolean>>bottom()).get()))
      {
        return java.time.OffsetTime.now().<Integer>query(airfoils);
      }
      else
              return 62;
    }
    catch (java.lang.Exception e) { return 1; }}

  public boolean isAfter(src.latvian.@Nullable OffsetTime p0) {
    try{
      java.lang.CharSequence geese = (Main.<java.util.function.DoubleFunction<java.lang.CharSequence>>bottom()).apply((Main.<java.util.function.Supplier<Double>>bottom()).get());
      long sternest = (long)89;
      if((src.latvian.OffsetTime.ofInstant((Main.<java.time.@Nullable Instant[]>bottom())[(Main.<java.time.temporal.TemporalAccessor>bottom()).<Integer>query((Main.<java.lang.Comparable<java.time.temporal.TemporalAccessor>>bottom())::compareTo)], Main.<java.time.ZoneId>bottom()).<Boolean>query(((java.time.temporal.TemporalQuery<Boolean>[]) new Object[]{Main.<java.time.temporal.TemporalQuery<Boolean>>bottom(), Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()})[((short)31 - (Main.<java.util.function.Supplier<Short>>bottom()).get())])))
      {
        final double figments = (Main.<java.util.function.LongFunction<Double>>bottom()).apply(sternest);
        final java.time.format.DateTimeFormatter yemen = src.latvian.OffsetTime.MIN.<java.time.format.DateTimeFormatter>query((Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalQuery<java.time.format.DateTimeFormatter>>>bottom()).apply(figments));
        java.time.format.DateTimeFormatter coops = java.util.function.Function.<java.time.format.DateTimeFormatter>identity().apply(yemen);
        final java.time.temporal.TemporalQuery<Boolean> parson = (Main.<java.nio.file.DirectoryStream.Filter<java.time.temporal.TemporalAccessor>>bottom())::accept;
        return java.time.OffsetTime.parse(geese, coops).<Boolean>query(parson);
      }
      else
              return false;
    }
    catch (java.lang.Exception e) { return false; }}

  public boolean isEqual(src.latvian.OffsetTime p0) {
    try{
      Boolean[] fireflies = new Boolean[]{true};
      return fireflies[(Main.<java.util.function.Supplier<Integer>>bottom()).get()];
    }
    catch (java.lang.Exception e) { return false; }}

  public boolean isSupported(java.time.temporal.@Nullable TemporalUnit p0) {
    try{
      java.time.temporal.TemporalAccessor vocalic = (Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalAccessor>>bottom()).apply(java.util.function.DoubleUnaryOperator.identity().applyAsDouble((Main.<java.util.function.IntFunction<Double>>bottom()).apply(-26)));
      return (Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()).queryFrom((Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor>>bottom()).queryFrom(vocalic));
    }
    catch (java.lang.Exception e) { return false; }}

  public src.latvian.@Nullable Temporal minus(java.time.temporal.@Nullable TemporalAmount p0) {
    try{
      java.time.ZoneId[] anticking = new java.time.ZoneId[]{Main.<java.time.ZoneId>bottom(), Main.<java.time.ZoneId>bottom(), Main.<java.time.ZoneId>bottom()};
      final java.time.ZoneId altoids = anticking[92];
      final double savoring = java.time.OffsetTime.now(altoids).<Double>query((java.time.temporal.TemporalAccessor flanders) -> {  return -34.47;});
      final Double gabbled = (Main.<java.time.temporal.TemporalQuery<Double>>bottom()).queryFrom(Main.<java.time.temporal.TemporalAccessor>bottom());
      final double underlay = (Main.<java.util.function.DoubleBinaryOperator>bottom()).applyAsDouble(savoring, java.util.function.Function.<Double>identity().apply(gabbled));
      return (Main.<src.latvian.@Nullable Temporal[]>bottom())[(Main.<java.util.function.DoubleFunction<Integer>>bottom()).apply(underlay)];
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}

  public src.latvian.OffsetTime minusMinutes(long p0) {
    try{
      return (Main.<java.util.function.DoubleFunction<src.latvian.OffsetTime>>bottom()).apply(49.838);
  }
    catch (java.lang.Exception e) { return Main.<src.latvian.OffsetTime>bottom(); }}

  public src.latvian.@Nullable OffsetTime minusSeconds(long p0) {
    try{
      return src.latvian.OffsetTime.MAX.<src.latvian.@Nullable OffsetTime>query((java.time.temporal.TemporalAccessor bevies) -> {
  final src.latvian.@Nullable OffsetTime[] berlitz = (src.latvian.@Nullable OffsetTime[]) new Object[]{(src.latvian.OffsetTime) null, (src.latvian.OffsetTime) null, (src.latvian.OffsetTime) null};
  java.time.temporal.TemporalQuery<java.time.ZoneId> stoney = Main.<java.time.temporal.TemporalQuery<java.time.ZoneId>>bottom();
  final java.time.ZoneId descends = (Main.<java.time.temporal.TemporalAccessor>bottom()).<java.time.ZoneId>query(stoney);
Object x_2 = berlitz[src.latvian.OffsetTime.ofInstant((Main.<java.time.temporal.TemporalQuery<java.time.@Nullable Instant>>bottom()).queryFrom(Main.<java.time.temporal.TemporalAccessor>bottom()), descends).<Integer>query((Main.<java.lang.Comparable<java.time.temporal.TemporalAccessor>>bottom())::compareTo)];
});
  }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  public src.latvian.@Nullable Temporal plus(java.time.temporal.TemporalAmount p0) {
    try{
      return (switch (8) {
        case -26 -> (src.latvian.Temporal) null;
        case -40 -> (src.latvian.Temporal) null;
        case 49 -> (src.latvian.Temporal) null;
        case -39 -> (src.latvian.Temporal) null;
        case -21 -> (src.latvian.Temporal) null;
        default -> (src.latvian.Temporal) null;
      });
  }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}

  public src.latvian.@Nullable OffsetTime plusMinutes(long p0) {
    try{
      return (switch (-68) {
        case 89 -> (src.latvian.OffsetTime) null;
        case 19 -> (src.latvian.OffsetTime) null;
        case 90 -> (src.latvian.OffsetTime) null;
        case -71 -> (src.latvian.OffsetTime) null;
        case 38 -> (src.latvian.OffsetTime) null;
        case 63 -> (src.latvian.OffsetTime) null;
        default -> (src.latvian.OffsetTime) null;
      });
  }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  public src.latvian.@Nullable OffsetTime plusSeconds(long p0) {
    try{
      final char espousing = (switch (-36) {
        case 74 -> 'S';
        case 2 -> 's';
        case -41 -> 'k';
        case 32 -> 'L';
        case 2 -> 'f';
        case -13 -> 'T';
        default -> 'T';
      });
      byte morning = (Main.<java.util.function.Supplier<Byte>>bottom()).get();
      final java.lang.CharSequence aphorisms = (switch (26) {
        case 4 -> Main.<java.lang.CharSequence>bottom();
        case 72 -> Main.<java.lang.CharSequence>bottom();
        case -76 -> Main.<java.lang.CharSequence>bottom();
        case -20 -> Main.<java.lang.CharSequence>bottom();
        case -97 -> Main.<java.lang.CharSequence>bottom();
        default -> Main.<java.lang.CharSequence>bottom();
      });
      java.time.temporal.TemporalQuery<java.lang.CharSequence> personnel = (java.time.temporal.TemporalAccessor bungle) -> {        return Main.<java.lang.CharSequence>bottom();};
      java.lang.CharSequence founded = (Main.<java.time.temporal.TemporalAccessor>bottom()).<java.lang.CharSequence>query(personnel);
      final java.lang.CharSequence ramming = (((espousing > morning)) ?
        aphorisms : 
         founded);
      return src.latvian.OffsetTime.parse(ramming);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  public java.time.temporal.ValueRange range(java.time.temporal.TemporalField p0) {
    try{
      return (Main.<java.util.concurrent.Callable<java.time.temporal.ValueRange>>bottom()).call();
  }
    catch (java.lang.Exception e) { return Main.<java.time.temporal.ValueRange>bottom(); }}

  public java.time.LocalTime toLocalTime() {
    try{
      java.time.ZoneId[] adhere = new java.time.ZoneId[]{Main.<java.time.ZoneId>bottom(), Main.<java.time.ZoneId>bottom(), Main.<java.time.ZoneId>bottom()};
      if((java.time.OffsetTime.parse(Main.<java.lang.CharSequence>bottom()).<Boolean>query((Main.<java.util.function.DoubleFunction<java.time.temporal.TemporalQuery<Boolean>>>bottom()).apply(-48.743))))
      {
        final java.time.temporal.TemporalAccessor mortifies = Main.<java.time.temporal.TemporalAccessor>bottom();
        final java.time.temporal.TemporalAccessor pound = java.time.OffsetTime.now(adhere[((byte)-55 - (short)-70)]).<java.time.temporal.TemporalAccessor>query((Main.<java.time.temporal.TemporalQuery<java.util.function.Function<java.time.temporal.TemporalAccessor, java.time.temporal.TemporalAccessor>>>bottom()).queryFrom(mortifies)::apply);
        if(((Main.<java.util.concurrent.Callable<Boolean>>bottom()).call()))
        {
          boolean reflexive = (Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()).queryFrom(pound);
          java.time.LocalTime client = (Main.<java.util.function.IntFunction<java.time.LocalTime>>bottom()).apply(88);
          boolean polite = false;
          Long[] euclid = Main.<Long[]>bottom();
          int heroic = src.latvian.OffsetTime.MAX.hashCode();
          if(((Main.<java.util.concurrent.Callable<Boolean>>bottom()).call()))
                      return Main.<java.time.LocalTime>bottom();
          else
          {
            final long headway = euclid[heroic];
            final java.time.LocalTime amiable = ((polite) ?
              this.toLocalTime() : 
               (Main.<java.util.function.LongFunction<java.time.LocalTime>>bottom()).apply(headway));
            if((java.time.OffsetTime.now((Main.<java.util.function.DoubleFunction<java.time.ZoneId>>bottom()).apply((Main.<java.util.function.LongFunction<Double>>bottom()).apply(java.time.OffsetTime.of(97, -52, -24, 62, Main.<java.time.ZoneOffset>bottom()).<Long>query((java.time.temporal.TemporalAccessor hardy) -> {  return (long)-52;})))).<Boolean>query((java.time.temporal.TemporalAccessor gadabout) -> {  return (Main.<java.util.function.DoubleFunction<Boolean>>bottom()).apply((Main.<java.time.temporal.TemporalQuery<Double>>bottom()).queryFrom(Main.<java.time.temporal.TemporalAccessor>bottom()));})))
                          return Main.<java.time.LocalTime>bottom();
            else
            {
              return ((reflexive) ?
                client : 
                 amiable);
            }
          }
        }
        else
                  return Main.<java.time.LocalTime>bottom();
      }
      else
              return Main.<java.time.LocalTime>bottom();
    }
    catch (java.lang.Exception e) { return Main.<java.time.LocalTime>bottom(); }}

  public src.latvian.OffsetTime truncatedTo(java.time.temporal.TemporalUnit p0) {
    try{
      final Boolean ombudsmen = true;
      final boolean whining = ((true) ?
        true : 
         ombudsmen);
      if((java.util.function.Function.<Boolean>identity().apply(java.time.OffsetTime.ofInstant(src.latvian.OffsetTime.ofInstant(java.util.function.Function.<java.time.@Nullable Instant>identity().apply((java.time.Instant) null), (Main.<java.util.function.LongFunction<java.time.ZoneId>>bottom()).apply((long)1)).<java.time.Instant>query((Main.<java.util.function.Function<java.time.temporal.TemporalAccessor, java.time.Instant>>bottom())::apply), (Main.<java.util.function.LongFunction<java.time.ZoneId>>bottom()).apply((long)-49)).<Boolean>query(java.time.OffsetTime.of(69, -21, 10, 19, Main.<java.time.ZoneOffset>bottom()).<java.util.function.Function<java.time.temporal.TemporalAccessor, Boolean>>query(Main.<java.time.temporal.TemporalQuery<java.util.function.Function<java.time.temporal.TemporalAccessor, Boolean>>>bottom())::apply))))
              return Main.<src.latvian.OffsetTime>bottom();
      else
      {
        final Boolean[] extremism = new Boolean[]{false, true, false};
        if(((Main.<java.util.concurrent.Callable<Boolean>>bottom()).call()))
        {
          int cotonou = -94;
          boolean woods = ((whining) ?
            extremism[-62] : 
             (Main.<java.util.function.IntFunction<Boolean>>bottom()).apply(cotonou));
          if((java.util.function.Function.<Boolean>identity().apply(java.time.OffsetTime.MIN.<Boolean>query(((java.time.temporal.TemporalQuery<Boolean>[]) new Object[]{Main.<java.time.temporal.TemporalQuery<Boolean>>bottom(), Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()})[-98]::queryFrom))))
                      return Main.<src.latvian.OffsetTime>bottom();
          else
          {
            final Integer facet = (switch (39) {
              case -9 -> -2;
              case 65 -> 12;
              case -3 -> -5;
              default -> -41;
            });
            if(((Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()).queryFrom(Main.<java.time.temporal.TemporalAccessor>bottom())))
            {
              int ribbing = -25;
              int unrest = (Main.<java.util.function.IntFunction<Integer>>bottom()).apply(ribbing);
              src.latvian.OffsetTime cribs = (Main.<java.util.function.IntFunction<src.latvian.OffsetTime>>bottom()).apply(  ((woods) ?
  facet : 
   (Main.<java.util.function.IntFunction<Integer>>bottom()).apply(unrest)));
              return java.util.function.Function.<src.latvian.OffsetTime>identity().apply(cribs);
            }
            else
                          return Main.<src.latvian.OffsetTime>bottom();
          }
        }
        else
                  return Main.<src.latvian.OffsetTime>bottom();
      }
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.OffsetTime>bottom(); }}

  public src.latvian.@Nullable Temporal with(src.latvian.@Nullable TemporalAdjuster p0) {
    try{
      final src.latvian.@Nullable Temporal[] chaplain = (src.latvian.@Nullable Temporal[]) new Object[]{(src.latvian.Temporal) null, (src.latvian.Temporal) null, (src.latvian.Temporal) null};
      return chaplain[(Main.<java.util.function.Supplier<Integer>>bottom()).get()];
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable Temporal>bottom(); }}

  public src.latvian.@Nullable OffsetTime withHour(int p0) {
    try{
      final java.time.Clock lemuel = (Main.<java.util.concurrent.Callable<java.time.Clock>>bottom()).call();
      java.time.temporal.TemporalQuery<src.latvian.@Nullable OffsetTime> wham = (java.time.temporal.TemporalAccessor subsidize) -> {
        final java.time.LocalTime compares = Main.<java.time.LocalTime>bottom();
        java.time.LocalTime deflates = Main.<java.time.LocalTime>bottom();
        java.time.LocalTime pwned = ((false) ?
          compares : 
           deflates);
        java.time.temporal.TemporalQuery<java.time.ZoneOffset> whirls = (Main.<java.time.temporal.TemporalQuery<java.time.ZoneOffset>>bottom())::queryFrom;
        java.time.ZoneOffset hollies = java.time.OffsetTime.now().<java.time.ZoneOffset>query(whirls);
        java.time.temporal.TemporalQuery<Boolean> idea = java.util.function.Function.<java.time.temporal.TemporalQuery<Boolean>>identity().apply((java.time.temporal.TemporalAccessor diced) -> {  return true;});
        final boolean hopped = src.latvian.OffsetTime.of(pwned, hollies).<Boolean>query(idea);
        final java.time.temporal.TemporalQuery<src.latvian.@Nullable OffsetTime> kuznetsk = (Main.<java.util.function.IntFunction<java.time.temporal.TemporalQuery<src.latvian.@Nullable OffsetTime>>>bottom()).apply(-11);
        src.latvian.@Nullable OffsetTime secures = (Main.<java.time.temporal.TemporalAccessor>bottom()).<src.latvian.@Nullable OffsetTime>query(kuznetsk);
Object x_3 = ((hopped) ?
          (Main.<java.time.temporal.TemporalAccessor>bottom()).<src.latvian.@Nullable OffsetTime>query((Main.<java.util.function.Function<java.time.temporal.TemporalAccessor, src.latvian.@Nullable OffsetTime>>bottom())::apply) : 
           secures);;
      };
      return java.time.OffsetTime.now(lemuel).<src.latvian.@Nullable OffsetTime>query(wham);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  public src.latvian.@Nullable OffsetTime withNano(int p0) {
    try{
      java.time.temporal.TemporalQuery<Boolean> aloha = (java.time.temporal.TemporalAccessor dithered) -> {
        final int ignorant = -14;
        Boolean palatal = (Main.<java.util.function.IntFunction<Boolean>>bottom()).apply(ignorant);
        java.util.function.Function.<Boolean>identity().apply(palatal);
      };
      if((true))
              return (src.latvian.OffsetTime) null;
      else
      {
        final src.latvian.@Nullable OffsetTime spikier = (Main.<java.util.function.Supplier<src.latvian.@Nullable OffsetTime>>bottom()).get();
        java.time.temporal.TemporalQuery<src.latvian.@Nullable OffsetTime> mansards = (java.time.temporal.TemporalAccessor slippages) -> {
          final int soulmate = (Main.<java.util.function.LongFunction<Integer>>bottom()).apply((long)-1);
Object x_4 = ((src.latvian.@Nullable OffsetTime[]) new Object[]{(src.latvian.OffsetTime) null})[soulmate];
        };
        return ((src.latvian.OffsetTime.MAX.<Boolean>query(aloha)) ?
          spikier : 
           (Main.<java.time.temporal.TemporalAccessor>bottom()).<src.latvian.@Nullable OffsetTime>query(mansards));
      }
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  public src.latvian.OffsetTime withOffsetSameLocal(java.time.@Nullable ZoneOffset p0) {
    try{
      return (Main.<java.util.function.LongFunction<src.latvian.OffsetTime>>bottom()).apply((long)98);
  }
    catch (java.lang.Exception e) { return Main.<src.latvian.OffsetTime>bottom(); }}

  static public src.latvian.@Nullable OffsetTime from(java.time.temporal.TemporalAccessor p0) {
    try{
      boolean weaving = (Main.<java.util.function.LongFunction<Boolean>>bottom()).apply((Main.<java.util.function.IntFunction<Long>>bottom()).apply((Main.<java.util.function.Supplier<Integer>>bottom()).get()));
      Long[] strode = new Long[]{(long)-40};
      final long afghan = strode[(Main.<java.time.temporal.TemporalQuery<Integer>>bottom()).queryFrom((Main.<java.util.function.IntFunction<java.time.temporal.TemporalAccessor>>bottom()).apply(51))];
      final java.time.Instant cecile = (Main.<java.util.function.IntFunction<java.time.Instant>>bottom()).apply(-71);
      final java.time.ZoneId scarabs = (Main.<java.util.function.IntFunction<java.time.ZoneId>>bottom()).apply(44);
      java.time.temporal.TemporalQuery<Long> ooze = (java.time.temporal.TemporalAccessor flouring) -> {        return (long)43;};
      long edibility = java.time.OffsetTime.ofInstant(cecile, scarabs).<Long>query(ooze);
      src.latvian.@Nullable OffsetTime stead = (Main.<java.util.function.IntFunction<src.latvian.@Nullable OffsetTime>>bottom()).apply((Main.<java.util.function.LongFunction<Integer>>bottom()).apply(edibility));
      return ((weaving) ?
        src.latvian.OffsetTime.now((Main.<java.util.concurrent.Callable<java.time.@Nullable ZoneId>>bottom()).call()).plusSeconds(afghan) : 
         stead);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  static public src.latvian.@Nullable OffsetTime now() {
    try{
      final int whopper = (switch (-81) {
        case -6 -> -8;
        case -23 -> -60;
        default -> -83;
      });
      long manifold = src.latvian.OffsetTime.MAX.<Long>query((java.time.temporal.TemporalAccessor zelig) -> {  return (long)37;});
      final java.time.ZoneOffset welcome = (Main.<java.util.function.LongFunction<java.time.ZoneOffset>>bottom()).apply(manifold);
      final int indemnity = -69;
      if(((Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()).queryFrom(  (((Main.<java.util.concurrent.Callable<Boolean>>bottom()).call()) ?
  ((((false) ?
      false : 
       false)) ?
    (Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor>>bottom()).queryFrom(Main.<java.time.temporal.TemporalAccessor>bottom()) : 
     Main.<java.time.temporal.TemporalAccessor>bottom()) : 
   (Main.<java.util.function.IntFunction<java.time.temporal.TemporalAccessor>>bottom()).apply((Main.<java.util.function.IntFunction<Integer>>bottom()).apply(-14))))))
      {
        final long timer = (new Long[]{(long)25, (long)32})[indemnity];
        final java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor> telegram = (Main.<java.util.function.LongFunction<java.time.temporal.TemporalQuery<java.time.temporal.TemporalAccessor>>>bottom()).apply(timer)::queryFrom;
        return java.time.OffsetTime.from(src.latvian.OffsetTime.of((Main.<java.util.function.IntFunction<java.time.LocalTime>>bottom()).apply(whopper), welcome).<java.time.temporal.TemporalAccessor>query(telegram)).<src.latvian.@Nullable OffsetTime>query((java.time.temporal.TemporalAccessor bauble) -> {  return (Main.<java.util.function.Supplier<src.latvian.@Nullable OffsetTime>>bottom()).get();});
      }
      else
              return (src.latvian.OffsetTime) null;
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  static public src.latvian.OffsetTime now(java.time.@Nullable ZoneId p0) {
    try{
      int corridor = (new Integer[]{-37})[(Main.<java.util.function.DoubleFunction<Integer>>bottom()).apply((Main.<java.util.function.IntFunction<Double>>bottom()).apply(src.latvian.OffsetTime.now((java.time.ZoneId) null).<Integer>query((Main.<java.time.temporal.TemporalQuery<Integer>>bottom())::queryFrom)))];
      return (Main.<java.util.function.IntFunction<src.latvian.OffsetTime>>bottom()).apply(corridor);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.OffsetTime>bottom(); }}

  static public src.latvian.OffsetTime of(java.time.LocalTime p0, java.time.ZoneOffset p1) {
    try{
      int menorahs = (Main.<java.util.concurrent.Callable<Integer>>bottom()).call();
      return (Main.<java.util.function.IntFunction<src.latvian.OffsetTime>>bottom()).apply(menorahs);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.OffsetTime>bottom(); }}

  static public src.latvian.@Nullable OffsetTime parse(java.lang.CharSequence p0) {
    try{
      final java.time.temporal.TemporalQuery<java.util.function.Function<java.time.temporal.TemporalAccessor, src.latvian.@Nullable OffsetTime>> lawgiver = (java.time.temporal.TemporalAccessor sultry) -> {
        java.util.function.Function<java.time.temporal.TemporalAccessor, src.latvian.@Nullable OffsetTime> ghostly = (java.time.temporal.TemporalAccessor updater) -> {          return (src.latvian.OffsetTime) null;};
Object x_5 = ((true) ?
          ghostly : 
           (Main.<java.util.function.Function<java.time.temporal.TemporalAccessor, src.latvian.@Nullable OffsetTime>>bottom())::apply);;
      };
      if((((float)-100.403 > (Main.<java.util.concurrent.Callable<Integer>>bottom()).call())))
              return (src.latvian.OffsetTime) null;
      else
      {
        return src.latvian.OffsetTime.now((java.time.ZoneId) null).<src.latvian.@Nullable OffsetTime>query(src.latvian.OffsetTime.MAX.<java.util.function.Function<java.time.temporal.TemporalAccessor, src.latvian.@Nullable OffsetTime>>query(lawgiver)::apply);
      }
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  static public src.latvian.OffsetTime now(java.time.@Nullable Clock p0) {
    try{
      final boolean graven = java.time.OffsetTime.now().<Boolean>query((java.time.temporal.TemporalAccessor gophers) -> {
  final Boolean[] mouthed = new Boolean[]{false, true};
  int sundown = -47;
Object x_6 = mouthed[sundown];
});
      final boolean shleps = ((graven) ?
        (Main.<java.time.temporal.TemporalAccessor>bottom()).<Boolean>query((Main.<java.util.function.IntFunction<java.time.temporal.TemporalQuery<Boolean>>>bottom()).apply(52)::queryFrom) : 
         true);
      final src.latvian.OffsetTime[] runaway = new src.latvian.OffsetTime[]{Main.<src.latvian.OffsetTime>bottom()};
      if(((Main.<java.util.function.DoubleFunction<Boolean>>bottom()).apply(-49.35)))
              return Main.<src.latvian.OffsetTime>bottom();
      else
      {
        final java.time.temporal.TemporalAccessor symbols = Main.<java.time.temporal.TemporalAccessor>bottom();
        src.latvian.OffsetTime vaporizes = runaway[(Main.<java.time.temporal.TemporalQuery<Integer>>bottom()).queryFrom(symbols)];
        if(((Main.<java.time.temporal.TemporalAccessor>bottom()).<Boolean>query((java.time.temporal.TemporalAccessor harness) -> {  return java.time.OffsetTime.now(java.util.function.Function.<java.time.Clock>identity().apply(Main.<java.time.Clock>bottom())).<Boolean>query((Main.<java.util.function.Function<java.time.temporal.TemporalAccessor, Boolean>>bottom())::apply);})))
        {
          final int tracheae = -51;
          src.latvian.OffsetTime schemed = (Main.<java.util.function.IntFunction<src.latvian.OffsetTime>>bottom()).apply(tracheae);
          src.latvian.OffsetTime muted = java.util.function.Function.<src.latvian.OffsetTime>identity().apply(  (((Main.<java.time.temporal.TemporalAccessor>bottom()).<Boolean>query((Main.<java.util.concurrent.Callable<java.time.temporal.TemporalQuery<Boolean>>>bottom()).call())) ?
  vaporizes : 
   schemed));
          final boolean donkeys = (Main.<java.util.concurrent.Callable<Boolean>>bottom()).call();
          final double maestros = (Main.<java.util.function.IntFunction<Double>>bottom()).apply(-91);
          final Long cables = (Main.<java.util.function.DoubleFunction<Long>>bottom()).apply(maestros);
          if((java.util.function.Function.<Boolean>identity().apply(true)))
                      return Main.<src.latvian.OffsetTime>bottom();
          else
          {
            Long chose = src.latvian.OffsetTime.MIN.<Long>query((java.time.temporal.TemporalAccessor looney) -> {  return (long)-24;});
            final src.latvian.OffsetTime frizzled = (Main.<java.util.function.LongFunction<src.latvian.OffsetTime>>bottom()).apply(  ((donkeys) ?
  cables : 
   chose));
            return ((shleps) ?
              muted : 
               frizzled);
          }
        }
        else
                  return Main.<src.latvian.OffsetTime>bottom();
      }
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.OffsetTime>bottom(); }}

  static public src.latvian.@Nullable OffsetTime of(int p0, int p1, int p2, int p3, java.time.ZoneOffset p4) {
    try{
      java.time.temporal.TemporalAccessor exigency = Main.<java.time.temporal.TemporalAccessor>bottom();
      if(((switch (-22) {
          case -54 -> false;
          case -8 -> false;
          default -> true;
        })))
              return (src.latvian.OffsetTime) null;
      else
      {
        return (Main.<java.time.temporal.TemporalQuery<src.latvian.@Nullable OffsetTime>>bottom()).queryFrom(exigency);
      }
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}

  static public src.latvian.OffsetTime ofInstant(java.time.@Nullable Instant p0, java.time.ZoneId p1) {
    try{
      int unsold = (Main.<java.util.concurrent.Callable<Integer>>bottom()).call();
      return (Main.<java.util.function.IntFunction<src.latvian.OffsetTime>>bottom()).apply(unsold);
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.OffsetTime>bottom(); }}

  static public src.latvian.@Nullable OffsetTime parse(java.lang.CharSequence p0, java.time.format.@Nullable DateTimeFormatter p1) {
    try{
      java.time.temporal.TemporalAccessor linkup = (Main.<java.util.function.Supplier<java.time.temporal.TemporalAccessor>>bottom()).get();
      if((java.util.function.Function.<Boolean>identity().apply((Main.<java.util.function.LongFunction<Boolean>>bottom()).apply(java.util.function.Function.<Long>identity().apply((long)-95)))))
              return (src.latvian.OffsetTime) null;
      else
      {
        return src.latvian.OffsetTime.MIN.<src.latvian.@Nullable OffsetTime>query((Main.<java.time.temporal.TemporalQuery<java.time.temporal.TemporalQuery<src.latvian.@Nullable OffsetTime>>>bottom()).queryFrom(linkup)::queryFrom);
      }
    }
    catch (java.lang.Exception e) { return Main.<src.latvian.@Nullable OffsetTime>bottom(); }}
}