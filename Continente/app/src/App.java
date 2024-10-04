import java.util.ArrayList;

class Pais {
    private String nome;
    private double populacao;
    private double dimensaoTerritorial;

    public Pais(String nome, double populacao, double dimensaoTerritorial) {
        this.nome = nome;
        this.populacao = populacao;
        this.dimensaoTerritorial = dimensaoTerritorial;
    }

    public String getNome() {
        return nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public double getDimensaoTerritorial() {
        return dimensaoTerritorial;
    }
}

class Continente {
    private String nome;
    private ArrayList<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public double dimensaoTotal() {
        double totalDimensao = 0;
        for (Pais p : paises) {
            totalDimensao += p.getDimensaoTerritorial();
        }
        return totalDimensao;
    }

    public double populacaoTotal() {
        double totalPopulacao = 0;
        for (Pais p : paises) {
            totalPopulacao += p.getPopulacao();
        }
        return totalPopulacao;
    }

    public double densidadePopulacional() {
        return populacaoTotal() / dimensaoTotal();
    }

    public Pais maiorPopulacao() {
        Pais maior = null;
        for (Pais p : paises) {
            if (maior == null || p.getPopulacao() > maior.getPopulacao()) {
                maior = p;
            }
        }
        return maior;
    }

    public Pais menorPopulacao() {
        Pais menor = null;
        for (Pais p : paises) {
            if (menor == null || p.getPopulacao() < menor.getPopulacao()) {
                menor = p;
            }
        }
        return menor;
    }

    public Pais maiorDimensao() {
        Pais maior = null;
        for (Pais p : paises) {
            if (maior == null || p.getDimensaoTerritorial() > maior.getDimensaoTerritorial()) {
                maior = p;
            }
        }
        return maior;
    }

    public Pais menorDimensao() {
        Pais menor = null;
        for (Pais p : paises) {
            if (menor == null || p.getDimensaoTerritorial() < menor.getDimensaoTerritorial()) {
                menor = p;
            }
        }
        return menor;
    }

    public double razaoTerritorial() {
        return maiorDimensao().getDimensaoTerritorial() / menorDimensao().getDimensaoTerritorial();
    }
}

// Classe de teste
public class App {
    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil", 213.0, 8.5);
        Pais argentina = new Pais("Argentina", 45.0, 2.7);
        Pais uruguai = new Pais("Uruguai", 3.5, 0.176);

        Continente americaDoSul = new Continente("América do Sul");
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(uruguai);

        System.out.println("Dimensão total do continente: " + americaDoSul.dimensaoTotal() + " milhões de km²");
        System.out.println("População total do continente: " + americaDoSul.populacaoTotal() + " milhões de habitantes");
        System.out.println("Densidade populacional: " + americaDoSul.densidadePopulacional() + " habitantes/km²");
        System.out.println("País com maior população: " + americaDoSul.maiorPopulacao().getNome());
        System.out.println("País com menor população: " + americaDoSul.menorPopulacao().getNome());
        System.out.println("País com maior dimensão territorial: " + americaDoSul.maiorDimensao().getNome());
        System.out.println("País com menor dimensão territorial: " + americaDoSul.menorDimensao().getNome());
        System.out.println("Razão territorial do maior para o menor país: " + americaDoSul.razaoTerritorial());
    }
}
