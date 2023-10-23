public interface NavegadorDeInternet {
    default void exibirPagina() {
        System.out.println("Exibindo nova página");
    }
    default void atualizarPagina(){
        System.out.println("Atualizando página");
    }
    default void adicionarNovaAba(){
        System.out.println("Abrindo nova aba");
    }

}
