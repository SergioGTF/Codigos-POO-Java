public class App { 
    public static void main(String[] args) throws Exception {
        pessoa[] sala = new pessoa[7]; // 5 passageiros + 2 tripulantes
        
        sala[0] = new passageiro("Passageiro 1", 1001);
        sala[1] = new passageiro("Passageiro 2", 1002);
        sala[2] = new passageiro("Passageiro 3", 1003);
        sala[3] = new passageiro("Passageiro 4", 1004);
        sala[4] = new passageiro("Passageiro 5", 1005);
        
        sala[5] = new tripulante("Tripulante 1", "Garçom", 2001);
        sala[6] = new tripulante("Tripulante 2", "Camareiro", 2002);
        
        for (pessoa pessoa : sala) {
            pessoa.exibirInfo();
            System.out.println();
        }
    }
}
