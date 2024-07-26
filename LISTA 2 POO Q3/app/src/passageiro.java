public class passageiro extends pessoa {
    int numeroPassagem;
    
    passageiro(String nome, int numeroPassagem) {
        super(nome);
        this.numeroPassagem = numeroPassagem;
    }
    
    void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Número de Passagem: " + numeroPassagem);
    }
}
