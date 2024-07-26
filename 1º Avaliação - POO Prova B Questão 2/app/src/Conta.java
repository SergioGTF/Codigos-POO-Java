import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numero;
    private double saldo;
    private List<Transacao> historicoTransacoes;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0;
        this.historicoTransacoes = new ArrayList<>();
    }

    public void depositar(double valor, String data) {
        saldo += valor;
        historicoTransacoes.add(new Transacao(data, valor, "depósito"));
    }

    public void sacar(double valor, String data) {
        if (saldo >= valor) {
            saldo -= valor;
            historicoTransacoes.add(new Transacao(data, valor, "saque"));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(Conta contaDestino, double valor, String data) {
        if (saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor, data);
            historicoTransacoes.add(new Transacao(data, valor, "transferência"));
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirHistorico() {
        System.out.println("Histórico de Transações da Conta " + numero + ":");
        for (Transacao transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    @Override
    public String toString() {
        return "Conta: " + numero + ", Saldo: " + saldo;
    }
}
