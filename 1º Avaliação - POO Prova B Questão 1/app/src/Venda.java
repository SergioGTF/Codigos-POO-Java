public class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private double valor;
    private double desconto;

    public Venda(Cliente cliente, Vendedor vendedor, double valor, double desconto) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valor = valor;
        this.desconto = desconto;
        vendedor.registrarVenda(valor);
        cliente.adicionarCompra(this);
    }

    public double calcularValorFinal() {
        return valor - (valor * (desconto / 100));
    }

    @Override
    public String toString() {
        return "Venda - Cliente: " + cliente + ", Vendedor: " + vendedor + ", Valor: " + valor + ", Desconto: " + desconto + "%, Valor Final: " + calcularValorFinal();
    }
}