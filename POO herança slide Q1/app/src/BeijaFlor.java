public class BeijaFlor {
    String nome;
    String cor;
    
    BeijaFlor(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }
    
    void voar() {
        System.out.println(nome + " está voando!");
    }
    
    void beberNectar() {
        System.out.println(nome + " está bebendo néctar!");
    }
    
    void dormir() {
        System.out.println(nome + " está dormindo!");
    }
}