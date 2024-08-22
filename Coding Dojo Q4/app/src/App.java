import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();
            int tamanho = 0;
            int numero_copia = numero;
            while(numero_copia != 0){
                tamanho += 1;
                numero_copia /= 10;
            }
            int numero_invertido = 0;
            int potencia = 1;
            numero_copia = numero;
            while (numero_copia != 0) {
                numero_invertido = (int)(numero_copia/Math.pow(10, tamanho-1))*potencia;
                numero_copia = (int) (numero_copia%Math.pow(10, tamanho-1));
                potencia *= 10;
                tamanho -= 10;
            }
            if (numero == numero_invertido) {
             
            }
        }
    }
}
