public class nadadores {
    String estilo;
    
    nadadores(String nome, int idade, String estilo) {
        this.estilo = estilo;
    }
    
    void exibirInfoNadador() {
        System.out.println("Estilo: " + estilo);
    }
}
