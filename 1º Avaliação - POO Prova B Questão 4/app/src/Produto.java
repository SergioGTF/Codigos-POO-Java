public class Produto {
    protected int codigo;
    protected String descricao;
    protected double preco;
    protected static int totalVendas = 0;

    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void vender() {
        totalVendas++;
    }

    public static int getTotalVendas() {
        return totalVendas;
    }

    @Override
    public String toString() {
        return "Produto: " + descricao + ", Preço: " + preco;
    }
}



