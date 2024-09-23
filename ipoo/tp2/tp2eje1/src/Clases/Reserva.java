package Clases;

import java.util.ArrayList;
import java.util.Date;

public abstract class Reserva {
    private Cliente cliente;
    private Date fecha;


    public Reserva(Cliente cliente) {
        setCliente(cliente);
        setFecha(new Date());

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public abstract double realizarDescuento();
    public abstract double valorReserva();
    public abstract int cantplatos();
}
