public class ContaPoupanca extends Conta {
    private int numeroDeSaques;

    public ContaPoupanca(int numero, double saldo, String titular) {
        super(numero, saldo, titular);
        this.numeroDeSaques = 0;
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        numeroDeSaques++;
    }

    public int getNumeroDeSaques() {
        return numeroDeSaques;
    }
}
