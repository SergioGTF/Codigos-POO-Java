public class app {
    public static void main(String[] args) {
        
        futebol jogador1 = new futebol("Cristiano Ronaldo", 36, "Atacante");
        nadadores nadador1 = new nadadores("Michael Phelps", 36, "Crawl");
        fisiculturista fisiculturista1 = new fisiculturista("Chris Bumbstead", 24, 100);
        
        System.out.println("Informações do Jogador de Futebol:");
        jogador1.exibirInfoJogador();
        System.out.println();
        
        System.out.println("Informações do Nadador:");
        nadador1.exibirInfoNadador();
        System.out.println();
        
        System.out.println("Informações do Fisiculturista:");
        fisiculturista1.exibirInfoFisiculturista();
    }
}