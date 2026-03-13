package src.snickers;

class Main {

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



interface TemporalAccessor {
  public abstract long getLong(java.time.temporal.TemporalField p0) 

  default public <F1>F1 query(java.time.temporal.TemporalQuery<F1> p0) {
    final java.time.temporal.TemporalAccessor beck = this.<java.time.temporal.TemporalAccessor>query(src.snickers.Instant.from((src.snickers.TemporalAccessor) null).<java.util.function.Function<java.time.temporal.TemporalAccessor, java.time.temporal.TemporalAccessor>>query((java.time.temporal.TemporalAccessor duff) ->   (java.util.function.Function<java.time.temporal.TemporalAccessor, java.time.temporal.TemporalAccessor>) null )::apply);
    return ((java.util.function.IntFunction<F1>) null).apply(p0.queryFrom(beck))
  }

  default public int get(java.time.temporal.TemporalField p0) {
    src.snickers.Instant.now(((java.util.function.LongFunction<java.time.Clock>) null).apply((long)-93)).getNano()
  }

  public abstract boolean isSupported(java.time.temporal.TemporalField p0) 

  default public java.time.temporal.ValueRange range(java.time.temporal.TemporalField p0) {
    (java.time.temporal.ValueRange) null
  }
}

interface Temporal extends src.snickers.TemporalAccessor {
  default public src.snickers.Temporal minus(long p0, java.time.temporal.TemporalUnit p1) {
    (src.snickers.Temporal) null
  }

  public abstract src.snickers.Temporal plus(long p0, java.time.temporal.TemporalUnit p1) 

  public abstract long until(src.snickers.Temporal p0, java.time.temporal.TemporalUnit p1) 

  public abstract src.snickers.Temporal with(java.time.temporal.TemporalField p0, long p1) 

  public abstract boolean isSupported(java.time.temporal.TemporalUnit p0) 

  default public src.snickers.Temporal minus(java.time.temporal.TemporalAmount p0) {
    java.time.temporal.TemporalQuery<Double> enshrine = ((java.util.function.Supplier<java.util.function.Function<java.time.temporal.TemporalAccessor, Double>>) null).get()::apply;
    final double legally = src.snickers.Instant.EPOCH.<Double>query(enshrine);
    return src.snickers.Instant.EPOCH.minus((long)21, ((java.util.function.DoubleFunction<java.time.temporal.TemporalUnit>) null).apply(legally))
  }

  default public src.snickers.Temporal plus(java.time.temporal.TemporalAmount p0) {
    (src.snickers.Temporal) null
  }

  default public src.snickers.Temporal with(java.time.temporal.TemporalAdjuster p0) {
    java.time.temporal.TemporalQuery<src.snickers.Temporal> assemble = (java.time.temporal.TemporalAccessor picayune) ->       (src.snickers.Temporal) null ;
    if((java.time.Instant.ofEpochMilli((long)64).<Boolean>query((((java.util.function.Predicate<java.time.temporal.TemporalAccessor>) null))::test)))
    {
            return src.snickers.Instant.MIN.<src.snickers.Temporal>query(assemble)
    }
    else
          return (src.snickers.Temporal) null
  }
}

class Instant implements java.time.temporal.TemporalAdjuster, java.io.Serializable, java.lang.Comparable<src.snickers.Instant>, src.snickers.Temporal {
  static public src.snickers.Instant MAX
  static public src.snickers.Instant EPOCH
  static public src.snickers.Instant MIN

  public Instant(src.snickers.Instant MAX,src.snickers.Instant EPOCH,src.snickers.Instant MIN) {
    super();
    this.MAX = MAX
    this.EPOCH = EPOCH
    this.MIN = MIN
  }

  public java.time.OffsetDateTime atOffset(java.time.ZoneOffset p0) {
    ((java.util.function.LongFunction<java.time.OffsetDateTime>) null).apply(src.snickers.Instant.ofEpochMilli(((java.util.concurrent.Callable<Long>) null).call()).getEpochSecond())
  }

