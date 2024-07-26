public class IngressoVip extends Ingresso {
    private double valorAdicional;

    IngressoVip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "Valor do Ingresso VIP: R$" + (valor + valorAdicional);
    }
}
