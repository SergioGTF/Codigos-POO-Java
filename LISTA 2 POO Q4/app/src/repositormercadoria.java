public class repositormercadoria {
    private int jornadaMensal; 
    private double salario; 

    

    public repositormercadoria(String string, int i, double d) {
    }

    double calcularHoraExtra(int horasExtras) {
        double salarioHora = getSalario() / getJornadaMensal(); 
        return horasExtras * (salarioHora * 1.6); 
    }

    public int getJornadaMensal() {
        return jornadaMensal;
    }

    public double getSalario() {
        return salario;
    }

    public void imprimirFicha() {
        throw new UnsupportedOperationException("Unimplemented method 'imprimirFicha'");
    }
}
