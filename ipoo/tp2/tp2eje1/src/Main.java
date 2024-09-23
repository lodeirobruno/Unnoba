import Clases.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Plato p1 = new Plato("pollo", 1000);
        Plato p2 = new Plato("pollo", 5000);
        Plato p3 = new Plato("pollo", 1500);
        Plato p4 = new Plato("pollo", 15000);
        Plato p5 = new Plato("pollo", 1000);
        Plato p6 = new Plato("pollo", 2000);

        ArrayList<Plato> platos = new ArrayList<Plato>();
        platos.add(p2);
        platos.add(p3);
        platos.add(p4);

        Cliente c1 = new Alumno("Pedro");
        Cliente c2 = new Profesor("Muzkats");
        Cliente c3 = new Particular("Juan");

        Reserva r1 = new ReservaSimple(c1,  p1);
        Reserva r2 = new ReservaMultiple(c2,  platos);
        Reserva r3 = new ReservaSimple(c3, p5);

        ArrayList<Reserva> reservas = new ArrayList<Reserva>();
        reservas.add(r1);
        reservas.add(r2);
        reservas.add(r3);

        Comedor comedor = new Comedor(reservas );

        System.out.println(comedor.totalPlatosReservados());
        System.out.println(comedor.totalValorReservas());
        System.out.println(comedor.reservaMasPlatos());

    }
}