package src.blobbing;


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



class JulianFields {
  static public java.time.temporal.TemporalField MODIFIED_JULIAN_DAY = Main.<java.time.temporal.TemporalField>bottom();
  static public java.time.temporal.@Nullable TemporalField JULIAN_DAY = Main.<java.time.temporal.@Nullable TemporalField>bottom();
  static public java.time.temporal.@Nullable TemporalField RATA_DIE = Main.<java.time.temporal.@Nullable TemporalField>bottom();

  public JulianFields(java.time.temporal.TemporalField MODIFIED_JULIAN_DAY,java.time.temporal.@Nullable TemporalField JULIAN_DAY,java.time.temporal.@Nullable TemporalField RATA_DIE) {
    this.MODIFIED_JULIAN_DAY = MODIFIED_JULIAN_DAY;
    this.JULIAN_DAY = JULIAN_DAY;
    this.RATA_DIE = RATA_DIE;
  }
}