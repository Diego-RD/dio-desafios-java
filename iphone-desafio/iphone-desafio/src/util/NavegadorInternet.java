package util;

public class NavegadorInternet {
  public String url = "www.site.com";

  public String exibirPagina(String url){
    System.out.println("Entrando na pagina " + getUrl());
    return url;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void adicionarNovaAba(){
    System.out.println("Nova aba aberta");
  }
  public void atualizarPagina(){
    System.out.println("Pagina Atualizada");
  }
}
