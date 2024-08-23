
import java.util.ArrayList;

public class Regiao extends App{
    public int tamanho;
    public int altura;
    public int quantidadetotalgotas;

    public int[][] regiao;

    public ArrayList<Gota> gotas = new ArrayList<Gota>();

    public Regiao(int tamanho, int altura, int quantidadetotalgotas, int gotas) {
        this.tamanho = tamanho;
        this.altura = altura;
        this.quantidadetotalgotas = quantidadetotalgotas;
        this.regiao = new int[tamanho][altura];
        for (int i = 0; i< 0; i++){
            this.gotas.add(new Gota());
        }
    }
}