public class tripulante extends pessoa {
    String funcao;
    int id;
    
    tripulante(String nome, String funcao, int id) {
        super(nome);
        this.funcao = funcao;
        this.id = id;
    }
    
    void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Função: " + funcao);
        System.out.println("ID: " + id);
    }
}