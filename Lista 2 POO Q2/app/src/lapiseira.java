class lapiseira extends produto {
    double diametroGrafite;
    
    lapiseira(double preco, String marca, double diametroGrafite) {
        super(preco, marca);
        this.diametroGrafite = diametroGrafite;
    }
    
    @Override
    void imprimirInfo() {
        super.imprimirInfo(); 
        System.out.println("Diâmetro do Grafite: " + diametroGrafite);
    }
}
