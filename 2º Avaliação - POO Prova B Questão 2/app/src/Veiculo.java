public abstract class Veiculo {
    protected String placa;
    protected String modelo;
    protected double valorDiaria;

    public Veiculo(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Modelo: " + modelo + ", Valor da Diária: " + valorDiaria;
    }
}

