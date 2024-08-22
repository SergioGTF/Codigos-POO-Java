import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de termos da série: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Número de termos deve ser positivo.");
                return;
            }

            System.out.println("Série:");
            int denominador = 1; 
            for (int i = 1; i <= n; i++) {
                if (i == n) {
                    System.out.print(i + "/" + denominador);
                } else {
                    System.out.print(i + "/" + denominador + " + ");
                }
                denominador += 2;
            }
        }
    }
}
