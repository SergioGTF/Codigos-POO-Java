import java.util.Random;

public class ALD {
    static char[][] matriz;
    static int maxGotas;
    static int gotasCriadas;
    static int gotasAtivas;

    public static void main(String[] args) {
        int comprimento = 10; 
        int altura = 10;      
        maxGotas = 50;         
        gotasAtivas = 0;
        gotasCriadas = 0;

        inicializarMatriz(comprimento, altura);
        adicionarSementes(comprimento, altura);

        while (gotasCriadas < maxGotas && gotasAtivas > 0) {
            moverGotas(comprimento, altura);
        }
        exibirMatriz();
    }

    static void inicializarMatriz(int comprimento, int altura) {
        matriz = new char[altura][comprimento];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < comprimento; j++) {
                matriz[i][j] = '.';
            }
        }
    }

    static void adicionarSementes(int comprimento, int altura) {
        int sementes = comprimento / 10; 
        int dist = comprimento / (sementes + 1);
        for (int i = 1; i <= sementes; i++) {
            matriz[altura - 1][i * dist] = 'S';
        }
    }

    static void moverGotas(int comprimento, int altura) {
        Random random = new Random();
        int x = random.nextInt(comprimento);
        int y = 0;
        gotasCriadas++;
        gotasAtivas++;

        while (y < altura) {
            int direcao = random.nextInt(4);

            switch (direcao) {
                case 0: 
                    if (y > 0) y--;
                    break;
                case 1: 
                    if (y < altura - 1) y++;
                    break;
                case 2: 
                    if (x > 0) x--;
                    break;
                case 3: 
                    if (x < comprimento - 1) x++;
                    break;
            }

            if (matriz[y][x] == 'S') {
                matriz[y][x] = 'S';
                gotasAtivas--;
                break;
            }

            if (y == altura - 1) { 
                gotasAtivas--;
                break;
            }
        }
    }

    static void exibirMatriz() {
        for (char[] linha : matriz) {
            for (char celula : linha) {
                System.out.print(celula + " ");
            }
            System.out.println();
        }
    }
}
