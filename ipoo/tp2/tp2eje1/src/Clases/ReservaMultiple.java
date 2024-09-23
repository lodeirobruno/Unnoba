package Clases;

import java.util.ArrayList;
import java.util.Date;

public class ReservaMultiple extends Reserva {
    private ArrayList<Plato> plato = new ArrayList<Plato>();

    public ReservaMultiple(Cliente cliente, ArrayList<Plato> plato) {
        super(cliente);
        setPlato(plato);
    }

    public ArrayList<Plato> getPlato() {
        return plato;
    }

    public void setPlato(ArrayList<Plato> plato) {
        this.plato = plato;
    }
    public double realizarDescuento(){
        return 0.95;

    }
    public double valorReserva(){
        double suma = 0;
        for(Plato plato1 : plato){
            suma += plato1.getPrecio() * getCliente().getDescuento();
        }
        return suma * realizarDescuento();
    }

    @Override
    public int cantplatos() {
     return plato.size();
    }
}
