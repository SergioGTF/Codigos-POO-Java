public class ProdutoHigiene extends Produto {
    private static int vendasHigiene = 0;

    public ProdutoHigiene(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    @Override
    public void vender() {
        super.vender();
        vendasHigiene++;
    }

    public static int getVendasHigiene() {
        return vendasHigiene;
    }
}
