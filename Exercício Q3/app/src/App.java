import java.util.Scanner;

public class App {
    public static int Primo(int numero) {
        int i;
        for (i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int Num, Resultado;

        System.out.print("Digite um número: ");
        Num = entrada.nextInt();
        Resultado = Primo(Num);

        if (Resultado == 1) {
            System.out.println("Número primo.");
        } else {
            System.out.println("Número não primo");
        }
        entrada.close();
    }
}