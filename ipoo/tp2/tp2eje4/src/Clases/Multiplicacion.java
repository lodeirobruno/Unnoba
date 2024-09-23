package Clases;


public class Multiplicacion extends OperacionMultiple {
    public Multiplicacion(Operacion izquierda, Operacion derecha) {
        super(izquierda, derecha);

    }

    @Override
    public double calcular() {
    return getIzquierda().calcular() * getDerecha().calcular();
    }
}
