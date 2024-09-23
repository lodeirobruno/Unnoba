package Clases;
import java.util.Date;

public abstract class Transaccion {
    private Date fecha;
    private Banco destino;
    private double monto;
    private Cliente origen;
    public Transaccion(Date fecha, Banco destino, double monto, Cliente origen) {
        setFecha(new Date());
        setDestino(destino);
        setMonto(monto);
        setOrigen(origen);

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Banco getDestino() {
        return destino;
    }

    public void setDestino(Banco destino) {
        this.destino = destino;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Cliente getOrigen() {
        return origen;
    }

    public void setOrigen(Cliente origen) {
        this.origen = origen;
    }
    public double conversion(){
        return (calcularImpuesto()*getDestino().getMoneda().getValorPrecio());
    }
    public abstract Double calcularImpuesto();
}
