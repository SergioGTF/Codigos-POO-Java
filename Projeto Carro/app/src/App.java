// Classe Carro dentro do pacote padrão
class Carro {
    private String marca;
    private String modelo;
    private double velocidadeMaxima;

    public Carro() {
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.velocidadeMaxima = 0.0;
    }

    public Carro(String marca, String modelo, double velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostrarDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Velocidade Máxima: " + velocidadeMaxima + " km/h");
    }

    // Métodos getters e setters com validação básica
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (!marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido.");
        }
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima > 0) {
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("Velocidade máxima deve ser positiva.");
        }
    }
}

public class App {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.mostrarDetalhes();

        Carro carro2 = new Carro("Ferrari", "F8", 340.0);
        carro2.mostrarDetalhes();

        carro1.setMarca("Lamborghini");
        carro1.setModelo("Aventador");
        carro1.setVelocidadeMaxima(350.0);
        System.out.println("Carro modificado: " + carro1.getMarca() + " " + carro1.getModelo() + ", Velocidade Máxima: " + carro1.getVelocidadeMaxima() + " km/h");
    }
}
