public class Conta {
    protected int numero;
    protected double saldo;
    protected String titular;

    public Conta(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "Conta: " + numero + ", Titular: " + titular + ", Saldo: " + saldo;
    }
}



