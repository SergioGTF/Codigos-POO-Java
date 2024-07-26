public class App {
    public static void main(String[] args) {
        Homem pessoa = new Homem("Sergio", 19, "Engenheiro da Computação");
        Cachorro cachorro = new Cachorro("Destruidor de Mundos", "Pincher", 4);
        BeijaFlor beijaFlor = new BeijaFlor("Florzinha", "vermelho");

        pessoa.trabalhar(); 
        cachorro.latir(); 
        beijaFlor.voar(); 

        pessoa.dormir(); 
        cachorro.dormir(); 
        beijaFlor.dormir(); 
    }
}
