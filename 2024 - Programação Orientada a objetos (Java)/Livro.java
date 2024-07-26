public class Livro {
    public String titulo;
    public int anoDeLancamento;
    public String autor;
    public int numeroDePaginas;
    Categoria categoria;

    public Livro(String titulo, int anoDeLancamento, String autor, int numeroDePaginas, Categoria categoria) {
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }


    
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void imprimirLivro(){
        System.out.println("Titulo: " + getTitulo() + ".\n" + "Ano de Lançamento: " +  getAnoDeLancamento() + ".\nA0utor: "+  getAutor() + ".\nNumero de Paginas: "+ getNumeroDePaginas() + ".\nGenero: " + getCategoria().getNome() + ".");
    }

    
}
