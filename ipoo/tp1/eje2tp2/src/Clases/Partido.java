package Clases;

public class Partido {
    private Equipo equipo;
    private Equipo equipo2;
    private Estadio estadio;
    private double valor;

    public Partido(Equipo equipo, Equipo equipo2, Estadio estadio, double valor) {
        setEquipo(equipo);
        setEquipo2(equipo2);
        setEstadio(estadio);
        setValor(valor);
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
