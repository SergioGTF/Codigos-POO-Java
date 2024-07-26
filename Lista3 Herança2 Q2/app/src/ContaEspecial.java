public class ContaEspecial extends ContaCorrente {
    @Override
    void sacar(double valor) {
        double taxa = valor * 0.001; // 0.1% para clientes especiais
        saldo -= (valor + taxa);
    }
}

