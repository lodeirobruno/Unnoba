package Clases;

public class Suma extends OperacionMultiple{
    public Suma(Operacion izquierda, Operacion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public double calcular() {
        return getIzquierda().calcular() + getDerecha().calcular();
    }
}
