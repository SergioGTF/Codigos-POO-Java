import java.util.Scanner;

public class Digito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        int numero = input.nextInt();
        
        int centena = (int) numero/100;
        int dezena = (int) (numero%100)/10;
        int unidade = (int) numero%10;
        int numero_inverso = unidade*100 + dezena*10 + centena;
        
        numero += numero_inverso;
        
        centena = (int) numero/100;
        dezena = (int) (numero%100)/10;
        unidade = (int) numero%10;
        
        numero = centena + dezena*2 + unidade*3;
        
        int digito_verificador = numero%10;
        
        System.out.printf("Digito: %d%n", digito_verificador);
        input.close();
    }
}
