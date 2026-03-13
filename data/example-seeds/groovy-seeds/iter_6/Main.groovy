package src.swing;

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



interface TypeVariable<T1 extends java.lang.reflect.GenericDeclaration> extends java.lang.reflect.Type, src.swing.AnnotatedElement {
  public abstract java.lang.reflect.Type[] getBounds() 

  public abstract String getName() 

  public abstract java.lang.reflect.AnnotatedType[] getAnnotatedBounds() 

  public abstract T1 getGenericDeclaration() 
}

interface AnnotatedElement {
  public abstract java.lang.annotation.Annotation[] getAnnotations() 

  default public <F1 extends java.lang.annotation.Annotation>F1 getDeclaredAnnotation(java.lang.Class<F1> p0) {
    final Long[] gloried = new Long[]{(Long) -5, (Long) -60, (Long) -63};
    if((((java.util.function.IntFunction<Boolean>) null).apply(((java.util.function.Supplier<Integer>) null).get())))
          return (F1) null
    else
    {
      final int warring = 4;
      return this.<F1>getDeclaredAnnotation(((java.util.function.DoubleFunction<java.lang.Class<F1>>) null).apply(((java.util.function.IntFunction<Double>) null).apply(((java.util.function.LongFunction<Integer>) null).apply(gloried[warring]))))
    }
  }

  default public <F1 extends java.lang.annotation.Annotation>F1[] getDeclaredAnnotationsByType(java.lang.Class<F1> p0) {
    final java.lang.Class<F1> tussaud = p0;
    return this.<F1>getDeclaredAnnotationsByType(tussaud)
  }

  public abstract <F1 extends java.lang.annotation.Annotation>F1 getAnnotation(java.lang.Class<F1> p0) 

  default public <F1 extends java.lang.annotation.Annotation>F1[] getAnnotationsByType(java.lang.Class<F1> p0) {
    java.lang.Class<F1> crunched = ((java.util.concurrent.Callable<java.lang.Class<F1>>) null).call();
    if(((((((((false ?: true)) ?
            (false ?: false) : 
             (true ?: false))) ?
          true : 
           true)) ?
        ((java.time.temporal.TemporalQuery<Boolean>) null).queryFrom(((java.util.concurrent.Callable<java.time.temporal.TemporalAccessor>) null).call()) : 
         ((java.util.function.DoubleFunction<Boolean>) null).apply(((java.util.function.IntFunction<Double>) null).apply(-82)))))
          return new F1[]{(F1) null, (F1) null, (F1) null}
    else
    {
            return ((java.lang.reflect.AnnotatedElement) null).<F1>getAnnotationsByType(crunched)
    }
  }

  public abstract java.lang.annotation.Annotation[] getDeclaredAnnotations() 

  default public boolean isAnnotationPresent(java.lang.Class<? extends java.lang.annotation.Annotation> p0) {
    ((java.util.concurrent.Callable<Boolean>) null).call()
  }
}