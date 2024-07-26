public class Livraria {
    String nome;
    String endereco;
    int quantidadeDeLivros;

    
    public Livraria(String nome, String endereco, int quantidadeDeLivros) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeDeLivros = quantidadeDeLivros;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public int getQuantidadeDeLivros() {
        return quantidadeDeLivros;
    }


    public void setQuantidadeDeLivros(int quantidadeDeLivros) {
        this.quantidadeDeLivros = quantidadeDeLivros;
    }

    
}
