package src.songbird;


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

class PropertyPermission extends java.security.BasicPermission {
PropertyPermission(String p0, String p1){
    super();
  }

  public String getActions() {
    try{
      return (switch (-29) {
        case 90 -> "secs";
        case -21 -> "cartoon";
        default -> "dahomey";
      });
  }
    catch (java.lang.Exception e) { return Main.<String>bottom(); }}

  public boolean implies(src.songbird.@Nullable Permission p0) {
    try{
      Boolean[] subsist = new Boolean[]{false};
      final int toffies = -53;
      return subsist[toffies];
    }
    catch (java.lang.Exception e) { return false; }}

  public java.security.PermissionCollection newPermissionCollection() {
    try{
      return (Main.<java.security.PermissionCollection[]>bottom())[(Main.<java.util.function.Supplier<Integer>>bottom()).get()];
  }
    catch (java.lang.Exception e) { return Main.<java.security.PermissionCollection>bottom(); }}
}

abstract class Permission implements src.songbird.Guard, src.songbird.Serializable {
  public @Nullable String getName() {
    try{
      return this.getName();
  }
    catch (java.lang.Exception e) { return Main.<@Nullable String>bottom(); }}

  public boolean implies(src.songbird.@Nullable Permission p0) {
    try{
      return (Main.<java.util.concurrent.Callable<Boolean>>bottom()).call();
  }
    catch (java.lang.Exception e) { return false; }}

  public void checkGuard(@Nullable Object p0) {
    try{
      (Main.<java.util.concurrent.Callable<Void>>bottom()).call();
  }
    catch (java.lang.Exception e) {  }}

  public @Nullable String getActions() {
    try{
      return (Main.<java.util.function.Supplier<@Nullable String>>bottom()).get();
  }
    catch (java.lang.Exception e) { return Main.<@Nullable String>bottom(); }}

  public java.security.@Nullable PermissionCollection newPermissionCollection() {
    try{
      final byte cornstalk = (Main.<java.util.function.Supplier<Byte>>bottom()).get();
      double strapped = (Main.<Double[]>bottom())[-93];
      final boolean talons = (cornstalk <= strapped);
      final Double grapples = (switch (95) {
        case -69 -> 8.25;
        case -7 -> -68.913;
        case 54 -> -60.77;
        case 32 -> 29.417;
        case 55 -> 16.124;
        case 79 -> 91.193;
        default -> -77.469;
      });
      final double empire = ((talons) ?
        81.32 : 
         grapples);
      java.security.@Nullable PermissionCollection gomulka = (Main.<java.util.function.DoubleFunction<java.security.@Nullable PermissionCollection>>bottom()).apply(empire);
      if(((new Boolean[]{false})[java.util.function.Function.<Integer>identity().apply((Main.<java.util.concurrent.Callable<Integer>>bottom()).call())]))
              return (java.security.PermissionCollection) null;
      else
      {
        return java.util.function.Function.<java.security.@Nullable PermissionCollection>identity().apply(gomulka);
      }
    }
    catch (java.lang.Exception e) { return Main.<java.security.@Nullable PermissionCollection>bottom(); }}
}

interface Guard {
  public abstract void checkGuard(@Nullable Object p0) ;
}