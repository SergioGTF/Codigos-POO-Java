public class ProdutoAlimenticio extends Produto {
    private static int vendasAlimenticios = 0;

    public ProdutoAlimenticio(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    @Override
    public void vender() {
        super.vender();
        vendasAlimenticios++;
    }

    public static int getVendasAlimenticios() {
        return vendasAlimenticios;
    }
}

