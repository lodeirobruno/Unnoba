package Clases;

import java.util.Date;

public class Vehiculo implements Frecuencia{
    private int millas;
    private Date ultimoViaje;

    public Vehiculo(int millas, Date ultimoViaje) {
        setMillas(millas);
        setUltimoViaje(ultimoViaje);
    }

    public int getMillas() {
        return millas;
    }

    public void setMillas(int millas) {
        this.millas = millas;
    }

    public Date getUltimoViaje() {
        return ultimoViaje;
    }

    public void setUltimoViaje(Date ultimoViaje) {
        this.ultimoViaje = ultimoViaje;
    }

    @Override
    public int millas() {
        return getMillas();
    }

    @Override
    public Date ultimoViaje() {
        return getUltimoViaje();
    }
}
