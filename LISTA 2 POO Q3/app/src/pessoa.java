public class pessoa {
    String nome;
    
    pessoa(String nome) {
        this.nome = nome;
    }
    
    void exibirInfo() {
        System.out.println("Nome: " + nome);
    }
}