package Clases;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Partido> partidos = new ArrayList<Partido>();

    public Sistema(ArrayList<Partido> partidos) {
        setPartidos(partidos);
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
    public void agregarPartido(Equipo local,Equipo visitante,Estadio estadio,int valorEntrada) {
        getPartidos().add(new Partido(local,visitante,estadio,valorEntrada));
    }
    public int cantidadTotalEspectadores(){
        int total = 0;
        for (Partido partido : getPartidos()) {
            total += partido.getEstadio().getCapacidad();
        }
        return total;
    }
    public double montoRecaudado(Partido partido){
        return partido.getEstadio().getCapacidad() * partido.getValor();
    }
    public double montoTotalRecaudado(){
        double total = 0;
        for (Partido partido : getPartidos()) {
            total += montoRecaudado(partido);
        }
        return total;
    }
    public Estadio estadioMayorCap(){
        if(!getPartidos().isEmpty()){
            Estadio mayor = getPartidos().get(0).getEstadio();
            for(Partido partido : getPartidos()){
                if(partido.getEstadio().getCapacidad() > mayor.getCapacidad()){
                    mayor = partido.getEstadio();
                }

            }
            return mayor;
        }
        return null;
    }

}