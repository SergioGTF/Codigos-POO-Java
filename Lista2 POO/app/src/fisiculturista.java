public class fisiculturista {
    double peso;
    
    fisiculturista(String nome, int idade, double peso) {
        this.peso = peso;
    }
    
    void exibirInfoFisiculturista() {
        System.out.println("Peso: " + peso + " kg");
    }
}
