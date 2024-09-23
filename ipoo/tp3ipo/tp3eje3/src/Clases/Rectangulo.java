package Clases;

public class Rectangulo extends Figura{
    private double lado;
    private double base;

    public Rectangulo(int y, int x, double lado, double base) {
        super(y, x);
        this.lado = lado;
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return getBase() * getLado();
    }
}
