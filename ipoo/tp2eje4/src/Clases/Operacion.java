package Clases;

public abstract class Operacion {

    public Operacion() {
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Operacion{}";
    }
    public abstract double calcular();
}
