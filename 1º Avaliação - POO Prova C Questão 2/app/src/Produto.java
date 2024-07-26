public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void atualizarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade);
    }

    @Override
    public String toString() {
        return nome;
    }
}
