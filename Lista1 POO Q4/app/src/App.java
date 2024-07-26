public class App {
    public static void main(String[] args) {
        Apolice apolice = new Apolice("Sergio", 19, 10000000);

        System.out.println("Antes do cálculo e desconto:");
        apolice.imprimir();

        apolice.calcularPremioApolice();
        apolice.oferecerDesconto("Curitiba");

        System.out.println("\nApós o cálculo e desconto:");
        apolice.imprimir();
    }
}