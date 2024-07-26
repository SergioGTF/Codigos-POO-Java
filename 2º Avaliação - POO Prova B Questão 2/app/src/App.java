import java.util.ArrayList;
import java.util.Scanner;


public class App {
    private static ArrayList<Veiculo> veiculos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Veículo");
            System.out.println("2. Listar Veículos");
            System.out.println("3. Buscar Veículo por Placa");
            System.out.println("4. Remover Veículo");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarVeiculo(scanner);
                    break;
                case 2:
                    listarVeiculos();
                    break;
                case 3:
                    buscarVeiculo(scanner);
                    break;
                case 4:
                    removerVeiculo(scanner);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
            }
        }
    }

    private static void adicionarVeiculo(Scanner scanner) {
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.println("3. Caminhão");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Placa: ");
        String placa = scanner.nextLine();
        System.out.println("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.println("Valor da Diária: ");
        double valorDiaria = scanner.nextDouble();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                veiculos.add(new Carro(placa, modelo, valorDiaria));
                break;
            case 2:
                veiculos.add(new Moto(placa, modelo, valorDiaria));
                break;
            case 3:
                veiculos.add(new Caminhao(placa, modelo, valorDiaria));
                break;
        }
    }

    private static void listarVeiculos() {
        for (Veiculo v : veiculos) {
            System.out.println(v);
        }
    }

    private static void buscarVeiculo(Scanner scanner) {
        System.out.println("Placa do Veículo: ");
        String placa = scanner.nextLine();
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                System.out.println(v);
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    private static void removerVeiculo(Scanner scanner) {
        System.out.println("Placa do Veículo: ");
        String placa = scanner.nextLine();
        Veiculo veiculoARemover = null;
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                veiculoARemover = v;
                break;
            }
        }
        if (veiculoARemover != null) {
            veiculos.remove(veiculoARemover);
            System.out.println("Veículo removido.");
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }
}
