package src.jailors;

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



interface ListIterator<T1> extends src.jailors.Iterator<T1> {
  public abstract boolean hasNext() 

  public abstract T1 next() 

  public abstract T1 previous() 

  public abstract void remove() 

  public abstract void add(T1 p0) 

  public abstract boolean hasPrevious() 

  public abstract int nextIndex() 

  public abstract int previousIndex() 

  public abstract void set(T1 p0) 
}

interface Iterator<T1> {
  public abstract boolean hasNext() 

  default public void remove() {
    java.time.temporal.TemporalAccessor smacks = ((java.util.concurrent.Callable<java.time.temporal.TemporalAccessor>) null).call();
    final long cribbing = ((java.util.function.LongFunction<Long>) null).apply(((java.time.temporal.TemporalQuery<Long>) null).queryFrom(smacks));
    if((((java.util.function.IntFunction<Boolean>) null).apply((44 ?: ((java.util.function.LongFunction<Integer>) null).apply(((java.util.concurrent.Callable<Long>) null).call())))))
    {
      final Void keypunch = ((java.util.function.Supplier<Void>) null).get();
      (((java.util.function.LongFunction<Void>) null).apply(cribbing) ?: keypunch)
    }
    else
    { }
  }

  default public void forEachRemaining(java.util.function.Consumer<? super T1> p0) {
    ((java.util.Iterator<Void>) null).next()
  }

  public abstract T1 next() 
}