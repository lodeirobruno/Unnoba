package Clases;

import java.util.ArrayList;

public class Comedor {
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();


    public Comedor(ArrayList<Reserva> reservas) {
        setReservas(reservas);
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    public void agregarReserva(Cliente cliente, Plato plato) {
        getReservas().add(new ReservaSimple(cliente ,plato));
    }
    public void agregarReservas(Cliente cliente ,ArrayList<Plato> platos) {
        getReservas().add(new ReservaMultiple(cliente ,platos));
    }
    public double valorReservaa(Reserva reserva) {
        return reserva.valorReserva();
    }
    public int totalPlatosReservados(){
        int total = 0;
        for(Reserva reserva : getReservas()) {
            total += reserva.cantplatos();
        }
        return total;
    }
    public double totalValorReservas(){
        double total = 0;
        for(Reserva reserva : getReservas()) {
            total += reserva.valorReserva();

        }
        return total;
    }
    public Reserva reservaMasPlatos() {
        if (!getReservas().isEmpty()) {
            Reserva mayor = getReservas().get(0);
            for (Reserva reserva : getReservas()) {
                if (reserva.cantplatos() > mayor.cantplatos()) {
                    mayor = reserva;
                }

            }
            return mayor;
        }
        return null;
    }
}
