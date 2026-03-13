package src.pharmacy;

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



interface NavigableSet<T1> extends java.util.SortedSet<T1> {
  public abstract java.util.Iterator<T1> descendingIterator() 

  public abstract T1 floor(T1 p0) 

  public abstract src.pharmacy.NavigableSet<T1> headSet(T1 p0, boolean p1) 

  public abstract java.util.Iterator<T1> iterator() 

  public abstract T1 pollFirst() 

  public abstract src.pharmacy.NavigableSet<T1> subSet(T1 p0, boolean p1, T1 p2, boolean p3) 

  public abstract java.util.SortedSet<T1> tailSet(T1 p0) 

  public abstract T1 ceiling(T1 p0) 

  public abstract src.pharmacy.NavigableSet<T1> descendingSet() 

  public abstract java.util.SortedSet<T1> headSet(T1 p0) 

  public abstract T1 higher(T1 p0) 

  public abstract T1 lower(T1 p0) 

  public abstract T1 pollLast() 

  public abstract java.util.SortedSet<T1> subSet(T1 p0, T1 p1) 

  public abstract src.pharmacy.NavigableSet<T1> tailSet(T1 p0, boolean p1) 
}

interface Iterable<T1> {
  public abstract java.util.Iterator<T1> iterator() 

  default public void forEach(java.util.function.Consumer<? super T1> p0) {
    ((java.util.concurrent.Callable<Void>) null).call()
  }

  default public java.util.Spliterator<T1> spliterator() {
    (switch ((java.net.NetPermission) null) {
      case (java.net.NetPermission) null -> (java.util.Spliterator<T1>) null
      case (java.net.NetPermission) null -> (java.util.Spliterator<T1>) null
      case (java.net.NetPermission) null -> (java.util.Spliterator<T1>) null
      case (java.net.NetPermission) null -> (java.util.Spliterator<T1>) null
      default -> (java.util.Spliterator<T1>) null
    })
  }
}