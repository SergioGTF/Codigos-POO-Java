import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Adicionar Conta a um Cliente");
            System.out.println("3. Realizar Transação");
            System.out.println("4. Exibir Histórico de Transações");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            if (opcao == 1) {
                System.out.println("Nome do Cliente: ");
                String nome = scanner.nextLine();
                System.out.println("CPF do Cliente: ");
                String cpf = scanner.nextLine();
                clientes.add(new Cliente(nome, cpf));
            } else if (opcao == 2) {
                System.out.println("CPF do Cliente: ");
                String cpf = scanner.nextLine();
                Cliente cliente = null;
                for (Cliente c : clientes) {
                    if (c.toString().contains(cpf)) {
                        cliente = c;
                        break;
                    }
                }
                if (cliente == null) {
                    System.out.println("Cliente não encontrado.");
                    continue;
                }
                System.out.println("Número da Conta: ");
                int numero = scanner.nextInt();
                cliente.adicionarConta(new Conta(numero));
            } else if (opcao == 3) {
                System.out.println("CPF do Cliente: ");
                String cpf = scanner.nextLine();
                Cliente cliente = null;
                for (Cliente c : clientes) {
                    if (c.toString().contains(cpf)) {
                        cliente = c;
                        break;
                    }
                }
                if (cliente == null) {
                    System.out.println("Cliente não encontrado.");
                    continue;
                }
                System.out.println("Número da Conta: ");
                int numero = scanner.nextInt();
                Conta conta = null;
                for (Conta c : cliente.getContas()) {
                    if (c.toString().contains(String.valueOf(numero))) {
                        conta = c;
                        break;
                    }
                }
                if (conta == null) {
                    System.out.println("Conta não encontrada.");
                    continue;
                }
                System.out.println("1. Depósito");
                System.out.println("2. Saque");
                System.out.println("3. Transferência");
                int tipoTransacao = scanner.nextInt();
                System.out.println("Data da Transação: ");
                String data = scanner.next();
                System.out.println("Valor: ");
                double valor = scanner.nextDouble();
                if (tipoTransacao == 1) {
                    conta.depositar(valor, data);
                } else if (tipoTransacao == 2) {
                    conta.sacar(valor, data);
                } else if (tipoTransacao == 3) {
                    System.out.println("Número da Conta de Destino: ");
                    int numeroDestino = scanner.nextInt();
                    Conta contaDestino = null;
                    for (Cliente c : clientes) {
                        for (Conta contaD : c.getContas()) {
                            if (contaD.toString().contains(String.valueOf(numeroDestino))) {
                                contaDestino = contaD;
                                break;
                            }
                        }
                    }
                    if (contaDestino != null) {
                        conta.transferir(contaDestino, valor, data);
                    } else {
                        System.out.println("Conta de destino não encontrada.");
                    }
                }
            } else if (opcao == 4) {
                System.out.println("CPF do Cliente: ");
                String cpf = scanner.nextLine();
                Cliente cliente = null;
                for (Cliente c : clientes) {
                    if (c.toString().contains(cpf)) {
                        cliente = c;
                        break;
                    }
                }
                if (cliente == null) {
                    System.out.println("Cliente não encontrado.");
                    continue;
                }
                System.out.println("Número da Conta: ");
                int numero = scanner.nextInt();
                Conta conta = null;
                for (Conta c : cliente.getContas()) {
                    if (c.toString().contains(String.valueOf(numero))) {
                        conta = c;
                        break;
                    }
                }
                if (conta != null) {
                    conta.exibirHistorico();
                } else {
                    System.out.println("Conta não encontrada.");
                }
            } else if (opcao == 5) {
                break;
            }
        }
        scanner.close();
    }
}
