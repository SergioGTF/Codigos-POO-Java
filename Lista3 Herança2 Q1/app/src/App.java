public class App {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[7];
        pessoas[0] = new Aluno("Sergio1", 1001);
        pessoas[1] = new Aluno("Sergio2", 1002);
        pessoas[2] = new Aluno("Sergio3", 1003);
        pessoas[3] = new Aluno("Sergio4", 1004);
        pessoas[4] = new Professor("Sergio5", "Cálculo1", 2001);
        pessoas[5] = new Professor("Sergio6", "Física1", 2002);
        pessoas[6] = new Professor("Sergio7", "Programação orientada a objeto", 2003);

        for (Pessoa pessoa : pessoas) {
            pessoa.imprimirDados();
            System.out.println();
        }
    }
}
