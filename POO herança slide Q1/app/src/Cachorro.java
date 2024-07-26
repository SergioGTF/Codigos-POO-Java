public class Cachorro {
    String nome;
    String raça;
    int idade;
    
    Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raça = raca;
        this.idade = idade;
    }
    
    void latir() {
        System.out.println(nome + " está latindo!");
    }
    
    void comer() {
        System.out.println(nome + " está comendo!");
    }
    
    void dormir() {
        System.out.println(nome + " está dormindo!");
    }
}