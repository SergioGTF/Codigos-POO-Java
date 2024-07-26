public class operadorcaixa extends funcionario {
    int numeroCaixa;

    operadorcaixa(String nome, int jornadaMensal, double salario, int numeroCaixa) {
        super(nome, jornadaMensal, salario);
        this.numeroCaixa = numeroCaixa;
    }

    void imprimirFicha() {
        super.imprimirFicha();
        System.out.println("Número do Caixa: " + numeroCaixa);
    }
}
