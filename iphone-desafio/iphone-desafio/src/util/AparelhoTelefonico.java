package util;

public class AparelhoTelefonico {
  public String numero = "1234455667";

  public String ligar(String numero){
    System.out.println("Fazendo ligação para" +getNumero());
    return numero;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public void atender(){
    System.out.println("Atendendo ligação");
  }
  public void iniciarCorreioVoz(){
    System.out.println("Iniciando correio de voz");
  }
}
