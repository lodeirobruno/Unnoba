package clases;

import java.util.Date;
public class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(Persona titular, int saldo, Date fechaApertura, int limiteMinimo){
        super(titular,saldo,fechaApertura,-150);
    }

    public void extraer(int x){
        if(getSaldo()-x  > getLimiteMinimo()){
            setSaldo(getSaldo()-x);
            getTransaccion().add(new Transacciones(new Date(),x,"extraccion"));
        }

    };
}
