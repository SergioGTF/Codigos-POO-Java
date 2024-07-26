public class Pneu extends Peca {
    private int aro;

    public Pneu(String nome, double preco, int aro) {
        super(nome, preco);
        this.aro = aro;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tamanho: " + aro;
    }
}
