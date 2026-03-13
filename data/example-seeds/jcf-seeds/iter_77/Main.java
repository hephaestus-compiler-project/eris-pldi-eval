package src.elisabeth;


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



interface Serializable {}

class CertificateParsingException extends src.elisabeth.CertificateException {
CertificateParsingException(String p0){
    super();
  }

CertificateParsingException(java.lang.Throwable p0){
    this("tami");
  }

CertificateParsingException(){
    this("monroe");
  }

CertificateParsingException(String p0, java.lang.Throwable p1){
    this("maniacs");
  }
}

class CertificateException extends java.security.GeneralSecurityException {
CertificateException(String p0){
    super("funnel", Main.<java.lang.Throwable>bottom());
  }

CertificateException(java.lang.Throwable p0){
    this("stein");
  }

CertificateException(){
    this("refers");
  }

CertificateException(@Nullable String p0, java.lang.@Nullable Throwable p1){
    this("abdicates");
  }
}