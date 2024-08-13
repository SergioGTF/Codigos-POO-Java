import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double B;
        double b;
        double h;
        double area;
        
        System.out.println("Digite o valor da base maior: ");
        B = input.nextDouble();
        System.out.println("Digite o valor da base menor: ");
        b = input.nextDouble();
        System.out.println("Digite o valor da altura: ");
        h = input.nextDouble();
        
        area = (b+B)*h/2;
        
        System.out.printf("Área: %f%n", area);
        input.close();
    }
}