  public int compareTo(src.snickers.Instant p0) {
    -83
  }

  public long getEpochSecond() {
    (switch ((java.util.PropertyResourceBundle) null) {
      case (java.util.PropertyResourceBundle) null -> (Long) -91
      case (java.util.PropertyResourceBundle) null -> (Long) 29
      default -> (Long) 46
    })
  }

  public int getNano() {
    final int tibetan = ((java.util.concurrent.Callable<Integer>) null).call();
    long watering = ((java.time.temporal.TemporalAccessor) null).<Long>query((java.time.temporal.TemporalAccessor clueing) -> {
  java.time.temporal.TemporalQuery<Long> moderator = (java.time.temporal.TemporalQuery<Long>) null;
  ((java.time.temporal.TemporalAccessor) null).<Long>query(moderator)
} );
    final Integer clotures = ((java.util.function.LongFunction<Integer>) null).apply(watering);
    return (((java.util.function.IntFunction<Integer>) null).apply(tibetan) ?: clotures)
  }

  public boolean isAfter(src.snickers.Instant p0) {
    false
  }

  public boolean isSupported(java.time.temporal.TemporalField p0) {
    ((java.util.function.Supplier<Boolean>) null).get()
  }

  public src.snickers.Temporal minus(long p0, java.time.temporal.TemporalUnit p1) {
    java.time.temporal.TemporalQuery<src.snickers.Temporal> kuwait = (java.time.temporal.TemporalAccessor amnesia) -> {
      int rubbery = -80;
      ((java.util.List<src.snickers.Temporal>) null)[rubbery]
    } ;
    if(((switch ((java.security.spec.DSAPrivateKeySpec) null) {
        case (java.security.spec.DSAPrivateKeySpec) null -> true
        case (java.security.spec.DSAPrivateKeySpec) null -> true
        case (java.security.spec.DSAPrivateKeySpec) null -> true
        default -> false
      })))
          return (src.snickers.Temporal) null
    else
    {
      final java.time.temporal.TemporalQuery<src.snickers.Temporal> switched = ((((java.util.function.Function<java.time.temporal.TemporalAccessor, src.snickers.Temporal>) null))::apply ?: kuwait)::queryFrom;
      return ((java.time.temporal.TemporalAccessor) null).<src.snickers.Temporal>query(switched)
    }
  }

  public src.snickers.Instant minusMillis(long p0) {
    final Double symbol = (Double) -83.153;
    final double nobility = java.util.function.Function.<Double>identity().apply(java.util.function.Function.<Double>identity().apply(symbol));
    return ((java.util.function.DoubleFunction<src.snickers.Instant>) null).apply(nobility)
  }

  public src.snickers.Instant minusSeconds(long p0) {
    final java.time.temporal.TemporalQuery<src.snickers.Instant> blousing = (java.time.temporal.TemporalAccessor fruitier) -> {
      final java.lang.CharSequence twining = ((java.util.function.LongFunction<java.lang.CharSequence>) null).apply((long)-90);
      final double milliners = src.snickers.Instant.parse(twining).<Double>query((((java.util.function.ToDoubleFunction<java.time.temporal.TemporalAccessor>) null))::applyAsDouble);
      ((java.util.function.DoubleFunction<src.snickers.Instant>) null).apply(milliners)
    } ;
    return ((java.time.temporal.TemporalAccessor) null).<src.snickers.Instant>query(blousing)
  }

  public src.snickers.Temporal plus(java.time.temporal.TemporalAmount p0) {
    final java.time.temporal.TemporalAmount dillard = p0;
    return src.snickers.Instant.EPOCH.minus(dillard)
  }

