package Clases;

import java.util.Date;

public class Chofer implements Frecuencia {
    private Colectivo colectivo;
    public Chofer(Colectivo colectivo) {

        setColectivo(colectivo);
    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }
    public double cantPasajeros() {
        return getColectivo().getCantPasajerosMax();
    }
    public double km(){
        return getColectivo().getKm();
    }

    @Override
    public int millas() {
        return getColectivo().millas();
    }

    @Override
    public Date ultimoViaje() {
        return getColectivo().ultimoViaje();
    }
}

