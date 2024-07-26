public class App {
    public static void main(String[] args) {
        Ingresso ingressoNormal = new Ingresso(50);
        System.out.println(ingressoNormal);

        IngressoVip ingressoVIP = new IngressoVip(100, 30);
        System.out.println(ingressoVIP);
    }
}