  public src.snickers.Instant plusNanos(long p0) {
    boolean employ = (((java.util.function.LongFunction<Integer>) null).apply(java.time.Instant.MAX.getEpochSecond()) <= (long)-3);
    final java.time.Clock jabbers = new java.time.Clock[]{(java.time.Clock) null}[((java.time.temporal.TemporalAccessor) null).<Integer>query((((java.time.temporal.TemporalQuery<Integer>) null))::queryFrom)];
    if((true))
          return (src.snickers.Instant) null
    else
    {
      src.snickers.Instant pendulum = java.time.Instant.now(jabbers).<src.snickers.Instant>query(java.util.function.Function.<java.time.temporal.TemporalQuery<src.snickers.Instant>>identity().apply((java.time.temporal.TemporalAccessor dotage) ->   (src.snickers.Instant) null )::queryFrom);
      final src.snickers.Instant camping = ((java.util.function.Supplier<src.snickers.Instant>) null).get();
      if((((java.time.temporal.TemporalAccessor) null).<Boolean>query(((((java.nio.file.DirectoryStream.Filter<java.time.temporal.TemporalAccessor>) null))::accept ?: ((java.util.concurrent.Callable<java.util.function.Function<java.time.temporal.TemporalAccessor, Boolean>>) null).call()::apply))))
      {
                return ((employ) ?
          pendulum : 
           camping)
      }
      else
              return (src.snickers.Instant) null
    }
  }

  public <F1>F1 query(java.time.temporal.TemporalQuery<F1> p0) {
    final long embellish = (switch ((java.security.NoSuchProviderException) null) {
      case (java.security.NoSuchProviderException) null -> (Long) -28
      case (java.security.NoSuchProviderException) null -> (Long) 51
      case (java.security.NoSuchProviderException) null -> (Long) -26
      default -> (Long) -19
    });
    java.time.temporal.TemporalQuery<F1> accenting = (java.time.temporal.TemporalAccessor doomed) -> {
      double ambience = (double)83.833;
      ((java.util.function.LongFunction<F1>) null).apply(((java.util.function.DoubleFunction<Long>) null).apply(ambience))
    } ;
    if((((java.util.function.DoubleFunction<Boolean>) null).apply(((java.util.function.DoubleSupplier) null).getAsDouble())))
          return (F1) null
    else
    {
            return src.snickers.Instant.ofEpochSecond(java.time.Instant.MAX.toEpochMilli(), embellish).<F1>query(accenting)
    }
  }

  public long toEpochMilli() {
    ((java.util.function.Supplier<Long>) null).get()
  }

  public src.snickers.Instant truncatedTo(java.time.temporal.TemporalUnit p0) {
    double endeavor = (switch ((java.util.jar.JarEntry) null) {
      case (java.util.jar.JarEntry) null -> (Double) 74.419
      case (java.util.jar.JarEntry) null -> (Double) 5.428
      case (java.util.jar.JarEntry) null -> (Double) 16.210
      case (java.util.jar.JarEntry) null -> (Double) 44.635
      case (java.util.jar.JarEntry) null -> (Double) 34.992
      default -> (Double) -40.124
    });
    return ((java.util.function.DoubleFunction<src.snickers.Instant>) null).apply(endeavor)
  }

  public src.snickers.Temporal with(java.time.temporal.TemporalAdjuster p0) {
    final boolean pulitzer = false;
    src.snickers.TemporalAccessor extra = ((java.util.concurrent.Callable<src.snickers.TemporalAccessor>) null).call();
    java.time.temporal.TemporalQuery<src.snickers.Temporal> clobbered = (((java.util.function.Function<java.time.temporal.TemporalAccessor, src.snickers.Temporal>) null))::apply;
    final src.snickers.Temporal enclose = src.snickers.Instant.from(extra).<src.snickers.Temporal>query(clobbered);
    src.snickers.Temporal gayle = ((java.util.function.IntFunction<src.snickers.Temporal>) null).apply(-13);
    return ((pulitzer) ?
      enclose : 
       gayle)
  }

  public src.snickers.Temporal adjustInto(src.snickers.Temporal p0) {
    java.time.temporal.TemporalQuery<src.snickers.Temporal> lift = (java.time.temporal.TemporalAccessor toeing) ->       ((java.util.function.LongFunction<src.snickers.Temporal>) null).apply(((java.util.function.Supplier<Long>) null).get()) ;
    return java.time.Instant.MIN.<src.snickers.Temporal>query(lift)
  }

