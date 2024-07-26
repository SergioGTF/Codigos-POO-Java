public class Bicicleta implements Veiculo {
    private int velocidade = 0;
    
    @Override
    public void acelerar() {
        velocidade += 5;
    }
    
    @Override
    public void frear() {
        velocidade -= 3;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }
    
    @Override
    public int obterVelocidadeMaxima() {
        return 30; 
    }
    
    public int getVelocidade() {
            return velocidade;
    }
}

