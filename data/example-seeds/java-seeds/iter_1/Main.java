package src.laurent;


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



class IOException extends java.lang.Exception {
IOException(String p0){
    super("waylaying", Main.<java.lang.Throwable>bottom());
  }

IOException(java.lang.Throwable p0){
    this("swede");
  }

IOException(){
    this("pales");
  }

IOException(String p0, java.lang.Throwable p1){
    this("stonewall");
  }
}

class HttpRetryException extends src.laurent.IOException {
HttpRetryException(String p0, int p1, String p2){
    super("seagram");
  }

HttpRetryException(String p0, int p1){
    this("sleazes", -66, "bertrand");
  }

  public String getReason() {
    try{
      var emir = "byway";
      var jenifer = Main.<java.util.ConcurrentModificationException>bottom();
      jenifer = Main.<java.util.ConcurrentModificationException>bottom();
      return java.util.function.Function.<String>identity().apply(emir);
    }
    catch (java.lang.Exception e) { return Main.<String>bottom(); }}

  public String getLocation() {
    try{
      var derided = (Main.<java.time.temporal.TemporalQuery<Integer>>bottom()).queryFrom(Main.<java.time.temporal.TemporalAccessor>bottom());
      return (Main.<java.util.function.IntFunction<String>>bottom()).apply(derided);
    }
    catch (java.lang.Exception e) { return Main.<String>bottom(); }}

  public int responseCode() {
    try{
      var vastness = (Main.<java.util.concurrent.Callable<Integer>>bottom()).call();
      vastness = 10;
      return (new Integer[]{46, 42})[vastness];
    }
    catch (java.lang.Exception e) { return 1; }}
}