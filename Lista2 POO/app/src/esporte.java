public class esporte {
    String valencia;
    String objetivo;
    
    esporte(String valencia, String objetivo) {
        this.valencia = valencia;
        this.objetivo = objetivo;
    }
    
    void getInfo() {
        System.out.println("Valência: " + valencia);
        System.out.println("Objetivo: " + objetivo);
    }
}
