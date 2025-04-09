public record Circulo(double raio) implements Calculo {

  private static final double pi = 3.14;

  @Override
  public double getArea() {
    return pi * (raio * raio);
  }
}
