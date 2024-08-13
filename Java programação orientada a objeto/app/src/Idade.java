import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento do pirata: ");
        int idade_pirata = input.nextInt();
        
        System.out.printf("Idade em anos: %d%n", (2023 - idade_pirata));
        System.out.printf("Idade em meses: %d%n", (2023*12 - idade_pirata*12));
        System.out.printf("Idade em dias: %d%n",
                (2023*12*30 - idade_pirata*12*30));
        System.out.printf("Idade em horas: %d%n",
                (2023*12*30*24 - idade_pirata*12*30*24));
        System.out.printf("Idade em minutos: %d%n",
                (2023*12*30*24*60 - idade_pirata*12*30*24*60));
        input.close();
    }
}