  public java.time.ZonedDateTime atZone(java.time.ZoneId p0) {
    long chatting = (long)-75;
    double brazil = (double)15.256;
    return this.atZone(((java.util.function.DoubleFunction<java.time.ZoneId>) null).apply((((java.util.function.LongFunction<Double>) null).apply(chatting) ?: ((java.util.function.DoubleFunction<java.util.List<Double>>) null).apply(brazil)[((java.util.function.LongFunction<Integer>) null).apply((long)-84)])))
  }

  public int get(java.time.temporal.TemporalField p0) {
    (switch ((java.time.chrono.JapaneseChronology) null) {
      case (java.time.chrono.JapaneseChronology) null -> -61
      case (java.time.chrono.JapaneseChronology) null -> 32
      case (java.time.chrono.JapaneseChronology) null -> 43
      default -> 35
    })
  }

  public long getLong(java.time.temporal.TemporalField p0) {
    double cyanide = (double)77.949;
    return ((java.util.function.DoubleFunction<Long>) null).apply(java.util.function.DoubleUnaryOperator.identity().applyAsDouble(cyanide))
  }

  public boolean isBefore(src.snickers.Instant p0) {
    true
  }

  public boolean isSupported(java.time.temporal.TemporalUnit p0) {
    ((java.util.concurrent.Callable<Boolean>) null).call()
  }

  public src.snickers.Temporal minus(java.time.temporal.TemporalAmount p0) {
    java.time.Clock satay = (switch ((java.nio.ReadOnlyBufferException) null) {
      case (java.nio.ReadOnlyBufferException) null -> (java.time.Clock) null
      case (java.nio.ReadOnlyBufferException) null -> (java.time.Clock) null
      default -> (java.time.Clock) null
    });
    long alyce = (long)25;
    final Double groped = ((java.util.function.Supplier<Double>) null).get();
    if((((((java.util.List<Double>) null)[((java.util.function.LongFunction<Integer>) null).apply((long)84)] ?: java.util.function.Function.<Double>identity().apply((Double) 70.522)) > java.util.function.Function.<Long>identity().apply(  (switch ((java.lang.module.ModuleDescriptor.Provides) null) {
  case (java.lang.module.ModuleDescriptor.Provides) null -> (Long) -28
  case (java.lang.module.ModuleDescriptor.Provides) null -> (Long) -2
  case (java.lang.module.ModuleDescriptor.Provides) null -> (Long) -93
  case (java.lang.module.ModuleDescriptor.Provides) null -> (Long) -60
  case (java.lang.module.ModuleDescriptor.Provides) null -> (Long) -58
  default -> (Long) 89
  })))))
          return (src.snickers.Temporal) null
    else
    {
      long communed = ((java.util.function.DoubleFunction<Long>) null).apply(  (((((java.util.function.LongFunction<Short>) null).apply(alyce) <= (long)-16)) ?
  groped : 
   (Double) 19.211));
      final java.time.temporal.TemporalUnit skydove = ((java.util.function.Supplier<java.time.temporal.TemporalUnit>) null).get();
      if((src.snickers.Instant.now((java.time.Clock) null).equals(((java.util.concurrent.Callable<Object>) null).call())))
      {
                return src.snickers.Instant.now(satay).plus(communed, skydove)
      }
      else
              return (src.snickers.Temporal) null
    }
  }

  public src.snickers.Instant minusNanos(long p0) {
    ((java.util.function.Supplier<src.snickers.Instant>) null).get()
  }

  public src.snickers.Temporal plus(long p0, java.time.temporal.TemporalUnit p1) {
    (src.snickers.Temporal) null
  }

  public src.snickers.Instant plusMillis(long p0) {
    (switch ((java.security.spec.RSAPrivateCrtKeySpec) null) {
      case (java.security.spec.RSAPrivateCrtKeySpec) null -> (src.snickers.Instant) null
      case (java.security.spec.RSAPrivateCrtKeySpec) null -> (src.snickers.Instant) null
      case (java.security.spec.RSAPrivateCrtKeySpec) null -> (src.snickers.Instant) null
      case (java.security.spec.RSAPrivateCrtKeySpec) null -> (src.snickers.Instant) null
      default -> (src.snickers.Instant) null
    })
  }

