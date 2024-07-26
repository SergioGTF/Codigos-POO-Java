public class App {
    public static void main(String[] args) {
        produto[] carrinho = new produto[3];
        
        carrinho[0] = new caneta(2.5, "Bic", "Azul");
        carrinho[1] = new lapiseira(5.0, "Faber-Castell", 0.5);
        carrinho[2] = new caderno(15.0, "Tilibra", 200);
        
        for (produto produto : carrinho) {
            produto.imprimirInfo();
            System.out.println();
        }
    }
}
