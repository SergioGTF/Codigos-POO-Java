public class Transacao {
    private String data;
    private double valor;
    private String tipo; // "depósito", "saque", "transferência"

    public Transacao(String data, double valor, String tipo) {
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Data: " + data + ", Valor: " + valor + ", Tipo: " + tipo;
    }
}



