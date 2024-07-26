public class App {
    public static void main(String[] args) throws Exception {

        repositormercadoria repositor1 = new repositormercadoria("João", 160, 2000.0);
        double horasExtrasRepositor = repositor1.calcularHoraExtra(10);
        System.out.println("Horas extras do Repositor: R$" + horasExtrasRepositor);
        repositor1.imprimirFicha();
        System.out.println();

        operadorcaixa operadorCaixa1 = new operadorcaixa("Maria", 160, 2500.0, 10);
        double horasExtrasOperador = operadorCaixa1.calcularHoraExtra(15);
        System.out.println("Horas extras do Operador de Caixa: R$" + horasExtrasOperador);
        operadorCaixa1.imprimirFicha();
    }
}
