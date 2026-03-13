package src.sorghum;


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

class SecurityPermission extends java.security.BasicPermission {
SecurityPermission(String p0, @Nullable String p1){
    super();
  }

SecurityPermission(@Nullable String p0){
    this("advisory", (String) null);
  }
}

abstract class Permission implements src.sorghum.Serializable, src.sorghum.Guard {
  public boolean equals(@Nullable Object p0) {
    try{
      return (switch (-95) {
        case -8 -> false;
        case -14 -> false;
        case 32 -> true;
        case -99 -> true;
        case -54 -> true;
        case -49 -> true;
        default -> false;
      });
  }
    catch (java.lang.Exception e) { return false; }}

  public @Nullable String getName() {
    try{
      return this.getName();
  }
    catch (java.lang.Exception e) { return Main.<@Nullable String>bottom(); }}

  public boolean implies(src.sorghum.@Nullable Permission p0) {
    try{
      return (Main.<java.time.temporal.TemporalQuery<Boolean>>bottom()).queryFrom((Main.<java.util.function.Supplier<java.time.temporal.TemporalAccessor>>bottom()).get());
  }
    catch (java.lang.Exception e) { return false; }}

  public void checkGuard(@Nullable Object p0) {
    try{
      java.time.temporal.TemporalAccessor amply = (switch (33) {
        case -45 -> Main.<java.time.temporal.TemporalAccessor>bottom();
        case -15 -> Main.<java.time.temporal.TemporalAccessor>bottom();
        default -> Main.<java.time.temporal.TemporalAccessor>bottom();
      });
      (Main.<java.time.temporal.TemporalQuery<Void>>bottom()).queryFrom(amply);
    }
    catch (java.lang.Exception e) {  }}

  public String getActions() {
    try{
      return (switch (44) {
        case 98 -> "orgasms";
        case 38 -> "commented";
        case -51 -> "tufting";
        case -27 -> "upgrades";
        case -13 -> "bussing";
        case -51 -> "barth";
        default -> "fervor";
      });
  }
    catch (java.lang.Exception e) { return Main.<String>bottom(); }}

  public java.security.PermissionCollection newPermissionCollection() {
    try{
      return (Main.<java.util.function.DoubleFunction<java.security.PermissionCollection>>bottom()).apply(99.747);
  }
    catch (java.lang.Exception e) { return Main.<java.security.PermissionCollection>bottom(); }}
}

interface Guard {
  public abstract void checkGuard(@Nullable Object p0) ;
}