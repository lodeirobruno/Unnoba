package clases;

import java.util.Date;

public class Simple extends Productos{
    private String nombre;
    private Date fecha;
    private double valor;
    private double peso;
    public Simple(String nombre, Date fecha, double valor, double peso) {
        setNombre(nombre);
        setFecha(fecha);
        setValor(valor);
        setPeso(peso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double pesoProducto() {
        return getPeso();
    }


    public double valorProducto() {
        return getValor();
    }
}
