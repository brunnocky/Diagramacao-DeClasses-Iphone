import java.util.Random;

public interface AparelhoTelefonico {
    default void ligar(){
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
    default void atender(){
        System.out.println("Atendendo");
    }
    default void iniciarCorreioDeVoz(){
        System.out.println("Correio de voz iniciado");
    }
}
