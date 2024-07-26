public class Compra {
    private Fornecedor fornecedor;
    private Produto produto;
    private int quantidade;

    public Compra(Fornecedor fornecedor, Produto produto, int quantidade) {
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.quantidade = quantidade;
        this.produto.atualizarEstoque(quantidade);
    }

    public void registrarCompra() {
        System.out.println("Compra realizada: " + produto + " do fornecedor " + fornecedor + ", Quantidade: " + quantidade);
    }
}
