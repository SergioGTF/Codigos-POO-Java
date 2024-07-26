public class ContaCorrente implements ContaBancaria {
    private double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public double obterSaldo() {
        return saldo;
    }
}
