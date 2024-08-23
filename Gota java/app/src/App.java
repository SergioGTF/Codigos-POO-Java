import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        /* */
        Regiao mapa = new Regiao(50, 50, 100, 3);
        Random aleatorio = new Random();

        for (Gota gota : mapa.gotas){
            gota.x = aleatorio.nextInt(mapa.tamanho);
            gota.y = aleatorio.nextInt(mapa.altura);

            System.out.println(gota + " x : " + gota + " y : ");
        }
    }
}
