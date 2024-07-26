public class Bateria extends Peca {
    private int voltagem;

    public Bateria(String nome, double preco, int voltagem) {
        super(nome, preco);
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return super.toString() + " - Voltagem: " + voltagem + "V";
    }
}
