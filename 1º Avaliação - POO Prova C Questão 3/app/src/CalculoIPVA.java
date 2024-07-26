import java.util.ArrayList;
import java.util.List;

public class CalculoIPVA {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Toyota", "Corolla", 2020));
        veiculos.add(new Moto("Yamaha", "MT-07", 2019));
        veiculos.add(new Caminhao("Volvo", "FH16", 2018));

        double totalIPVA = 0;
        for (Veiculo veiculo : veiculos) {
            totalIPVA += veiculo.calcularIPVA();
        }
        
        System.out.println("Total do IPVA de todos os veículos: R$ " + totalIPVA);
    }
}
