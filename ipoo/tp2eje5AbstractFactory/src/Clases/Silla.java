package Clases;

public abstract class Silla {
    private String estilo;
    public Silla() {
    }

    public Silla(String estilo) {
        setEstilo(estilo);
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
