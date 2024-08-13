import java.util.Scanner;

public class Churrasco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int piratas;
        int cachorros;
        
        System.out.printf("Digite a quantidade de piratas: ");
        piratas = input.nextInt();
        System.out.printf("Digite a quantidade de cachorros: ");
        cachorros = input.nextInt();
        
        float carne = (float) (piratas*350 + cachorros*100.5);
        System.out.printf("Qtd. Carne = %f%n", carne);
        
        float linguica = (float) (130*(piratas+cachorros));
        System.out.printf("Qtd. Linguiça = %f%n", linguica);
        
        float pao = (float) (piratas+cachorros)/8;
        System.out.printf("Qtd. Pão = %f%n", pao);
        
        float agua = (float) 500*(piratas+cachorros);
        System.out.printf("Qtd. Agua = %f%n", agua);
        
        float rum = (float) 990*piratas;
        System.out.printf("Qtd. Rum = %f%n", rum);
        input.close();
    }
}
