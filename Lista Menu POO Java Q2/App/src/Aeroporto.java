import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aeroporto {
    private List<Aeronave> aeronaves;

    public Aeroporto() {
        aeronaves = new ArrayList<>();
    }

    public void adicionarAviao(Scanner scanner) {
        System.out.print("Modelo do avião: ");
        String modelo = scanner.nextLine();
        System.out.print("Capacidade de passageiros: ");
        int capacidadePassageiros = scanner.nextInt();
        System.out.print("Capacidade de carga (kg): ");
        int capacidadeCarga = scanner.nextInt();
        scanner.nextLine();  
        Aviao aviao = new Aviao(modelo, capacidadePassageiros, capacidadeCarga);
        aeronaves.add(aviao);
        System.out.println("Avião adicionado com sucesso!");
    }

    public void adicionarHelicoptero(Scanner scanner) {
        System.out.print("Modelo do helicóptero: ");
        String modelo = scanner.nextLine();
        System.out.print("Capacidade de passageiros: ");
        int capacidadePassageiros = scanner.nextInt();
        System.out.print("Possui resgate aéreo (true/false): ");
        boolean possuiResgateAereo = scanner.nextBoolean();
        scanner.nextLine();  
        Helicoptero helicoptero = new Helicoptero(modelo, capacidadePassageiros, possuiResgateAereo);
        aeronaves.add(helicoptero);
        System.out.println("Helicóptero adicionado com sucesso!");
    }

    public void exibirAeronaves() {
        if (aeronaves.isEmpty()) {
            System.out.println("Nenhuma aeronave cadastrada.");
        } else {
            for (Aeronave aeronave : aeronaves) {
                System.out.println(aeronave);
            }
        }
    }

    public void calcularCustoTotalVoos() {
        double custoTotal = 0;
        for (Aeronave aeronave : aeronaves) {
            custoTotal += aeronave.calcularCustoVoo();
        }
        System.out.println("Custo total dos voos: R$" + custoTotal);
    }
}
