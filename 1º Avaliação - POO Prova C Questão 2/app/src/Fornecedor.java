import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    private String nome;
    private String contato;
    private List<Produto> produtos;

    public Fornecedor(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + ", Contato" + contato;
    }
}
