public class Helicoptero extends Aeronave {
    private boolean possuiResgateAereo;

    public Helicoptero(String modelo, int capacidadePassageiros, boolean possuiResgateAereo) {
        super(modelo, capacidadePassageiros);
        this.possuiResgateAereo = possuiResgateAereo;
    }

    @Override
    public double calcularCustoVoo() {
        double custo = 2000 + (15 * capacidadePassageiros);
        if (possuiResgateAereo) {
            custo += 1000;
        }
        return custo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Possui Resgate Aéreo: " + (possuiResgateAereo ? "Sim" : "Não");
    }
}
