package Clases;

import java.util.Objects;

public class ReproductorMultimedia implements VideoClip{
    private String nombre;
    public ReproductorMultimedia() {
    }
    public ReproductorMultimedia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "ReproductorMultimedia{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReproductorMultimedia that = (ReproductorMultimedia) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void play(){
        setNombre("playing"+ getNombre());
        System.out.println(toString());
    }
    public void stop(){
        setNombre("stopping"+ getNombre());
        System.out.println(toString());
    }

    @Override
    public void bucle() {
        setNombre("bucle"+ getNombre());
        System.out.println(toString());
    }
}
