class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro() {
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
        this.ano = 0;
    }

    public Carro(String marca, String modelo, int ano) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida!");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Modelo inválido!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 1885 && ano <= 2024) { 
            this.ano = ano;
        } else {
            System.out.println("Ano inválido!");
        }
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.exibirInfo();

        Carro carro2 = new Carro("Toyota", "Corolla", 2022);
        carro2.exibirInfo();

        carro1.setMarca("Honda");
        carro1.setModelo("Civic");
        carro1.setAno(2020);
        carro1.exibirInfo();

        carro1.setAno(1800);  
        carro1.setModelo(""); 
    }
}
