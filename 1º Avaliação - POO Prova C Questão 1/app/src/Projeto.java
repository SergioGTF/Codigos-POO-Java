import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private String prazo;
    private List<Tarefa> tarefas;

    public Projeto(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void acompanharProgresso() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + ", Prazo: " + prazo;
    }
}

