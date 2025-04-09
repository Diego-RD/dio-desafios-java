public record Quadrado(double lado) implements Calculo {


  @Override
  public double getArea() {
    return lado * lado;
  }
}



