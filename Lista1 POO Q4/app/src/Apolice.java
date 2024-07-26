class Apolice {
    String nomeSegurado;
    int idadeSegurado;
    double valorPremio;

    Apolice(String nomeSegurado, int idadeSegurado, double valorPremio) {
        this.nomeSegurado = nomeSegurado;
        this.idadeSegurado = idadeSegurado;
        this.valorPremio = valorPremio;
    }

    void imprimir() {
        System.out.println("Nome do Segurado: " + nomeSegurado);
        System.out.println("Idade do Segurado: " + idadeSegurado);
        System.out.println("Valor do Prêmio: R$" + valorPremio);
    }

    void calcularPremioApolice() {
        if (idadeSegurado >= 18 && idadeSegurado <= 25) {
            valorPremio += (valorPremio * 20) / 100;
        } else if (idadeSegurado > 25 && idadeSegurado <= 36) {
            valorPremio += (valorPremio * 15) / 100;
        } else if (idadeSegurado > 36) {
            valorPremio += (valorPremio * 10) / 100;
        }
    }

    void oferecerDesconto(String cidade) {
        switch (cidade) {
            case "Curitiba":
                valorPremio *= 0.8; 
                break;
            case "Rio de Janeiro":
                valorPremio *= 0.85; 
                break;
            case "São Paulo":
                valorPremio *= 0.9; 
                break;
            case "Belo Horizonte":
                valorPremio *= 0.95; 
                break;
        }
    }
}
