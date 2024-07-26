public class Tarefa {
    private String descricao;
    private String responsavel;
    private String status; 

    public Tarefa(String descricao, String responsavel, String status) {
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao + ", Responsável: " + responsavel + ", Status: " + status;
    }
}

