class Caneta {
        String marca;
        String cor;
        double tamanho;
    
        Caneta(String marca, String cor, double tamanho) {
            this.marca = marca;
            this.cor = cor;
            this.tamanho = tamanho;
        }
    
        // Getters e Setters
        public String getMarca() {
            return marca;
        }
    
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
        public String getCor() {
            return cor;
        }
    
        public void setCor(String cor) {
            this.cor = cor;
        }
    
        public double getTamanho() {
            return tamanho;
        }
    
        public void setTamanho(double tamanho) {
            this.tamanho = tamanho;
        }
    
        @Override
        public String toString() {
            return "Caneta [marca=" + marca + ", cor=" + cor + ", tamanho=" + tamanho + "]";
        }
    }

