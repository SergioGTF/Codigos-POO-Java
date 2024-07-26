import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vendedor> vendedores = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.println("1. Adicionar Vendedor");
            System.out.println("2. Adicionar Cliente");
            System.out.println("3. Realizar Venda");
            System.out.println("4. Exibir Relatório de Vendas");
            System.out.println("5. Exibir Histórico de Compras de um Cliente");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            if (opcao == 1) {
                System.out.println("Nome do Vendedor: ");
                String nome = scanner.nextLine();
                System.out.println("Comissão (%): ");
                double comissao = scanner.nextDouble();
                vendedores.add(new Vendedor(nome, comissao));
            } else if (opcao == 2) {
                System.out.println("Nome do Cliente: ");
                String nome = scanner.nextLine();
                clientes.add(new Cliente(nome));
            } else if (opcao == 3) {
                System.out.println("Nome do Cliente: ");
                String nomeCliente = scanner.nextLine();
                Cliente cliente = null;
                for (Cliente c : clientes) {
                    if (c.toString().contains(nomeCliente)) {
                        cliente = c;
                        break;
                    }
                }
                if (cliente == null) {
                    System.out.println("Cliente não encontrado.");
                    continue;
                }
                System.out.println("Nome do Vendedor: ");
                String nomeVendedor = scanner.nextLine();
                Vendedor vendedor = null;
                for (Vendedor v : vendedores) {
                    if (v.toString().contains(nomeVendedor)) {
                        vendedor = v;
                        break;
                    }
                }
                if (vendedor == null) {
                    System.out.println("Vendedor não encontrado.");
                    continue;
                }
                System.out.println("Valor da Venda: ");
                double valor = scanner.nextDouble();
                System.out.println("Desconto (%): ");
                double desconto = scanner.nextDouble();
                new Venda(cliente, vendedor, valor, desconto);
            } else if (opcao == 4) {
                for (Vendedor vendedor : vendedores) {
                    vendedor.exibirRelatorio();
                }
            } else if (opcao == 5) {
                System.out.println("Nome do Cliente: ");
                String nomeCliente = scanner.nextLine();
                Cliente cliente = null;
                for (Cliente c : clientes) {
                    if (c.toString().contains(nomeCliente)) {
                        cliente = c;
                        break;
                    }
                }
                if (cliente != null) {
                    cliente.exibirHistoricoCompras();
                } else {
                    System.out.println("Cliente não encontrado.");
                }
            } else if (opcao == 6) {
                break;
            }
        }
        scanner.close();
    }
}
