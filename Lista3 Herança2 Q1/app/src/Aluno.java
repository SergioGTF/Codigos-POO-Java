public class Aluno extends Pessoa {
    int numeroMatricula;

    Aluno(String nome, int numeroMatricula) {
        super(nome);
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    void imprimirDados() {
        super.imprimirDados();
        System.out.println("Número de Matrícula: " + numeroMatricula);
    }
}

