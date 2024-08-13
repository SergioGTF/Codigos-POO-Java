import java.util.Scanner;
import java.lang.Math;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double h;

        System.out.println("Digite o valor do lado do triângulo: ");
        a = input.nextDouble();
        System.out.println("Digite o valor do lado do triângulo: ");
        b = input.nextDouble();

        h = Math.sqrt(a*a + b*b);
        
        System.out.printf("Hipotenusa: %f%n", h);
        input.close();
    }
}
