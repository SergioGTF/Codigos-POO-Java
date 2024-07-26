class caderno extends produto {
    int numPaginas;
    
    caderno(double preco, String marca, int numPaginas) {
        super(preco, marca);
        this.numPaginas = numPaginas;
    }
    
    @Override
    void imprimirInfo() {
        super.imprimirInfo(); // Chama o método da superclasse para imprimir informações gerais do produto
        System.out.println("Número de Páginas: " + numPaginas);
    }
}