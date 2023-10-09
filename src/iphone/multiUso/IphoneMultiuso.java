package iphone.multiUso;

import iphone.telefone.TelefoneInterface;
import iphone.navegadorInternet.NavegadorInterface;
import iphone.reptodutorMusical.ReprodutorInterface;

public class IphoneMultiuso implements ReprodutorInterface, TelefoneInterface, NavegadorInterface {


  @Override
  public void tocar() {
    System.out.println("Ouvindo a música.");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando a música.");
  }

  @Override
  public void selecionarMusica(String nome) {
    System.out.println(nome + " selecionada");
  }

  @Override
  public void ligar(int numero) {
    System.out.println("Ligando para " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo ligação.");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Correio de voz.");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Exibindo a página.");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando página.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página.");
  }
}
