package Clases;

import java.util.Date;

public class Plato {
    private String nombre;
    private double precio;
    private Date fecha;
    public Plato(){}
    public Plato(String nombre, double precio) {
        setNombre(nombre);
        setPrecio(precio);
        setFecha(new Date());
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
