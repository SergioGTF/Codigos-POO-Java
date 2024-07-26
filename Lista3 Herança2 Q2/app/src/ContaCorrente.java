public class ContaCorrente {
    protected double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        double taxa = valor * 0.005; // 0.5%
        saldo -= (valor + taxa);
    }

    double getSaldo() {
        return saldo;
    }
}