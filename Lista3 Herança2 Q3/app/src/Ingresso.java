public class Ingresso {
    protected double valor;

    Ingresso(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Valor do Ingresso: R$" + valor;
    }
}
