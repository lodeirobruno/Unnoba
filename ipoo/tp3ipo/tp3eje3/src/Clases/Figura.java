package Clases;


import java.util.Objects;

public abstract class Figura implements FiguraGeometrica{
    private int y;
    private int x;
    private String nombre;
    private String color;

    public Figura(int y, int x, String nombre, String color) {
        setY(y);
        setX(x);
        setNombre(nombre);
        setColor(color);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figura figura = (Figura) o;
        return y == figura.y && x == figura.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }

    public Figura(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public abstract double calcularArea();
    public void mover(int valor,Direcciones direcciones){
        switch (direcciones){
            case sur:
                setY(getY()-valor);
                break;
            case norte:
                setY(getY()+valor);
                break;
            case este:
                setX(getX()+valor);
                break;
            case oeste:
                setX(getX()-valor);
                break;
        }
    };
}
