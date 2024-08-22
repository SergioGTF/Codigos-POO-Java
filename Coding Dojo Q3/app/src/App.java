import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Questão 03
         * Criar um algoritmo que a partir da idade e peso do paciente calcule a dosagem
         * de determinado medicamento e imprima a receita informando quantas gotas do
         * medicamento o paciente deve tomar por dose Considere que o medicamento em
         * questão possui 500 mg por ml e que cada ml corresponde a 20 gotas.
         * - Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou
         * acima de 60 quilos devem tomar 1000 mg; com peso abaixo de 60 quilos devem
         * tomar 875 mg.
         * - Para crianças e adolescentes abaixo de 12 anos devem tomar 632 mg.
         */

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a idade do paciente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o peso do paciente (em kg): ");
        double peso = scanner.nextDouble();

        double dosagemMg;

        if (idade >= 12) {
            if (peso >= 60) {
                dosagemMg = 1000; 
            } else {
                dosagemMg = 875; 
            }
        } else {
            dosagemMg = 632;
        }

        double dosagemMl = dosagemMg / 500.0;

        int gotasPorDose = (int) (dosagemMl * 20);

        System.out.println("A dosagem do medicamento para o paciente é de " + gotasPorDose + " gotas por dose.");

        scanner.close();
    }
}
