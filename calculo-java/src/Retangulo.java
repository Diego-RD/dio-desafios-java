public record Retangulo(double base, double altura) implements Calculo {
  @Override
  public double getArea() {
    return base * altura;
  }
}
