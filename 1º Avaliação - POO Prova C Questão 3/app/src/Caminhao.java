public class Caminhao extends Veiculo {
    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularIPVA() {
        return 0.02 * 80000; // Exemplo de cálculo: 2% de um valor hipotético de R$ 80.000
    }
}
