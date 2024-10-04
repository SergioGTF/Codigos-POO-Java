class Circulo {
    private double coordenada_x;
    private double coordenada_y;
    private double raio;

    public Circulo(double coordenada_x, double coordenada_y, double raio) {
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
        this.raio = raio;
    }

    public void imprimir_informacoes() {
        System.out.println("Centro do Círculo: (" + coordenada_x + ", " + coordenada_y + ")");
        System.out.println("Raio: " + raio);
    }

    public double calcular_distancia(Circulo outroCirculo) {
        double deltaX = outroCirculo.coordenada_x - this.coordenada_x;
        double deltaY = outroCirculo.coordenada_y - this.coordenada_y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}

class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(1.0, 2.0, 3.0);  
        Circulo c2 = new Circulo(4.0, 6.0, 2.0); 

        c1.imprimir_informacoes();
        c2.imprimir_informacoes();

        double distancia = c1.calcular_distancia(c2);
        System.out.println("Distância entre os centros: " + distancia);
    }
}
