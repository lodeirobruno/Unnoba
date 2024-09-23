package Clases;

public abstract class Mesita {
    private String estilo;
    public Mesita() {}
    public Mesita(String estilo) {
        setEstilo(estilo);
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
