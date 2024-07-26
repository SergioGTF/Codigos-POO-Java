public class Pessoa {

    public String nome;
    public int idade;
    public String preferencia;


    public Pessoa(String nome, int idade, String preferencia) {
        this.nome = nome;
        this.idade = idade;
        this.preferencia = preferencia;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getPreferencia() {
        return preferencia;
    }


    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }
}
