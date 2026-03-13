package src.unchanged;


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



interface FileAttributeView extends java.nio.file.attribute.AttributeView {}

interface AclFileAttributeView extends java.nio.file.attribute.FileOwnerAttributeView {
  public abstract String name() ;

  public abstract java.util.@Nullable List<java.nio.file.attribute.@Nullable AclEntry> getAcl() ;

  public abstract void setAcl(java.util.List<java.nio.file.attribute.AclEntry> p0) ;
}