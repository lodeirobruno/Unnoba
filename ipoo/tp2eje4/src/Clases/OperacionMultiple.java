package Clases;

public abstract class OperacionMultiple extends Operacion {
    private Operacion izquierda;
    private Operacion derecha;

    public OperacionMultiple(Operacion izquierda, Operacion derecha) {
        setDerecha(derecha);
        setIzquierda(izquierda);
    }

    public Operacion getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Operacion izquierda) {
        this.izquierda = izquierda;
    }

    public Operacion getDerecha() {
        return derecha;
    }

    public void setDerecha(Operacion derecha) {
        this.derecha = derecha;
    }
    public abstract double calcular();
}
