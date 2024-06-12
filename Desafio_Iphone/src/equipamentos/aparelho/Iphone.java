package equipamentos.aparelho;

import equipamentos.ipod.ReprodutorMusical;
import equipamentos.safari.NavegadorInternet;
import equipamentos.telefone.AparelhoTelefonico;

public class Iphone implements  ReprodutorMusical,NavegadorInternet,AparelhoTelefonico{
    @Override
    public void tocar(){
        System.out.println("REPRODUZINDO MUSICA VIA IPHONE");
    };
    @Override
    public void pausar(){
        System.out.println("PAUSANDO MUSICA VIA IPHONE");
 
    }
    @Override
    public void selecionarMusica(String musica){
        System.out.println(" MUSICA "+musica+" SELECIONADA VIA IPHONE");

    }
    @Override
    public void exibirPagina(String url){
        System.out.println(" EXIBIR PAGINA COM A URL: "+url+" , VIA IPHONE");

    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA  VIA IPHONE");

    }
    @Override
    public void  atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA VIA IPHONE");

    }
    @Override
    public void ligar(String numero){
        System.out.println(" LIGANDO PARA O  "+numero+" , VIA IPHONE");

    }
    @Override
    public void atender(){
        System.out.println("ATENDENDO A LIGAÇÃO VIA IPHONE");

    }
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("GRAVANDO CORREIO DE VOZ VIA IPHONE");

    }
}
