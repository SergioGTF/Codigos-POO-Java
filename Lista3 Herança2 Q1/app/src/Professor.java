public class Professor extends Pessoa {
    String materia;
    int id;

    Professor(String nome, String materia, int id) {
        super(nome);
        this.materia = materia;
        this.id = id;
    }

    @Override
    void imprimirDados() {
        super.imprimirDados();
        System.out.println("Matéria lecionada: " + materia);
        System.out.println("ID: " + id);
    }
}