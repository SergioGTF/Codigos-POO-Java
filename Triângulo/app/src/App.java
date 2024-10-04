class Triangulo {
    private double ladoA, ladoB, ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public boolean eh_reto() {
        double hipotenusa = Math.max(ladoA, Math.max(ladoB, ladoC));
        double cateto1 = ladoA == hipotenusa ? ladoB : ladoA;
        double cateto2 = ladoC == hipotenusa ? ladoB : ladoC;
        return Math.pow(hipotenusa, 2) == (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public boolean eh_escaleno() {
        return ladoA != ladoB && ladoB != ladoC && ladoA != ladoC;
    }

    public boolean eh_isosceles() {
        return (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) && !eh_equilatero();
    }

    public boolean eh_equilatero() {
        return ladoA == ladoB && ladoB == ladoC;
    }
}

class App {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(3, 4, 5);  
        Triangulo t2 = new Triangulo(5, 5, 5);  

        System.out.println("t1 é reto? " + t1.eh_reto());
        System.out.println("t1 é escaleno? " + t1.eh_escaleno());
        System.out.println("t1 é isósceles? " + t1.eh_isosceles());
        System.out.println("t1 é equilátero? " + t1.eh_equilatero());

        System.out.println("t2 é equilátero? " + t2.eh_equilatero());
    }
}
