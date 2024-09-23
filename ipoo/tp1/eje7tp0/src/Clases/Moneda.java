package Clases;

public class Moneda {
    private String nombre;
    private double valorPrecio;
    public Moneda(String nombre, double valorPrecio) {
        setNombre(nombre);
        setValorPrecio(valorPrecio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValorPrecio() {
        return valorPrecio;
    }

    public void setValorPrecio(double valorPrecio) {
        this.valorPrecio = valorPrecio;
    }
}
