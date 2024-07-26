public class LivroBiblioteca {
    class LivroBiblioteca extends Livro {
        private boolean disponivel;
    
        public LivroBiblioteca(String titulo, String autor, int anoPublicacao, boolean disponivel) {
            super(titulo, autor, anoPublicacao);
            this.disponivel = disponivel;
        }
    
        // Getter
        public boolean isDisponivel() {
            return disponivel;
        }
    }
    
}
