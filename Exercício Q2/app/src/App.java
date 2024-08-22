public class App {
    public static void CalcularMedia(double nota1, double nota2, double nota3, char tipoMedia, double[] media) {
        switch (tipoMedia) {
            case 'A':
                media[0] = (nota1 + nota2 + nota3) / 3;
                break;
            case 'P':
                media[0] = (5 * nota1 + 3 * nota2 + 2 * nota3) / 10;
                break;
            case 'H':
                media[0] = 3 / (1 / nota1 + 1 / nota2 + 1 / nota3);
                break;
            default:
                System.out.println("Tipo de média inválido");
                media[0] = 0;
        }
    }

    public static void main(String[] args) throws Exception {
        /*
         * 2. Escreva um procedimento que recebe as 3 notas de um aluno por parâmetro e
         * uma letra. Se a letra for A o procedimento calcula a média aritmética das
         * notas do aluno, se for P, a sua média ponderada (pesos: 5, 3 e 2) e se for H,
         * a sua média harmônica. A média calculada também deve retornar por parâmetro.
         */
        double nota1 = 8.0;
        double nota2 = 7.0;
        double nota3 = 9.0;
        char tipoMedia = 'P';
        double[] media = new double[1];

        CalcularMedia(nota1, nota2, nota3, tipoMedia, media);

        System.out.println("Média: " + media[0]);
    }
}
