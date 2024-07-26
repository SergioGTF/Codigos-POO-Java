class ItemPedido {
    Produto produto;
    int quantidade;

    ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    double calcularTotalItem() {
        return produto.preco * quantidade;
    }
}