package iphone;

import iphone.multiUso.IphoneMultiuso;

public class Main {

  public static void main(String[] args) {
    IphoneMultiuso aparelho = new IphoneMultiuso();

    System.out.println("------------->");
    aparelho.selecionarMusica("Los Hermanos");
    aparelho.tocar();
    aparelho.pausar();

    System.out.println("------------->");
    aparelho.atender();
    aparelho.iniciarCorreioVoz();
    aparelho.ligar(40028922);

    System.out.println("------------->");
    aparelho.exibirPagina();
    aparelho.atualizarPagina();
    aparelho.adicionarNovaAba();

    System.out.println("------------->");
  }

}
