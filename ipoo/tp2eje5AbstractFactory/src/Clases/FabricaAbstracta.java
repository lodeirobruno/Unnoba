package Clases;

import java.util.Objects;

public abstract class FabricaAbstracta {
    private String nombre;
    public FabricaAbstracta() {
    }
    public FabricaAbstracta(String nombre) {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FabricaAbstracta that = (FabricaAbstracta) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }

    @Override
    public String toString() {
        return "FabricaAbstracta{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
    public abstract Silla crearSilla();
    public abstract Sofa crearSofa();
    public abstract Mesita crearMesita();

}
