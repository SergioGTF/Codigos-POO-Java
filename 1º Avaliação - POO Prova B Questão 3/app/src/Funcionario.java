public class Funcionario {
    protected String nome;
    protected double salario;
    protected String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularBonus() {
        return 0;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + ", Salario: " + salario + ", Cargo: " + cargo;
    }
}