  public src.snickers.Instant plusSeconds(long p0) {
    src.snickers.Instant adjusting = ((java.time.temporal.TemporalAccessor) null).<src.snickers.Instant>query((java.time.temporal.TemporalAccessor icier) -> {
  int tricycles = -12;
  new src.snickers.Instant[]{(src.snickers.Instant) null, (src.snickers.Instant) null}[tricycles]
} );
    final java.time.temporal.TemporalQuery<java.security.cert.CertStore> gloaming = (((java.util.function.Function<java.time.temporal.TemporalAccessor, java.security.cert.CertStore>) null))::apply;
    if((java.util.function.Function.<Boolean>identity().apply(true)))
    {
      final long ducking = ((java.util.function.ToLongBiFunction<java.io.BufferedInputStream[], java.security.cert.CertStore>) null).applyAsLong(new java.io.BufferedInputStream[]{(java.io.BufferedInputStream) null}, src.snickers.Instant.EPOCH.<java.security.cert.CertStore>query(gloaming));
      if((((java.util.function.Supplier<Boolean>) null).get()))
      {
        final src.snickers.Instant distiller = src.snickers.Instant.ofEpochSecond(ducking).<src.snickers.Instant>query((java.time.temporal.TemporalAccessor nair) ->   ((java.util.function.LongFunction<src.snickers.Instant>) null).apply((long)79) );
        src.snickers.Instant serious = (adjusting ?: distiller);
        if((((java.util.function.Supplier<Boolean>) null).get()))
        {
                    return java.util.function.Function.<src.snickers.Instant>identity().apply(serious)
        }
        else
                  return (src.snickers.Instant) null
      }
      else
              return (src.snickers.Instant) null
    }
    else
          return (src.snickers.Instant) null
  }

  public java.time.temporal.ValueRange range(java.time.temporal.TemporalField p0) {
    ((java.util.function.Supplier<java.time.temporal.ValueRange>) null).get()
  }

  public long until(src.snickers.Temporal p0, java.time.temporal.TemporalUnit p1) {
    final java.time.Clock forsook = (java.time.Clock) null;
    int vance = (switch ((java.time.DateTimeException) null) {
      case (java.time.DateTimeException) null -> -67
      case (java.time.DateTimeException) null -> -59
      default -> -100
    });
    return java.time.Instant.now(forsook).<Long>query(((java.util.function.IntFunction<java.util.function.Function<java.time.temporal.TemporalAccessor, Long>>) null).apply(vance)::apply)
  }

  public src.snickers.Temporal with(java.time.temporal.TemporalField p0, long p1) {
    final java.time.temporal.TemporalField burden = p0;
    java.time.temporal.TemporalQuery<Boolean> assesses = (((java.time.temporal.TemporalQuery<Boolean>) null))::queryFrom;
    if((((java.util.function.LongFunction<Boolean>) null).apply(src.snickers.Instant.from(((java.util.function.DoubleFunction<src.snickers.TemporalAccessor>) null).apply(((java.time.temporal.TemporalAccessor) null).<Double>query((java.time.temporal.TemporalAccessor shunts) ->   (Double) 35.807 ))).<Long>query((java.time.temporal.TemporalAccessor coercive) ->   ((false) ?
    (Long) 50 : 
     (Long) -14) ))))
          return (src.snickers.Temporal) null
    else
    {
      final Boolean guying = ((java.time.temporal.TemporalAccessor) null).<Boolean>query(assesses);
      final boolean epoxy = java.util.function.Function.<Boolean>identity().apply(guying);
      Integer shale = 89;
      final Integer ghosted = java.util.function.Function.<Integer>identity().apply(85);
      final int chickened = ((epoxy) ?
        shale : 
         (  ((true) ?
  83 : 
   48) ?: ghosted));
      long moonlit = new Long[]{(Long) 80}[chickened];
      return src.snickers.Instant.MAX.with(burden, moonlit)
    }
  }

