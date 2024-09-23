package Clases;
import

import java.util.Date;

public class Internacional extends Transaccion{
    public Internacional(Date fecha,Banco destino,double monto,Cliente origen) {
        super(fecha,destino,monto,origen);
    }


    public double calcularImpuesto() {
        return (getMonto()-(getMonto()*0.07));
    }
}
