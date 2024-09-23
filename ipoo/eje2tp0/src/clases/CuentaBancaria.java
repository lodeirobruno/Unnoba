package clases;

import java.util.Date;
import java.util.Vector;

public abstract class CuentaBancaria {
    private int saldo;
    private Persona titular;
    private int limiteMinimo;
    private Date fechaApertura;
    private Vector<Transacciones> transaccion= new Vector<>();
    public CuentaBancaria(Persona titular, int saldo, Date fechaApertura, int limiteMinimo) {
        this.titular = titular;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.limiteMinimo = limiteMinimo;

    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getLimiteMinimo() {
        return limiteMinimo;
    }

    public void setLimiteMinimo(int limiteMinimo) {
        this.limiteMinimo = limiteMinimo;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Vector<Transacciones> getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Vector<Transacciones> transaccion) {
        this.transaccion = transaccion;
    }
    public abstract void extraer(int monto);
}