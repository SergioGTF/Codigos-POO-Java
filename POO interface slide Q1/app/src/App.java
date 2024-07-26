public class App {
    public static void main(String[] args) {
        Veiculo veiculo;

        int opcao = 1; 

        if (opcao == 1) {
            veiculo = new Carro();
        } else if (opcao == 2) {
            veiculo = new Moto();
        } else {
            veiculo = new Bicicleta();
        }

        System.out.println("Velocidade máxima: " + veiculo.obterVelocidadeMaxima());
        veiculo.acelerar();
        System.out.println("Velocidade após acelerar: " + veiculo.getVelocidade());
        veiculo.frear();
        System.out.println("Velocidade após frear: " + veiculo.getVelocidade());
    }
}
