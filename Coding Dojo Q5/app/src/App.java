import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Questão 05
         * Escreva um programa que escreva o número palíndromo mais próximo de um
         * inteiro inserido pelo usuário.
         * Se dois números palíndromos estiverem empatados em distância absoluta,
         * retorne o número menor.
         * Se o próprio número for um palíndromo, escreva esse número.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (isPalindromo(numero)) {
            System.out.println("O número palíndromo mais próximo é: " + numero);
        } else {
            int proximoPalindromo = encontrarProximoPalindromo(numero);
            System.out.println("O número palíndromo mais próximo é: " + proximoPalindromo);
        }

        scanner.close();
    }

    public static boolean isPalindromo(int numero) {
        String numeroStr = Integer.toString(numero);
        String numeroInvertido = new StringBuilder(numeroStr).reverse().toString();
        return numeroStr.equals(numeroInvertido);
    }

    public static int encontrarProximoPalindromo(int numero) {
        int menorDistancia = Integer.MAX_VALUE;
        int palindromoMaisProximo = numero;

        int delta = 0;

        while (true) {
            int candidatoMenor = numero - delta;
            int candidatoMaior = numero + delta;

            boolean encontrou = false;

            if (candidatoMenor >= 0 && isPalindromo(candidatoMenor)) {
                if (delta < menorDistancia) {
                    menorDistancia = delta;
                    palindromoMaisProximo = candidatoMenor;
                }
                encontrou = true;
            }

            if (isPalindromo(candidatoMaior)) {
                if (delta < menorDistancia) {
                    menorDistancia = delta;
                    palindromoMaisProximo = candidatoMaior;
                } else if (delta == menorDistancia) {
                    palindromoMaisProximo = Math.min(palindromoMaisProximo, candidatoMaior);
                }
                encontrou = true;
            }

            if (encontrou) {
                break;
            }

            delta++;
        }

        return palindromoMaisProximo;
    }
}
