public class Aviao extends Aeronave {
    private int capacidadeCarga;

    public Aviao(String modelo, int capacidadePassageiros, int capacidadeCarga) {
        super(modelo, capacidadePassageiros);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularCustoVoo() {
        return 500 + (10 * capacidadePassageiros) + (5 * capacidadeCarga);
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidade de Carga: " + capacidadeCarga + "kg";
    }
}
