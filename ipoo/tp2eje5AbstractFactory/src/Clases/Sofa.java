package Clases;

public abstract class Sofa {
    private String estilo;
    public Sofa(){

    }

    public Sofa(String estilo) {
        setEstilo(estilo);
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
