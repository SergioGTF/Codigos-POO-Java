public class futebol {
    String posicao;
    
    futebol(String nome, int idade, String posicao) {
        this.posicao = posicao;
    }
    
    void exibirInfoJogador() {
        System.out.println("Posição: " + posicao);
    }
}
