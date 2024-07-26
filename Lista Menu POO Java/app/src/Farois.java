public class Farois extends Peca {
    private String tipo;

    public Farois(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo: " + tipo;
    }
}
