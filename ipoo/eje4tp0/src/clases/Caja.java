package clases;

import java.util.Vector;

public class Caja extends Productos{
    private Vector<Simple> simples = new Vector<>();
    public Caja (Vector<Simple> simples) {
        setSimples(new Vector<Simple>());
    }

    public Vector<Simple> getSimples() {
        return simples;
    }

    public void setSimples(Vector<Simple> simples) {
        this.simples = simples;
    }


    public double valorProducto() {
        double val = 0;
        for (Simple simple : simples) {
            val += simple.valorProducto();
        }
        return val;
    }

    @Override
    public double pesoProducto() {
        double peso = 0;
        for (Simple simple : simples) {
            peso += simple.pesoProducto();
        }
        return peso;
    }
}
