import java.util.Scanner;

public class App {
    public static double calcularVolume(double raio) {
        double pi = Math.PI;
        double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
        return volume;
    }
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        double volume = calcularVolume(raio);
        System.out.printf("O volume da esfera com raio %.2f é %.2f%n", raio, volume);
        scanner.close();
    }
}
