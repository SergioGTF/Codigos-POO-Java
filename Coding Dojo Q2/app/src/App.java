import java.util.Scanner;  

public class App {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Digite o número de termos da série que deseja mostrar: ");  
        int n = scanner.nextInt();  
        
        double soma = 0; 
        
        for (int i = 1; i <= n; i++) {  
            int numerador = i; 
            int denominador = 2 * i - 1; 
            
            if (denominador != 0) { 
                double termo = (double) numerador / denominador;  
                soma += termo;   
                System.out.println("Termo " + i + ": " + termo);  
            } else {  
                System.out.println("Termo " + i + ": Divisão por zero (denominador é " + denominador + ")");  
            }  
        }  
        
        System.out.println("Soma dos " + n + " termos da série: " + soma);  
        
        scanner.close();  
    }  
}