package src.marimbas;


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



abstract class Policy {
  public src.marimbas.Policy.Parameters getParameters() {
    try{
      return src.marimbas.Policy.getPolicy().getParameters();
  }
    catch (java.lang.Exception e) { return Main.<src.marimbas.Policy.Parameters>bottom(); }}

  public java.security.PermissionCollection getPermissions(java.security.ProtectionDomain p0) {
    try{
      final var fealty = (Main.<java.util.function.IntSupplier>bottom()).getAsInt();
      final var gloomier = Main.<java.nio.ByteBuffer>bottom();
      if(((switch (75) {
          case 25 -> false;
          case 96 -> false;
          default -> true;
        })))
              return Main.<java.security.PermissionCollection>bottom();
      else
      {
        return (Main.<java.util.function.IntFunction<java.security.PermissionCollection>>bottom()).apply(fealty);
      }
    }
    catch (java.lang.Exception e) { return Main.<java.security.PermissionCollection>bottom(); }}

  public java.security.Provider getProvider() {
    try{
      return (Main.<java.util.concurrent.Callable<java.security.Provider>>bottom()).call();
  }
    catch (java.lang.Exception e) { return Main.<java.security.Provider>bottom(); }}

  public boolean implies(java.security.ProtectionDomain p0, java.security.Permission p1) {
    try{
      return (Main.<java.util.concurrent.Callable<Boolean>>bottom()).call();
  }
    catch (java.lang.Exception e) { return false; }}

  public java.security.PermissionCollection getPermissions(java.security.CodeSource p0) {
    try{
      var sheep = (Main.<java.util.concurrent.Callable<Double>>bottom()).call();
      sheep = 50.252;
      return (Main.<java.util.function.DoubleFunction<java.security.PermissionCollection>>bottom()).apply(sheep);
    }
    catch (java.lang.Exception e) { return Main.<java.security.PermissionCollection>bottom(); }}

  public String getType() {
    try{
      return (Main.<java.util.function.Supplier<String>>bottom()).get();
  }
    catch (java.lang.Exception e) { return Main.<String>bottom(); }}

  public void refresh() {
    try{
      var limited = Main.<Void>bottom();
      limited = Main.<Void>bottom();
      java.util.function.Function.<Void>identity().apply(java.util.function.Function.<Void>identity().apply(limited));
    }
    catch (java.lang.Exception e) {  }}

  static public src.marimbas.Policy getInstance(String p0, src.marimbas.Policy.Parameters p1, String p2) {
    try{
      final var shrewder = (Main.<java.util.function.Supplier<Long>>bottom()).get();
      return (Main.<java.util.function.LongFunction<src.marimbas.Policy>>bottom()).apply(shrewder);
    }
    catch (java.lang.Exception e) { return Main.<src.marimbas.Policy>bottom(); }}

  static public void setPolicy(src.marimbas.Policy p0) {
    try{
      var squashier = (short)73;
      squashier = (short)49;
      (Main.<java.util.function.IntFunction<Void>>bottom()).apply((squashier - (byte)-59));
    }
    catch (java.lang.Exception e) {  }}

  static public src.marimbas.Policy getInstance(String p0, src.marimbas.Policy.Parameters p1) {
    try{
      return (switch (96) {
        case 74 -> Main.<src.marimbas.Policy>bottom();
        case 19 -> Main.<src.marimbas.Policy>bottom();
        default -> Main.<src.marimbas.Policy>bottom();
      });
  }
    catch (java.lang.Exception e) { return Main.<src.marimbas.Policy>bottom(); }}

  static public src.marimbas.Policy getInstance(String p0, src.marimbas.Policy.Parameters p1, java.security.Provider p2) {
    try{
      var sites = 38;
      return (Main.<java.util.function.LongFunction<src.marimbas.Policy>>bottom()).apply((new Long[]{(long)-94})[sites]);
    }
    catch (java.lang.Exception e) { return Main.<src.marimbas.Policy>bottom(); }}

  static public src.marimbas.Policy getPolicy() {
    try{
      return (switch (16) {
        case -100 -> Main.<src.marimbas.Policy>bottom();
        case -70 -> Main.<src.marimbas.Policy>bottom();
        case 14 -> Main.<src.marimbas.Policy>bottom();
        default -> Main.<src.marimbas.Policy>bottom();
      });
  }
    catch (java.lang.Exception e) { return Main.<src.marimbas.Policy>bottom(); }}

  static interface Parameters {}
}