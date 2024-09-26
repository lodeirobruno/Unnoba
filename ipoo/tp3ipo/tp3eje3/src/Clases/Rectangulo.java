package Clases;

public class Rectangulo extends Figura{
    private double lado;
    private double base;
    p

    public Rectangulo(int y, int x,String nombre,String color,double lado,double base ) {
        super(y, x,nombre,color);
        this.lado = lado;
        this.base = base;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Rectangulo{" +
                "lado=" + lado +
                ", base=" + base +
                '}';
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
