public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularIPVA() {
        return 0.04 * 30000; // Exemplo de cálculo: 4% de um valor hipotético de R$ 30.000
    }
}