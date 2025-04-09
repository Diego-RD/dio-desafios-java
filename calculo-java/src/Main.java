import java.util.Scanner;

public class Main {
   private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    int opcao = 0;
    while(opcao != 4){
      System.out.println("Escolha a forma Geometrica para calclular a area:");
      System.out.println("1 - Quadrado");
      System.out.println("2 - Retangulo");
      System.out.println("3 - Circulo");
      System.out.println("4 - Sair");
      opcao = scanner.nextInt();
      switch (opcao ){
        case 1 -> calculadorQuadrado();

        case 2 -> {
          System.out.println("Insira a base do retangulo: ");
          double base = scanner.nextDouble();
          System.out.println("Insira  a altura do retangulo");
          double altura = scanner.nextDouble();
          var retangulo = new Retangulo(base ,altura);
          System.out.println("A area do retangulo é " + retangulo.getArea());
        }
        case 3 -> {
          System.out.println("Digite o raio do circulo");
          double raio = scanner.nextDouble();
          var circulo = new Circulo(raio);
          System.out.println("O area do circulo é " + circulo.getArea());
        }
        case 4 -> {
          System.out.println("Finalizando programa...");
          break;
        }
        default -> System.out.println("Opção invalida tente novamente entre as opções de 1 a 4");
      }
    }
  }
  private static void calculadorQuadrado(){
    System.out.println("Insira o lado do quadrado: ");
    double lado = scanner.nextDouble();
    var quadrado = new Quadrado(lado);
    System.out.println("A area do quadrado é " + quadrado.getArea());

  }

}