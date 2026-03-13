package src.airier;


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



abstract class CallSite {
  public java.lang.invoke.@Nullable MethodHandle getTarget() {
    try{
      return (java.lang.invoke.MethodHandle) null;
  }
    catch (java.lang.Exception e) { return Main.<java.lang.invoke.@Nullable MethodHandle>bottom(); }}

  public java.lang.invoke.MethodType type() {
    try{
      long spaniel = (Main.<java.util.function.Supplier<Long>>bottom()).get();
      return (Main.<java.util.function.LongFunction<java.lang.invoke.MethodType>>bottom()).apply(spaniel);
    }
    catch (java.lang.Exception e) { return Main.<java.lang.invoke.MethodType>bottom(); }}

  public java.lang.invoke.MethodHandle dynamicInvoker() {
    try{
      final long briggs = (Main.<java.util.function.LongFunction<Long>>bottom()).apply((Main.<java.util.function.Supplier<Long>>bottom()).get());
      if(((Main.<java.util.function.Supplier<Boolean>>bottom()).get()))
              return Main.<java.lang.invoke.MethodHandle>bottom();
      else
      {
        return (Main.<java.util.function.LongFunction<java.lang.invoke.MethodHandle>>bottom()).apply(briggs);
      }
    }
    catch (java.lang.Exception e) { return Main.<java.lang.invoke.MethodHandle>bottom(); }}

  public void setTarget(java.lang.invoke.@Nullable MethodHandle p0) {
    try{
      (Main.<java.util.concurrent.Callable<Void>>bottom()).call();
  }
    catch (java.lang.Exception e) {  }}
}