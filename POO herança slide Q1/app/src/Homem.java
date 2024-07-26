public class Homem {
    String nome;
    int idade;
    String profissao;
    
    Homem(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }
    
    void trabalhar() {
        System.out.println(nome + " está trabalhando como " + profissao);
    }
    
    void comer() {
        System.out.println(nome + " está comendo!");
    }
    
    void dormir() {
        System.out.println(nome + " está dormindo!");
    }
}