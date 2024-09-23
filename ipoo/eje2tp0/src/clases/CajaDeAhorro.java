package clases;

import java.util.Date;
public class CajaDeAhorro extends CuentaBancaria{
    private int extraccionesMax;
    public CajaDeAhorro(Persona titular, int saldo, Date fechaApertura, int limiteMinimo){
        super(titular, saldo, fechaApertura, 10);
        setExtraccionesMax(5);
    }

    public int getExtraccionesMax() {
        return extraccionesMax;
    }

    public void setExtraccionesMax(int extraccionesMax) {
        this.extraccionesMax = extraccionesMax;
    }
    public void extraer(int x){
        if(getSaldo()-x < 10 && getExtraccionesMax()<5){
            setSaldo(getSaldo()-x);
            getTransaccion().add(new Transacciones(new Date(),x,"extraccion"));
        }
    }
}