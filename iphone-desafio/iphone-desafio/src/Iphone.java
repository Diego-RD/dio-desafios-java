import util.AparelhoTelefonico;
import util.NavegadorInternet;
import util.ReprodutorMusical;

import java.util.Scanner;

public class Iphone {
  private static final Scanner terminal = new Scanner(System.in);

  public static void main(String[] args) {
    var aparelho = new AparelhoTelefonico();
    var navegador = new NavegadorInternet();
    var reprodutor = new ReprodutorMusical();
    int opcao = -1;

    while(opcao != 10){
      System.out.println("1- Tocar musica");
      System.out.println("2- Pausar musica");
      System.out.println("3 - Selecionar musica");
      System.out.println("4 - Fazer ligação");
      System.out.println("5 - Atender ligação");
      System.out.println("6 - Iniciar Correio de voz");
      System.out.println("7 - Entrar na internet");
      System.out.println("8 - Abri nova aba");
      System.out.println("9 - Atualizar pagina");
      System.out.println("10 - Bloquear telefone");
      System.out.print(">");

      opcao = terminal.nextInt();
      switch (opcao){
        case 1 -> reprodutor.tocar();
        case 2 -> reprodutor.pausar();
        case 3 -> reprodutor.selecionarMusica(reprodutor.getMusica());
        case 4 -> aparelho.ligar(aparelho.getNumero());
        case 5 -> aparelho.atender();
        case 6 -> aparelho.iniciarCorreioVoz();
        case 7 -> navegador.exibirPagina(navegador.getUrl());
        case 8 -> navegador.adicionarNovaAba();
        case 9 ->navegador.atualizarPagina();
        case 10 ->{
          System.out.println("Telefone Bloqueado");
          break;
        }
        default -> System.out.println("Selecione uma opção valida.");
      }
    }
  }
}