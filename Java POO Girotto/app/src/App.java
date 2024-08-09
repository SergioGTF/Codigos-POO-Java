import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a base maior do trapézio: ");
        double baseMaior = scanner.nextDouble();

        System.out.print("Informe a base menor do trapézio: ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Informe a altura do trapézio: ");
        double altura = scanner.nextDouble();

        double area = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A área do trapézio é: " + area);
    }
}
