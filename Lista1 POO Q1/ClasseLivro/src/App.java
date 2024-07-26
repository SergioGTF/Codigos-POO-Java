public class App {
    public static void main(String[] args) throws Exception {
        // Classe Livro

        class Livro {
            private String titulo;
            private String autor;
            private int anoPublicacao;

            public Livro(String titulo, String autor, int anoPublicacao) {
                this.titulo = titulo;
                this.autor = autor;
                this.anoPublicacao = anoPublicacao;
            }

            // Getters
            public String getTitulo() {
                return titulo;
            }

            public String getAutor() {
                return autor;
            }

            public int getAnoPublicacao() {
                return anoPublicacao;
            }
        }
    }
}
