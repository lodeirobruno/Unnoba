package Clases;

import java.util.Date;

public class Colectivo implements  Frecuencia{

    private String patente;
    private String modelo;
    private double km;
    private int cantPasajerosMax;
    private Date ultimoViaje;


    public Colectivo( String patente, String modelo, double km,int cantPasajerosMax) {
        setModelo(modelo);
        setPatente(patente);

        setKm(km);
        setCantPasajerosMax(cantPasajerosMax);
    }


    public Date getUltimoViaje() {
        return ultimoViaje;
    }

    public void setUltimoViaje(Date ultimoViaje) {
        this.ultimoViaje = ultimoViaje;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public int getCantPasajerosMax() {
        return cantPasajerosMax;
    }

    public void setCantPasajerosMax(int cantPasajerosMax) {
        this.cantPasajerosMax = cantPasajerosMax;
    }

    @Override
    public int millas() {
        return (int)(getKm()*0.6);
    }

    @Override
    public Date ultimoViaje() {
        return getUltimoViaje();
    }
}
