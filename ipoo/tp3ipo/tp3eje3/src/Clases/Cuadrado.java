package Clases;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(int y, int x, double lado) {
        super(y, x);
        setLado(lado);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return getLado()*getLado();
    }

}
