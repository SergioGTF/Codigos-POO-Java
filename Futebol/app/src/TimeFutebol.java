import java.util.ArrayList;
import java.util.Date;

class Jogador {
    private String nome;
    private String posicao;
    private int golsMarcados;
    private int partidasJogadas;

    public Jogador(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
        this.golsMarcados = 0;
        this.partidasJogadas = 0;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void adicionarGols(int gols) {
        this.golsMarcados += gols;
    }

    public int getPartidasJogadas() {
        return partidasJogadas;
    }

    public void incrementarPartidasJogadas() {
        this.partidasJogadas++;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Posição: " + posicao + ", Gols: " + golsMarcados + ", Partidas Jogadas: " + partidasJogadas;
    }
}

class Partida {
    private String oponente;
    private int placarTime;
    private int placarOponente;
    private Date data;

    public Partida(String oponente, int placarTime, int placarOponente, Date data) {
        this.oponente = oponente;
        this.placarTime = placarTime;
        this.placarOponente = placarOponente;
        this.data = data;
    }

    public int getPlacarTime() {
        return placarTime;
    }

    public int getPlacarOponente() {
        return placarOponente;
    }

    public String getResultado() {
        if (placarTime > placarOponente) {
            return "Vitória";
        } else if (placarTime == placarOponente) {
            return "Empate";
        } else {
            return "Derrota";
        }
    }
}

public class TimeFutebol {
    private String nome;
    private String tecnico;
    private ArrayList<Jogador> jogadores;
    private ArrayList<Partida> historicoPartidas;

    public TimeFutebol(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
        this.historicoPartidas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removerJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }

    public void registrarPartida(String oponente, int placarTime, int placarOponente, Date data) {
        Partida partida = new Partida(oponente, placarTime, placarOponente, data);
        historicoPartidas.add(partida);

        for (Jogador jogador : jogadores) {
            jogador.incrementarPartidasJogadas();
        }
    }

    public String estatisticas() {
        int vitorias = 0, empates = 0, derrotas = 0;

        for (Partida partida : historicoPartidas) {
            switch (partida.getResultado()) {
                case "Vitória":
                    vitorias++;
                    break;
                case "Empate":
                    empates++;
                    break;
                case "Derrota":
                    derrotas++;
                    break;
            }
        }
        return "Vitórias: " + vitorias + ", Empates: " + empates + ", Derrotas: " + derrotas;
    }

    public Jogador getArtilheiro() {
        Jogador artilheiro = null;
        for (Jogador jogador : jogadores) {
            if (artilheiro == null || jogador.getGolsMarcados() > artilheiro.getGolsMarcados()) {
                artilheiro = jogador;
            }
        }
        return artilheiro;
    }

    public Jogador getJogadorComMaisPartidas() {
        Jogador jogadorMaisPartidas = null;
        for (Jogador jogador : jogadores) {
            if (jogadorMaisPartidas == null || jogador.getPartidasJogadas() > jogadorMaisPartidas.getPartidasJogadas()) {
                jogadorMaisPartidas = jogador;
            }
        }
        return jogadorMaisPartidas;
    }

    public void exibirJogadores() {
        System.out.println("Lista de Jogadores do Time " + nome + ":");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

    public static void main(String[] args) {
        TimeFutebol time = new TimeFutebol("Flamengo", "Jorge Jesus");

        Jogador jogador1 = new Jogador("Gabigol", "Atacante");
        Jogador jogador2 = new Jogador("Arrascaeta", "Meio-campo");
        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);

        time.registrarPartida("Vasco", 2, 1, new Date());

        time.exibirJogadores();

        System.out.println(time.estatisticas());

        System.out.println("Artilheiro: " + time.getArtilheiro().getNome());

        System.out.println("Jogador com mais partidas: " + time.getJogadorComMaisPartidas().getNome());
    }
}
