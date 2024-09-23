package Clases;

import java.util.Date;

public class Nacional extends Transaccion {


    public Nacional(Date fecha, Banco destino,double monto,Cliente origen) {
        super(fecha ,destino,monto, origen);
    }
    public double calcularImpuesto(){
        return (getMonto()-(getMonto()*0.03));
    }
}
