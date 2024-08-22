import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Questão 04
         * Crie um algoritmo que leia um número e diga se o número é um palindromo ou
         * não.
         * Um palíndromo é um número inteiro positivo, sem zeros à esquerda, que é o
         * mesmo se lido da esquerda para a direita ou da direita para a esquerda. Por
         * exemplo, os números 11 e 65256 são palíndromos, mas os números 010 e 123 não
         * são.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        String numero = scanner.nextLine();

        if (isPalindromo(numero)) {
            System.out.println("O número " + numero + " é um palíndromo.");
        } else {
            System.out.println("O número " + numero + " não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean isPalindromo(String numero) {
        if (numero.length() > 1 && numero.charAt(0) == '0') {
            return false;
        }

        String numeroInvertido = new StringBuilder(numero).reverse().toString();

        return numero.equals(numeroInvertido);
    }
}
