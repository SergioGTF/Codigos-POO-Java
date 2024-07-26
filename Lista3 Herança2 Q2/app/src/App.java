public class App {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        conta1.depositar(1000);
        conta1.sacar(500);
        System.out.println("Saldo Conta Corrente: R$" + conta1.getSaldo());

        ContaEspecial conta2 = new ContaEspecial();
        conta2.depositar(1000);
        conta2.sacar(500);
        System.out.println("Saldo Conta Especial: R$" + conta2.getSaldo());
    }
}
