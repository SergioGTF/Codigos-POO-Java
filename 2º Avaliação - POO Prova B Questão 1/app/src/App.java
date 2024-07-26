import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Buscar Funcionário por Nome");
            System.out.println("4. Remover Funcionário");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarFuncionario(scanner);
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                    buscarFuncionario(scanner);
                    break;
                case 4:
                    removerFuncionario(scanner);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
            }
        }
    }

    private static void adicionarFuncionario(Scanner scanner) {
        System.out.println("1. Gerente");
        System.out.println("2. Desenvolvedor");
        System.out.println("3. Estagiário");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                funcionarios.add(new Gerente(nome, salario));
                break;
            case 2:
                funcionarios.add(new Desenvolvedor(nome, salario));
                break;
            case 3:
                funcionarios.add(new Estagiario(nome, salario));
                break;
        }
    }

    private static void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    private static void buscarFuncionario(Scanner scanner) {
        System.out.println("Nome do Funcionário: ");
        String nome = scanner.nextLine();
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                System.out.println(f);
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    private static void removerFuncionario(Scanner scanner) {
        System.out.println("Nome do Funcionário: ");
        String nome = scanner.nextLine();
        Funcionario funcionarioARemover = null;
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                funcionarioARemover = f;
                break;
            }
        }
        if (funcionarioARemover != null) {
            funcionarios.remove(funcionarioARemover);
            System.out.println("Funcionário removido.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
