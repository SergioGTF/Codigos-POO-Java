class Bank_Account {
    private double saldo;

    public Bank_Account(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Valor: R$" + valor);
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Valor: R$" + valor);
    }

    public double obterSaldo() {
        return saldo;
    }
}

class App {
    public static void main(String[] args) {
        Bank_Account conta1 = new Bank_Account(500.0); 
        Bank_Account conta2 = new Bank_Account(1000.0); 

        System.out.println("Saldo conta 1: R$" + conta1.obterSaldo());
        System.out.println("Saldo conta 2: R$" + conta2.obterSaldo());

        conta1.depositar(200.0);
        conta1.sacar(150.0);

        conta2.sacar(1200.0); 
        conta2.depositar(500.0);

        System.out.println("Saldo final conta 1: R$" + conta1.obterSaldo());
        System.out.println("Saldo final conta 2: R$" + conta2.obterSaldo());
    }
}
