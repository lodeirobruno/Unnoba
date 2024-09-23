package clases;

import java.util.Date;

public class Transacciones {
    private Date fecha;
    private int monto;
    private String tipo;
    public Transacciones(Date fecha, int monto, String tipo) {
        setFecha(new Date());
        setMonto(monto);
        setTipo(tipo);

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
