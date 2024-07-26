public class App {
    public static void main(String[] args) {
        ProdutoEletronico p1 = new ProdutoEletronico(101, "Smartphone", 1500);
        ProdutoAlimenticio p2 = new ProdutoAlimenticio(202, "Arroz", 20);
        ProdutoHigiene p3 = new ProdutoHigiene(303, "Sabonete", 5);

        p1.vender();
        p1.vender();
        p2.vender();
        p3.vender();
        p3.vender();
        p3.vender();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Total de Vendas de Eletrônicos: " + ProdutoEletronico.getVendasEletronicos());
        System.out.println("Total de Vendas de Alimentícios: " + ProdutoAlimenticio.getVendasAlimenticios());
        System.out.println("Total de Vendas de Higiene: " + ProdutoHigiene.getVendasHigiene());
        System.out.println("Total de Vendas de Todos os Produtos: " + Produto.getTotalVendas());
    }
}
