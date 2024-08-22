import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);  
        int[] num = new int[15];  

        // Leitura dos 15 números inteiros  
        for (int i = 0; i < num.length; i++) {  
            System.out.print("Digite o número " + (i + 1) + ": ");  
            num[i] = scanner.nextInt();  
        }  

        // Impressão da listagem numerada  
        System.out.println("\nListagem dos números e suas classificações:");  
        for (int i = 0; i < num.length; i++) {  
            String tipo = (num[i] % 2 == 0) ? "par" : "ímpar";  
            System.out.println((i + 1) + ": " + num[i] + " - " + tipo);  
        }  

        scanner.close();  
    }
}
