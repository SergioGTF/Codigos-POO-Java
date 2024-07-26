import java.util.ArrayList;

class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Professor: " + nome;
    }
}

class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome;
    }
}

class Curso {
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public int getNumeroAlunos() {
        return alunos.size();
    }

    @Override
    public String toString() {
        return "Curso: " + nome + ", Professor: " + professor.getNome() + ", Alunos: " + alunos.size();
    }
}

class Escola {
    private String nome;
    private ArrayList<Curso> cursos;
    private Professor diretor;

    public Escola(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void definirDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public Curso cursoComMaisAlunos() {
        Curso maiorCurso = null;
        int maxAlunos = 0;
        for (Curso curso : cursos) {
            if (curso.getNumeroAlunos() > maxAlunos) {
                maiorCurso = curso;
                maxAlunos = curso.getNumeroAlunos();
            }
        }
        return maiorCurso;
    }

    @Override
    public String toString() {
        return "Escola: " + nome + ", Diretor: " + (diretor != null ? diretor.getNome() : "Não definido");
    }
}

public class App {
    public static void main(String[] args) {
        Escola escola = new Escola("Escola Exemplo");

        Professor diretor = new Professor("Dr. Silva");
        escola.definirDiretor(diretor);

        Professor prof1 = new Professor("Prof. João");
        Professor prof2 = new Professor("Prof. Maria");

        Curso curso1 = new Curso("Matemática", prof1);
        curso1.adicionarAluno(new Aluno("Aluno 1"));
        curso1.adicionarAluno(new Aluno("Aluno 2"));

        Curso curso2 = new Curso("Português", prof2);
        curso2.adicionarAluno(new Aluno("Aluno 3"));

        escola.adicionarCurso(curso1);
        escola.adicionarCurso(curso2);

        System.out.println(escola);
        System.out.println("Curso com mais alunos: " + escola.cursoComMaisAlunos());
    }
}
