package src.hundreds;


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



class PKIXCertPathBuilderResult extends java.security.cert.PKIXCertPathValidatorResult implements src.hundreds.CertPathBuilderResult {
PKIXCertPathBuilderResult(java.security.cert.CertPath p0, java.security.cert.TrustAnchor p1, java.security.cert.@Nullable PolicyNode p2, java.security.PublicKey p3){
    super(Main.<java.security.cert.TrustAnchor>bottom(), Main.<java.security.cert.PolicyNode>bottom(), Main.<java.security.PublicKey>bottom());
  }

  public java.security.cert.@Nullable CertPath getCertPath() {
    try{
      final double neglig = java.util.function.Function.<Double>identity().apply(44.82);
      return (Main.<java.util.function.DoubleFunction<java.security.cert.@Nullable CertPath>>bottom()).apply(neglig);
    }
    catch (java.lang.Exception e) { return Main.<java.security.cert.@Nullable CertPath>bottom(); }}
}

interface CertPathBuilderResult extends java.lang.Cloneable {
  public abstract java.security.cert.@Nullable CertPath getCertPath() ;

  public abstract @Nullable Object clone() ;
}