package Clases;

import java.util.Date;

public class ReservaSimple extends Reserva {
    private Plato plato;

    public ReservaSimple(Cliente cliente, Plato plato) {
        super(cliente);
        setPlato(plato);
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    @Override
    public double realizarDescuento() {
        return 1;
    }

    @Override
    public double valorReserva() {
        return plato.getPrecio() * getCliente().getDescuento();
    }

    @Override
    public int cantplatos() {
        return 1;
    }
}
