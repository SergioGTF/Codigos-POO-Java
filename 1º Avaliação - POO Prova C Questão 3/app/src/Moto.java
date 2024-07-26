public class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularIPVA() {
        return 0.03 * 15000; // Exemplo de cálculo: 3% de um valor hipotético de R$ 15.000
    }
}



