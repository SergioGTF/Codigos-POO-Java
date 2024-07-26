public class App {
    public static void main(String[] args) {
        ContaBancaria conta;

        int opcao = 1; 

        if (opcao == 1) {
            conta = new ContaCorrente();
        } else {
            conta = new ContaPoupanca();
        }

        conta.depositar(1000);
        System.out.println("Saldo após depósito: " + conta.obterSaldo());
        conta.sacar(500);
        System.out.println("Saldo após saque: " + conta.obterSaldo());
    }
}
