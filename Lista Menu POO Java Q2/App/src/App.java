import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Aeroporto aeroporto = new Aeroporto();
            int opcao;

            do {
                exibirMenu();
                opcao = scanner.nextInt();
                scanner.nextLine();  

                switch (opcao) {
                    case 1:
                        aeroporto.adicionarAviao(scanner);
                        break;
                    case 2:
                        aeroporto.adicionarHelicoptero(scanner);
                        break;
                    case 3:
                        aeroporto.exibirAeronaves();
                        break;
                    case 4:
                        aeroporto.calcularCustoTotalVoos();
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (opcao != 0);
        }
    }

    public static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1: Adicionar novo avião");
        System.out.println("2: Adicionar novo helicóptero");
        System.out.println("3: Exibir todas as aeronaves");
        System.out.println("4: Calcular custo total dos voos");
        System.out.println("0: Sair");
        System.out.print("Escolha uma opção: ");
    }
}
