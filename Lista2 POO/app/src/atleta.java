public class atleta {
    String nome;
    int idade;
    
    atleta(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}