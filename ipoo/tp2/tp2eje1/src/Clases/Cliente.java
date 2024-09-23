package Clases;

import java.util.Objects;

public abstract class Cliente {
    private String nombre;
    private double descuento;

    public Cliente(String nombre, double descuento) {
        setNombre(nombre);
        setDescuento(descuento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Double.compare(descuento, cliente.descuento) == 0 && Objects.equals(nombre, cliente.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descuento);
    }
}
