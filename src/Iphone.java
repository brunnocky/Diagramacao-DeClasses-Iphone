import java.util.Random;

public class Iphone implements  ReprodutorMusical,NavegadorDeInternet,AparelhoTelefonico{
    public void tocar(){
        System.out.println("Tocando música");
    }
    public void pausarMusica() {
        System.out.println("Música pausada");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música");
    }

    public void exibirPagina() {
        System.out.println("Exibindo nova página");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página");
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba");
    }

    public void ligar(){
        System.out.println("Ligando");
        chamar();
    }
    private void chamar(){
        for (int i=1; i<=3;i++){
            System.out.println("Chamando pela " + i+"º" + "vez");
            testarChamada();
            if (testarChamada()){
                System.out.println("Atendeu");
                break;
            }else if (i == 3){
                iniciarCorreioDeVoz();
            }
        }
    }
    private boolean testarChamada(){
        Random rd = new Random();
        return rd.nextBoolean();
    }
    public void atender(){
        System.out.println("Atendendo");
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("Correio de voz iniciado");
    }


    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
       // iphone.adicionarNovaAba();

    }
}
