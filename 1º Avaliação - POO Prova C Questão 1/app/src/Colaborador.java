import java.util.ArrayList;
import java.util.List;

public class Colaborador {
    private String nome;
    private String cargo;
    private List<Projeto> projetos;

    public Colaborador(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.projetos = new ArrayList<>();
    }

    public void associarProjeto(Projeto projeto) {
        projetos.add(projeto);
    }

    @Override
    public String toString() {
        return "Colaborador: " + nome + ", Cargo: " + cargo;
    }
}

