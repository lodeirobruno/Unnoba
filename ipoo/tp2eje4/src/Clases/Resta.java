package Clases;

public class Resta extends OperacionMultiple{
    public Resta(Operacion izquierda, Operacion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public double calcular() {
        return getIzquierda().calcular() - getDerecha().calcular();
    }
}
