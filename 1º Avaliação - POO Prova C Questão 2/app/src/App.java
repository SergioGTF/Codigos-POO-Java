import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        List<Fornecedor> fornecedores = new ArrayList<>();

        while (true) {
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Adicionar Fornecedor");
            System.out.println("3. Realizar Compra");
            System.out.println("4. Exibir Produtos");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.println("Nome do Produto: ");
                String nome = scanner.nextLine();
                System.out.println("Preço do Produto: ");
                double preco = scanner.nextDouble();
                System.out.println("Quantidade do Produto: ");
                int quantidade = scanner.nextInt();
                produtos.add(new Produto(nome, preco, quantidade));
            } else if (opcao == 2) {
                System.out.println("Nome do Fornecedor: ");
                String nome = scanner.nextLine();
                System.out.println("Contato do Fornecedor: ");
                String contato = scanner.nextLine();
                Fornecedor fornecedor = new Fornecedor(nome, contato);
                fornecedores.add(fornecedor);
                System.out.println("Adicionar produtos fornecidos (S/N)? ");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("S")) {
                    System.out.println("Nome do Produto: ");
                    String produtoNome = scanner.nextLine();
                    for (Produto produto : produtos) {
                        if (produto.toString().equalsIgnoreCase(produtoNome)) {
                            fornecedor.adicionarProduto(produto);
                        }
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Nome do Fornecedor: ");
                String nomeFornecedor = scanner.nextLine();
                System.out.println("Nome do Produto: ");
                String nomeProduto = scanner.nextLine();
                System.out.println("Quantidade: ");
                int quantidade = scanner.nextInt();
                for (Fornecedor fornecedor : fornecedores) {
                    if (fornecedor.toString().contains(nomeFornecedor)) {
                        for (Produto produto : fornecedor.getProdutos()) {
                            if (produto.toString().equalsIgnoreCase(nomeProduto)) {
                                Compra compra = new Compra(fornecedor, produto, quantidade);
                                compra.registrarCompra();
                            }
                        }
                    }
                }
            } else if (opcao == 4) {
                for (Produto produto : produtos) {
                    produto.exibirDetalhes();
                }
            } else if (opcao == 5) {
                break;
            }
        }
        scanner.close();
    }
}
