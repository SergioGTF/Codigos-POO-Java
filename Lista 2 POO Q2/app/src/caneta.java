class caneta extends produto {
    String corTinta;
    
    caneta(double preco, String marca, String corTinta) {
        super(preco, marca);
        this.corTinta = corTinta;
    }
    
    @Override
    void imprimirInfo() {
        super.imprimirInfo(); // Chama o método da superclasse para imprimir informações gerais do produto
        System.out.println("Cor da Tinta: " + corTinta);
    }
}