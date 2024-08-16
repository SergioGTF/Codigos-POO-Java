import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double precoAlcool = 4.85;
        double precoGasolina = 5.67;

        double descontoAlcoolAte20 = 0.03;
        double descontoAlcoolAcima20 = 0.05;

        double descontoGasolinaAte20 = 0.04;
        double descontoGasolinaAcima20 = 0.06;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de litros vendidos: ");
            double litros = scanner.nextDouble();

            System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
            char tipoCombustivel = scanner.next().charAt(0);

            double valorFinal = 0.0;

            if (tipoCombustivel == 'A') { 
                if (litros <= 20) {
                    valorFinal = litros * precoAlcool * (1 - descontoAlcoolAte20);
                } else {
                    valorFinal = litros * precoAlcool * (1 - descontoAlcoolAcima20);
                }
            } else if (tipoCombustivel == 'G') { 
                if (litros <= 20) {
                    valorFinal = litros * precoGasolina * (1 - descontoGasolinaAte20);
                } else {
                    valorFinal = litros * precoGasolina * (1 - descontoGasolinaAcima20);
                }
            } else {
                System.out.println("Tipo de combustível inválido.");
                return;
            }

            System.out.printf("O valor a ser pago é: R$ %.2f\n", valorFinal);
        }
    }
}