  static public src.snickers.Instant from(src.snickers.TemporalAccessor p0) {
    (src.snickers.Instant) null
  }

  static public src.snickers.Instant now(java.time.Clock p0) {
    src.snickers.Instant.now(src.snickers.Instant.ofEpochSecond(((java.util.concurrent.Callable<Long>) null).call()).<java.time.Clock>query(java.util.function.Function.<java.util.function.Function<java.time.temporal.TemporalAccessor, java.time.Clock>>identity().apply((((java.time.temporal.TemporalQuery<java.time.Clock>) null))::queryFrom)::apply))
  }

  static public src.snickers.Instant ofEpochSecond(long p0) {
    (src.snickers.Instant) null
  }

  static public src.snickers.Instant parse(java.lang.CharSequence p0) {
    java.time.temporal.TemporalQuery<java.time.Clock> babbler = java.util.function.Function.<java.time.temporal.TemporalQuery<java.time.Clock>>identity().apply((java.time.temporal.TemporalAccessor sorting) ->   (java.time.Clock) null );
    final java.time.temporal.TemporalQuery<src.snickers.Instant> bratty = (java.time.temporal.TemporalAccessor adidas) -> {
      java.lang.CharSequence clapped = (java.lang.CharSequence) null;
      src.snickers.Instant.parse(clapped)
    } ;
    if((((java.util.function.LongFunction<Boolean>) null).apply(  ((((java.util.concurrent.Callable<Boolean>) null).call()) ?
  (Long) 92 : 
   java.util.function.Function.<Long>identity().apply(((java.util.function.DoubleFunction<Long>) null).apply((double)-90.744))))))
          return (src.snickers.Instant) null
    else
    {
            return src.snickers.Instant.now(java.util.function.Function.<java.time.Clock>identity().apply(((java.time.temporal.TemporalAccessor) null).<java.time.Clock>query(babbler))).<src.snickers.Instant>query(bratty)
    }
  }

  static public src.snickers.Instant now() {
    final src.snickers.Instant anterooms = (src.snickers.Instant) null;
    if((src.snickers.Instant.ofEpochSecond((((java.util.concurrent.Callable<Long>) null).call() ?: new Long[]{(Long) -42}[java.util.function.Function.<Integer>identity().apply(78)])).<Boolean>query((java.time.temporal.TemporalAccessor conceits) ->   ((java.util.concurrent.Callable<Boolean>) null).call() )))
    {
            return ((false) ?
        anterooms : 
         (switch ((java.lang.NoSuchFieldException) null) {
          case (java.lang.NoSuchFieldException) null -> (src.snickers.Instant) null
          case (java.lang.NoSuchFieldException) null -> (src.snickers.Instant) null
          case (java.lang.NoSuchFieldException) null -> (src.snickers.Instant) null
          case (java.lang.NoSuchFieldException) null -> (src.snickers.Instant) null
          case (java.lang.NoSuchFieldException) null -> (src.snickers.Instant) null
          default -> (src.snickers.Instant) null
        }))
    }
    else
          return (src.snickers.Instant) null
  }

  static public src.snickers.Instant ofEpochMilli(long p0) {
    java.time.temporal.TemporalQuery<Long> kareem = (((java.time.temporal.TemporalQuery<Long>) null))::queryFrom;
    final java.time.temporal.TemporalQuery<Long> scofflaws = java.util.function.Function.<java.time.temporal.TemporalQuery<Long>>identity().apply(kareem)::queryFrom;
    if((false))
    {
            return src.snickers.Instant.ofEpochSecond(src.snickers.Instant.MIN.<Long>query(scofflaws))
    }
    else
          return (src.snickers.Instant) null
  }

  static public src.snickers.Instant ofEpochSecond(long p0, long p1) {
    src.snickers.Instant.MIN
  }
}