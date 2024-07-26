public class App {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 1000.0, "João Silva");
        ContaPoupanca cp = new ContaPoupanca(456, 5000.0, "Maria Souza");

        cc.depositar(500);
        cc.sacar(300);
        cp.depositar(1000);
        cp.sacar(500);

        System.out.println(cc);
        System.out.println(cp);
        System.out.println("Número de saques na Conta Corrente: " + cc.getNumeroDeSaques());
        System.out.println("Número de saques na Conta Poupança: " + cp.getNumeroDeSaques());
    }
}
