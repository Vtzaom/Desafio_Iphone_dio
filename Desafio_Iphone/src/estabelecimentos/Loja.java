package estabelecimentos;

import equipamentos.aparelho.Iphone;

public class Loja {

    public static void main(String[] args) {
        Iphone max = new Iphone();

        //ipod
        max.tocar();
        max.pausar();
        max.selecionarMusica("Lá no céu");
        //telefone
        max.atender();
        max.ligar("218752634");
        max.iniciarCorreioVoz();
        //Safari
        max.exibirPagina("www.google.com");
        max.adicionarNovaAba();
        max.atualizarPagina();
    }
}
