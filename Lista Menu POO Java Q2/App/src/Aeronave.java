public abstract class Aeronave {
    protected String modelo;
    protected int capacidadePassageiros;

    public Aeronave(String modelo, int capacidadePassageiros) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public abstract double calcularCustoVoo();

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Capacidade de Passageiros: " + capacidadePassageiros;
    }
}
