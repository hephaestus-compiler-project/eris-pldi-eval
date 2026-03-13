package src.wades;


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



abstract class ModuleReference {
  public java.util.@Nullable Optional<java.net.URI> location() {
    try{
      return (switch (78) {
        case 24 -> (java.util.Optional<java.net.URI>) null;
        case 9 -> (java.util.Optional<java.net.URI>) null;
        default -> (java.util.Optional<java.net.URI>) null;
      });
  }
    catch (java.lang.Exception e) { return Main.<java.util.@Nullable Optional<java.net.URI>>bottom(); }}

  public java.lang.module.ModuleDescriptor descriptor() {
    try{
      return (switch (24) {
        case -4 -> Main.<java.lang.module.ModuleDescriptor>bottom();
        case -12 -> Main.<java.lang.module.ModuleDescriptor>bottom();
        case 71 -> Main.<java.lang.module.ModuleDescriptor>bottom();
        case 15 -> Main.<java.lang.module.ModuleDescriptor>bottom();
        default -> Main.<java.lang.module.ModuleDescriptor>bottom();
      });
  }
    catch (java.lang.Exception e) { return Main.<java.lang.module.ModuleDescriptor>bottom(); }}

  public java.lang.module.@Nullable ModuleReader open() {
    try{
      return (Main.<java.util.function.IntFunction<java.lang.module.@Nullable ModuleReader>>bottom()).apply((Main.<java.util.function.DoubleFunction<Integer>>bottom()).apply(35.473));
  }
    catch (java.lang.Exception e) { return Main.<java.lang.module.@Nullable ModuleReader>bottom(); }}
}