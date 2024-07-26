public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario, "Gerente");
    }

    @Override
    public double calcularBonus() {
        return salario * 0.2;
    }
}


