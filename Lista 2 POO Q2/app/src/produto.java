class produto {
    double preco;
    String marca;
    
    produto(double preco, String marca) {
        this.preco = preco;
        this.marca = marca;
    }
    
    void imprimirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
    }
}