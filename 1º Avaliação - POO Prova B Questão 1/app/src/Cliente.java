import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Venda> historicoCompras;

    public Cliente(String nome) {
        this.nome = nome;
        this.historicoCompras = new ArrayList<>();
    }

    public void adicionarCompra(Venda venda) {
        historicoCompras.add(venda);
    }

    public void exibirHistoricoCompras() {
        System.out.println("Histórico de Compras de " + nome + ":");
        for (Venda venda : historicoCompras) {
            System.out.println(venda);
        }
    }

    @Override
    public String toString() {
        return "Cliente: " + nome;
    }
}

