public class Moto implements Veiculo {
    private int velocidade = 0;

    @Override
    public void acelerar() {
        velocidade += 15;
    }

    @Override
    public void frear() {
        velocidade -= 8;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    @Override
    public int obterVelocidadeMaxima() {
        return 180; 
    }

    public int getVelocidade() {
        return velocidade;
    }
}
