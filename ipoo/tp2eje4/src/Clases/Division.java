package Clases;

public class Division extends OperacionMultiple{
    public Division(Operacion izquierda, Operacion derecha) {
        super(izquierda, derecha);
    }

    @Override
    public double calcular() {
        return getIzquierda().calcular() / getDerecha().calcular();
    }
}
