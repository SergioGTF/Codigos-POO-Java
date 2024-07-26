class LivroLivraria extends Livro {
    private double preco;

    public LivroLivraria(String titulo, String autor, int anoPublicacao, double preco) {
        super(titulo, autor, anoPublicacao);
        this.preco = preco;
    }

    // Getter
    public double getPreco() {
        return preco;
    }
}