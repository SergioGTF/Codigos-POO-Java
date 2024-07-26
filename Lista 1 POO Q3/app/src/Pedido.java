class Pedido {
    ItemPedido[] itens;
    String formaPagamento;

    Pedido(ItemPedido[] itens, String formaPagamento) {
        this.itens = itens;
        this.formaPagamento = formaPagamento;
    }

    double calcularTotalPedido() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularTotalItem();
        }
        return total;
    }
}