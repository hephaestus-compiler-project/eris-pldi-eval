package src.eighteen;


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



interface CookieStore {
  public abstract java.util.List<java.net.HttpCookie> get(java.net.URI p0) ;

  public abstract java.util.@Nullable List<java.net.@Nullable URI> getURIs() ;

  public abstract boolean removeAll() ;

  public abstract void add(java.net.@Nullable URI p0, java.net.HttpCookie p1) ;

  public abstract java.util.List<java.net.HttpCookie> getCookies() ;

  public abstract boolean remove(java.net.URI p0, java.net.HttpCookie p1) ;
}