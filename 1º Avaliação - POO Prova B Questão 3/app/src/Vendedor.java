public class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario, "Vendedor");
    }

    @Override
    public double calcularBonus() {
        return salario * 0.1;
    }
}

