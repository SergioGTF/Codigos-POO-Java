public 
class ProdutoEletronico extends Produto {
    private static int vendasEletronicos = 0;

    public ProdutoEletronico(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    @Override
    public void vender() {
        super.vender();
        vendasEletronicos++;
    }

    public static int getVendasEletronicos() {
        return vendasEletronicos;
    }
}


