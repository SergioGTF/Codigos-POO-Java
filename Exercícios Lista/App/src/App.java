public class App {  

    public static boolean calcularRaizes(double a, double b, double c, double[] raizes) {  
        if (a == 0) {  
            System.out.println("O coeficiente 'a' não pode ser zero.");  
            return false; // Não é uma equação quadrática  
        }  
        
        double delta = b * b - 4 * a * c;  

        if (delta < 0) {  
            System.out.println("Não há raízes reais.");  
            return false;  
        }  
        
        raizes[0] = (-b + Math.sqrt(delta)) / (2 * a); 
        raizes[1] = (-b - Math.sqrt(delta)) / (2 * a);
        return true;  
    }  

    public static void main(String[] args) {  
        double[] raizes = new double[2];  
        boolean temRaizes = calcularRaizes(1, -3, 2, raizes);  
        
        if (temRaizes) {  
            System.out.println("As raízes são: " + raizes[0] + " e " + raizes[1]);  
        }  
    }  
}