public class Vendedor {
    private String nome;
    private double comissao;
    private double totalVendas;

    public Vendedor(String nome, double comissao) {
        this.nome = nome;
        this.comissao = comissao;
        this.totalVendas = 0;
    }

    public void registrarVenda(double valor) {
        totalVendas += valor;
    }

    public double calcularComissao() {
        return totalVendas * (comissao / 100);
    }

    public void exibirRelatorio() {
        System.out.println("Vendedor: " + nome + ", Total de Vendas: " + totalVendas + ", Comissão: " + calcularComissao());
    }

    @Override
    public String toString() {
        return "Vendedor: " + nome + ", Comissão: " + comissao + "%";
    }
}



