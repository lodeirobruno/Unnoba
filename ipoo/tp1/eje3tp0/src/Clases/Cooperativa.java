package Clases;

import java.util.Date;
import java.util.Vector;


public class Cooperativa {
    private Vector<Chofer> socios = new Vector<>();

    public Cooperativa() {

        setSocios(new Vector<Chofer>());
    }

    public Vector<Chofer> getSocios() {
        return socios;
    }

    public void setSocios(Vector<Chofer> socios) {
        this.socios = socios;
    }
    public void addSocio(Chofer socio) {
        getSocios().add(socio);
    }

    public Chofer realizarViaje(int cantPasajeros, float cantKms){
        for(Chofer c : getSocios()){
            if(c.cantPasajeros()> cantPasajeros ){
                c.getColectivo().setKm(c.getColectivo().getKm()+cantKms);
                c.getColectivo().setUltimoViaje(new Date());
                return c;

            }
        };
        return null;
    }
    public Colectivo mayorKilometraje(){
        if(!getSocios().isEmpty()){
            Chofer mayor = getSocios().firstElement();
            for(Chofer c : getSocios()){
                if(c.km()> mayor.km()){
                    mayor = c;

                }
            }
            return mayor.getColectivo();
        }
        return null;

    }
}
