public class funcionario {
    String nome;
    int jornadaMensal;
    double salario;

    funcionario(String nome, int jornadaMensal, double salario) {
        this.nome = nome;
        this.jornadaMensal = jornadaMensal;
        this.salario = salario;
    }

    double calcularHoraExtra(int horasExtras) {
        double salarioHora = salario / jornadaMensal;
        return horasExtras * (salarioHora * 1.5); 
    }

    void imprimirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Jornada Mensal: " + jornadaMensal + " horas");
        System.out.println("Salário: R$" + salario);
    }
}