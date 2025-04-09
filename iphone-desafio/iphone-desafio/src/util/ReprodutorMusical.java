package util;

public class ReprodutorMusical {

  public String musica;

  public void tocar(){
    if(musica == null){
      System.out.println("Não a nenhuma musica selecionada selecione uma musica antes de tocar");
    }else {
      System.out.println("Tocando musica");
    }
  }
  public void pausar(){
    System.out.println("Musica Pausada");
  }
  public String selecionarMusica(String musica){
    System.out.println("Musica Selecionada");
    return this.musica = "Musica Selecionada";
  }

  public String getMusica() {
    return musica;
  }

  public void setMusica(String musica) {
    this.musica = musica;
  }
}
