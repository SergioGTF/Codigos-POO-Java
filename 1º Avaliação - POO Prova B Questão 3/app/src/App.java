import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Carlos", 10000));
        funcionarios.add(new Vendedor("Ana", 3000));
        funcionarios.add(new Assistente("Lucas", 2000));

        double totalBonus = 0;
        for (Funcionario funcionario : funcionarios) {
            totalBonus += funcionario.calcularBonus();
        }

        System.out.println("Total de Bônus: R$ " + totalBonus);
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario + ", Bônus: R$ " + funcionario.calcularBonus());
        }
    }
}

