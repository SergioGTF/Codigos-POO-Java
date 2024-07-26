public class App {
    public static void main(String[] args) {
        Pneu pneu = new Pneu("Pneu Cesupa", 300.0, 16);
        Bateria bateria = new Bateria("Bateria Moura", 450.0, 12);
        Farois farois = new Farois("Faróis LED", 250.0, "LED");

        System.out.println(pneu);
        System.out.println(bateria);
        System.out.println(farois);
    }
}
