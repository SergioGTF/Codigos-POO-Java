public class Carro implements Veiculo {
    private int velocidade = 0;

    @Override
    public void acelerar() {
        velocidade += 10;
    }

    @Override
    public void frear() {
        velocidade -= 5;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    @Override
    public int obterVelocidadeMaxima() {
        return 200; 
    }

    public int getVelocidade() {
        return velocidade;
    }
}
